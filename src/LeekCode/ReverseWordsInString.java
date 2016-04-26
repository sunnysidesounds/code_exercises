package LeekCode;

public class ReverseWordsInString {


    public static void main(String[] args){
        String s = " the sky is blue ";

         System.out.println(reverseWords(s));

    }


    public static String reverseWords(String s){
        String r = s.trim();
        char[] str = r.toCharArray();
        StringBuilder reversed = new StringBuilder();
        int end = str.length-1;


        for(int i = str.length-1; i>=0; i--){
            char c = str[i];

            if(c == ' '){
                end = i;

                System.out.println("end " + end);

            } else if (r.charAt(i-1) == ' '){
                reversed.append(r.substring(i, end));




                reversed.append(" ");





            }








            System.out.println(c);




        }
        return reversed.toString();






    }




}
