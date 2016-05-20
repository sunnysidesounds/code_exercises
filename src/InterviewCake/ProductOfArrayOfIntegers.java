package InterviewCake;

public class ProductOfArrayOfIntegers {



    public static void main(String[] args){

        int[] arr = {1, 7, 3, 4};

        getProductsOfAllIntsExceptAtIndex(arr);



    }



    public static int[] getProductsOfAllIntsExceptAtIndex(int[] nums){
        int N = nums.length;

        int[] products_below = new int[N];
        int p = 1;

        for(int i = 0; i < N; i++){

            System.out.println("num " + nums[i]);

            products_below[i] = p;

            System.out.println("products_below[i] " + products_below[i]);
            p *= nums[i];


            System.out.println("p " + p);


            System.out.println(" ---- ");







        }














        return nums;

    }


}
