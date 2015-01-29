package String;

/*
Write code to check a String is palindrome or not? (Recursively / Iteratively)
 */

public class isPalindrone {

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is Palindrone (Recursively): " + isAPalindroneRecurively(s));
        System.out.println("Is Palindrone (Iteratively): " + isAPalindroneIteratively(s));

        System.out.println("Is Palindrone (version 2): " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int len = s.length();
        StringBuilder string = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        if(len < 2){
            return true;
        }

        char[] stringArray = s.toCharArray();
        for(int i = 0, j = len-1; i<=len-1 && j>=0; i++, j--){
            if(Character.isLetterOrDigit(stringArray[i])){
                string.append(stringArray[i]);
            }

            if(Character.isLetterOrDigit(stringArray[j])){
                reverse.append(stringArray[j]);
            }
        }

        if(string.toString().toLowerCase().equals(reverse.toString().toLowerCase())){
            return true;
        }
        return false;
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
