package Array;

/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 */

public class MajorityElements {

    public static void main(String[] args){

        int[] numbers = {1, 2, 3, 3, 4, 3, 3};
        int max = majorityElement(numbers);


    }



    public static int majorityElement(int[] num) {
        int len = num.length;
        int count = 0;
        if(len == 0){
            return 0;
        }


        for(int i = 0; i < len; i++){
            System.out.println("a   " + num[i]);
            for(int j = 0; j < len; j++){

                if(num[i] == num[j]) {
                    count++;
                } else {
                    count--;
                }


                System.out.println("b " + num[j]);
            }

            System.out.println("Count for: " + num[i] + " is " + count);
            System.out.println();


         //   if(count > (len / 2)){
           //     System.out.println("Count for: " + num[i] + " is " + count);

             //   break;
           // }




        }


        return count;
    }



}
