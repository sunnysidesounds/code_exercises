package String;

/*
Write code to check a String is palindrome or not? (Recursively / Iteratively)
 */

public class isPalindrone {

    public static void main(String[] args){
        String s = "abcdcba";
        System.out.println("Is Palindrone (Recursively): " + isAPalindroneRecurively(s));
        System.out.println("Is Palindrone (Iteratively): " + isAPalindroneIteratively(s));
    }

    public static boolean isAPalindroneRecurively(String s ){
        int len = s.length();
        if(len < 2){
            return true;
        }

        for(int i = 0; i < len; i++){
            if(s.charAt(0) == s.charAt(len-1)){
                return isAPalindroneRecurively(s.substring(1, len - 1));
            }
        }
        return false;

    }

    public static boolean isAPalindroneIteratively(String s){
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = len-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }

        if(s.equals(sb.toString())){
            return true;
        }
        return false;

    }


}
