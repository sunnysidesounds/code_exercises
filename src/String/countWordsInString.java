package String;

/*
Count number of words in a string.
 */

public class countWordsInString {

    public static void main(String[] args){
        String s = "We are going to count the number of words in a string!"; //12

        int len = s.length();
        int wordCount = 0;
        boolean word = false;
        int endOfWord = len-1;

        for(int i = 0; i < len; i++){
            if(Character.isLetter(s.charAt(i)) && i != endOfWord){
                word = true;
            } else if (!Character.isLetter(s.charAt(i)) && word){
                wordCount++;
                word = false;

            } else if (Character.isLetter(s.charAt(i)) && i == endOfWord){
                wordCount++;
            }
        }
        System.out.println("Word count is: " + wordCount);
    }
}
