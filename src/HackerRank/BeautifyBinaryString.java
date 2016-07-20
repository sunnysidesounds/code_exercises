package HackerRank;

public class BeautifyBinaryString {


    public static void main(String[] args){
        String B = "0100101010";
        int count = 0;
        StringBuilder temp;
        while(B.contains("010")){
            int index = B.indexOf("010");
            int key = index + 3;
            if(key > B.length() -1){
                temp = new StringBuilder(B);
                temp.setCharAt(index + 1, '0');
                B = temp.toString();
            } else if (B.charAt(key) == '1'){
                temp = new StringBuilder(B);
                temp.setCharAt(index+2, '1');
                B = temp.toString();
            } else if(B.charAt(key) == '0'){
                temp = new StringBuilder(B);
                temp.setCharAt(index, '1');
                B = temp.toString();
            }
            count++;
        }

        System.out.println(B + " count is : " + count);









    }


    public static String BeautifyString(String B){
        int count = 0;
        StringBuilder temp;
        while(B.contains("010")){
            int index = B.indexOf("010");
            int key = index + 3;
            if(key > B.length() -1){
                temp = new StringBuilder(B);
                temp.setCharAt(index + 1, '0');
                B = temp.toString();
            } else if (B.charAt(key) == '1'){
                temp = new StringBuilder(B);
                temp.setCharAt(index+2, '1');
                B = temp.toString();
            } else if(B.charAt(key) == '0'){
                temp = new StringBuilder(B);
                temp.setCharAt(index, '1');
                B = temp.toString();
            }
            count++;
        }

        return B;

    }









}
