package InterviewCake;

public class AppleStock {


    public static void main(String[] args){
        //int[] arr = {10, 7, 5, 8, 11, 9};
        //int[] arr = {10, 10, 10, 10, 10, 10};
        int[] arr = {10, 9, 8, 7, 6, 5};


        System.out.println("Max profit is : " + maxProfit(arr));

    }


    public static int maxProfit(int[] arr){
        int highest = 0;
        int lowest = arr[0];
        int maxProfit = 0;

        if(arr.length < 2){
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }


        for(int i = 0; i < arr.length-1; i++){
            int L = arr[i];
            int H = arr[i+1];

            if(L > H){
                if(H < lowest){
                    lowest = H;
                }
            } else {
                if(H > highest){
                    highest = H;
                }

                if(L < lowest){
                    lowest = L;
                }
            }
            if (arr.length-2 == i && highest == 0 ){
                if(L > H){
                    lowest = L;
                    highest = H;
                }
            }

        }

        System.out.println(lowest);
        System.out.println(highest);

        maxProfit = (highest - lowest);




        return maxProfit;
    }







}
