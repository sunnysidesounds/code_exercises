package String;

/*
Reversing a string in place without using any extra memory
 */

public class reverseStringInPlace {

    public static void main(String[] args){
        String s = "This is a string reversed";
        String newString = "";
        int len = s.length();
        for(int i = 0, k=len-1; i <= len-1 && k >= 0; i++, k-- ){
            newString += s.charAt(k);
        }

        System.out.println("Original String:  " + s);
        System.out.println("Reversed String:  " + newString);

    }


}
