package String;

public class StringToInteger {


    public static void main(String[] args){
        String stringInt = "367";
        strToInt(stringInt);



    }

    public static int strToInt(String str){
        int len = str.length();
        int i = 0;
        int num = 0;
        boolean isNegative = false;

        if(str.charAt(0) == '-'){
            isNegative = true;
            i = 1;
        }

        while(i < len){
            num *= 10;
            Character digit = str.charAt(i++);
            num += (digit) - '0'; // get mumberic value (character - 0)
        }

        if(isNegative){
            return -num;
        }
        return num;
    }




}
