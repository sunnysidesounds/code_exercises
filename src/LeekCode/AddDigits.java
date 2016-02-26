package LeekCode;

public class AddDigits {

/*

 Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.


 */



    public static void main(String[] args){
      int output = addDigits(38);
      System.out.println("Output " + output);

    }


    public static int addDigits(int num){
        int len = Integer.toString(num).length();
        if(len == 1){
            return num;
        }
        return addDigits((num % 10) + (num / 10));
    }




}
