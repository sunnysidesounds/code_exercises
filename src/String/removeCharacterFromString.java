package String;

/*
Write a method which will remove any given character from a String?
 */

public class removeCharacterFromString {

    public static void main(String[] args){
      String s = "This is the song that never ends";
      char c = 'e';

      System.out.println("Removing character (Iteratively): " + c + " from: " + removeCharacters1(c, s));
        System.out.println("Removing character (Using replace): " + c + " from: " + removeCharacters2(c, s));
    }

    public static String removeCharacters1(char c, String s){
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++){
            if(s.charAt(i) != c){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeCharacters2(char c, String s){
        return s.replace(c, '\0');
    }






}
