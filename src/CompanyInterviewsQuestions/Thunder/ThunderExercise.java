// Exercise Requirements based off : https://gist.github.com/ktilcu/ef1d416279e453389c5d4cf1e6fb708b


import java.net.URL;
import java.io.*;
import java.util.*;

// Using Codehaus Jackson's library for JSON manipulation
// Source : https://github.com/codehaus/jackson
// Jar : http://www.java2s.com/Code/JarDownload/jackson-all/jackson-all-1.9.0.jar.zip
import org.codehaus.jackson.*;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.node.*;


public class ThunderExercise {

    public String url;
    public JsonNode json;
    public HashMap<String, JsonNode> assetsMap;
    public ArrayList<JsonNode> widgetsArray;
    public ArrayList<JsonNode> results;



    public static void main(String[] args){

        String url = "http://localhost:8082/json/creativefamily.json"; // <-- Change me
        ThunderExercise thunder = new ThunderExercise(url);
        /* Upon Instantiation :
            - Make and get the response for json
            - Build a assets map
            - Build a widgets array
            - Init the results array
         */

        /* By calling flattenWidgets
            - Iterator over widgets array merging in properties from the assets map
         */
        System.out.println(thunder.flattenWidgets());

    }

    /**
     * Constructor : Sets up our assets map and our widgets array.
     * @param url String url to retrieve your JSON
     */
    public ThunderExercise(String url){
        this.url = url;
        // Get json response
        this.sendRequestCaptureResponse();

        // Build an assets map.
        if(this.json.path("assets") != null){
            this.buildMap(this.json.path("assets"));
        } else {
            throw new RuntimeException("There is no assets JSON node");
        }
        // Build our widgets array
        this.widgetsArray = new ArrayList<JsonNode>();
        if(this.json != null) {
            this.buildWidgetArray(this.json);
        } else {
            throw new RuntimeException("There is no JSON to build the widgets array");
        }
        this.results = new ArrayList<JsonNode>();

        // For debugging
        //System.out.println("Assets Map : " + this.assetsMap);
        //System.out.println("Widgets Array : " + this.widgetsArray);


    }

    public ArrayList<JsonNode> flattenWidgets(){
        if(this.widgetsArray.size() > 0){
          for(JsonNode widget : this.widgetsArray){
              String uuid = widget.get("uuid").asText();
              if(widget.get("asset-uuid") != null){
                  String assetUUID = widget.get("asset-uuid").asText();
                  if(this.assetsMap.containsKey(assetUUID)){
                      this.mergeNodes(widget, this.assetsMap.get(assetUUID));
                  } else {
                    System.out.println(" ERROR : asset-uuid "+assetUUID+" does not exist for uuid : " + uuid );
                  }
              } else {
                  System.out.println(" ERROR : Widget "+uuid+" does not have asset-uuid " + widget);
              }
          }
        } else {
            throw new RuntimeException("Widgets array is empty");
        }
          return this.results;
    }

    /**
     * This merges two JsonNodes (specifically widgets and assets nodes)
     * @param widgets JsonNode of widgets
     * @param assets JsonNode of assets
     */
    private void mergeNodes(JsonNode widgets, JsonNode assets){
        ObjectMapper mapper = new ObjectMapper();
        // Create a copy of the assets JsonNode, so we can manipulate it without causing harm to this.assetsMap
        JsonNode tmpAssets = mapper.valueToTree(assets);
        ObjectNode newNode = mapper.createObjectNode();

        Iterator<Map.Entry<String, JsonNode>> widgetFlds = widgets.getFields();
        while(widgetFlds.hasNext()){
            Map.Entry<String, JsonNode> widgetFld = widgetFlds.next();
            String key = widgetFld.getKey();
            JsonNode value = widgetFld.getValue();
            // Check if key is in tmpAssets
            boolean keyExists = tmpAssets.get(key) != null;
            // If in tmpAssets, remove the key from tmpAssets.
            if(keyExists){
                ((ObjectNode) tmpAssets).remove(key);
            }
            // Add it to the newNode
            newNode.put(key, value);
        }

        // Now iterate over tmpAssets, as we've removed duplicates by reference widgets nodes
        Iterator<Map.Entry<String, JsonNode>> assetsFlds = tmpAssets.getFields();
        while(assetsFlds.hasNext()){
            Map.Entry<String, JsonNode> assetsFld = assetsFlds.next();
            String key = assetsFld.getKey();
            JsonNode value = assetsFld.getValue();
            newNode.put(key, value);
        }
        // Add the newly created merged node into the results array.
        this.results.add(newNode);
    }



    /**
     * Recurively find all out widgets and add them to our widgets array.
     * @param node JsonNode
     */
    private void buildWidgetArray(JsonNode node) {
       Iterator<Map.Entry<String, JsonNode>> fieldsIterator = node.getFields();
       while (fieldsIterator.hasNext()) {
            Map.Entry<String, JsonNode> field = fieldsIterator.next();
            final String key = field.getKey();
            JsonNode value = field.getValue();
            if(key.equals("widgets")){
                // Get find all widget nodes an add it to the widgetsArray
                this.addNodesToList(value);
            }
            if (value.isContainerNode()) {
                if(value.isArray() && value.size() > 0){
                    for(int i = 0; i < value.size(); i++){
                        JsonNode arValue = value.get(i);
                        this.buildWidgetArray(arValue);
                    }
                }
                this.buildWidgetArray(value);
            }
        }
    }

    /**
     * Add JsonNodes to our widget array
     * @param nodesArray JsonNode array
     */
    private void addNodesToList(JsonNode nodesArray){
        if (nodesArray.isArray()) {
            for (final JsonNode objNode : nodesArray) {
                this.widgetsArray.add(objNode);
            }
        }
    }

    /**
     * This builds an assets maps with property key / pairs pairs
     * Example Map Entry uuid = {text=foobar, color=#000}
     */
    private void buildMap(JsonNode path){
        HashMap<String, JsonNode> parent = new HashMap<String, JsonNode>();
        JsonNode node = path;
        Iterator<JsonNode> parentIterator = node.getElements();
        while(parentIterator.hasNext()){
            JsonNode parentNode = parentIterator.next();
            String uuid = "";
            Iterator<Map.Entry<String,JsonNode>> childIterator = ((ObjectNode)parentNode).getFields();
            while(childIterator.hasNext()){
                Map.Entry<String,JsonNode> childNode = childIterator.next();
                if(childNode.getKey().equals("uuid")){
                      uuid = childNode.getValue().asText();
                }
            }
            parent.put(uuid, parentNode);

        }
        this.assetsMap = parent;
    }

    /**
     * Sends a HTTP requests, captures the responses and converts string response into JsonNode object.
     */
    private void sendRequestCaptureResponse(){

        try {
            URL url = new URL(this.url);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder st = new StringBuilder();
            String line;
            while (null != (line = br.readLine())) {
                st.append(line);
            }

            ObjectMapper mapper = new ObjectMapper();
            this.json = mapper.readTree(st.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
