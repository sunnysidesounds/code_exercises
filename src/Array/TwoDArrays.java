package Array;

public class TwoDArrays {

    public static void main(String[] args){
        int[][] array = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}
        };

        boolean found = searchMatrix(array, 10);
        System.out.println("Found value: " + found);




    }


    public static boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length;
        int low = 0;
        int high = len-1;

        while(low < high){
            int mid = low + (high - low) / 2;
            if(target == matrix[mid][0]){
                return true;
            } else if (target < matrix[mid][0]){
                high = mid-1;
            } else if (target < matrix[mid+1][0]){
                low = mid;
                break;
            } else{
                low = mid + 1;
            }

        }


        System.out.println("In row: " + low);

        int row = low;
        low = 0;
        high = matrix[row].length -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(target == matrix[row][mid]){
                return true;
            } else if (target < matrix[row][mid]){
                high = mid -1;
            } else {
                low = mid +1;
            }
        }
       return false;
    }





}
