package Numbers;


/*
Write a Java program to calculate Factorial of a number in Java?
 */

public class Factorial {

    public static void main(String[] args){

        int n = 6;
        int factorial = 1;

        if(n < 0){
          System.out.println("Need to be non-negative");
        } else {
            for(int c = 1; c<=n; c++){
                factorial = factorial * c;
            }
        }
        System.out.println(factorial);

    }







}
