
/**
 Given an array with sorted data, e.g.

 0, 1, 2, 4, 4, 6, 7, 7, 7, 7, 8, 9, 10, 12, 15, 15

 Write a java class that implements binary search in O(log(n)) to find all instances of element X (for instance X=7),
 and the accompanying JUnit unit tests. Return all the indices if the element is found at least once, or -1 if not found.
 Explicitly identify any assumption you are making while solving this problem.

 */
public class HEREBinarySearch {


    public static void main(String[] args)  {
        int value = 20;
        int[] list = {0, 1, 2, 4, 4, 6, 7, 7, 7, 7, 8, 9, 10, 12, 15, 15};
        int indicesCount = binaryIndicesSearch(list, value);
        System.out.println("Number of indices for value: " + value  + " is " + indicesCount);
    }


    public static int binaryIndicesSearch(int[] sortedlist, int searchInt){
        int indicesCount = 0;
        int len = sortedlist.length;
        int start = -1;
        int end = -1;

        // find start index
        int low = 0;
        int high = len-1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (sortedlist[middle] > searchInt) {
                high = middle - 1;
            } else if (sortedlist[middle] == searchInt) {
                start = middle;
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        // find end index
        low = 0;
        high = len - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (sortedlist[middle] > searchInt) {
                high = middle - 1;
            } else if (sortedlist[middle] == searchInt) {
                end = middle;
                low = middle + 1;
            } else {
                low = middle + 1;
            }
        }

        // Count range
        if (start != -1 && end != -1) {
            for (int i = 0; (i + start) <= end; i++) {
                indicesCount++;
            }
        }

        if(indicesCount == 0){
            indicesCount = -1;
        }
        return indicesCount;
    }







}
