package String;

import java.util.*;

public class SplitStringIntoArray {

    // Google question
   public static void main(String[] args){



       String str = "this is \"three words\"";
       ArrayList<String> resultsArray = new ArrayList<String>();
       int start = 0;
       int end = 0;
       boolean isQuotes = false;

       for(int i = 0; i < str.length() -2; i++){
           char s = str.charAt(i);
           if(s == ' '){
               if(str.charAt(i+1) == '"'){
                   start = i + 2;
                   isQuotes = true;
               } else {
                   if(!isQuotes){
                       end = i - 1;
                       resultsArray.add(str.substring(start, end));
                       start = i;
                   }
               }
           } else if (str.charAt(i) == '"') {
               if(isQuotes){
                   end = i - 1;
                   resultsArray.add(str.substring(start, end));
                   start = i;
                   isQuotes = false;
               }

           }

       }
       if(isQuotes){
           resultsArray.add(str.substring(start, str.length()-1));
       }





        System.out.println(resultsArray);

   }




}
