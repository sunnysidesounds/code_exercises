package Numbers;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args){
        int sequence = 10;
        int[] arr = new int[sequence];

        for(int i = 0; i < sequence; i++){
             arr[i] = fibonacci(i + 1);
        }
        System.out.println(Arrays.toString(arr));
    }


    public static int fibonacci(int i){
        if(i== 1 || i == 2){
            return 1;
        } else {
            return fibonacci(i - 1) + fibonacci(i -2);
        }
    }





}
