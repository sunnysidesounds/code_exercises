package CompanyInterviewsQuestions.HERE;

/**
 Given an array with sorted data, e.g.

 0, 1, 2, 4, 4, 6, 7, 7, 7, 7, 8, 9, 10, 12, 15, 15

 Write a java class that implements binary search in O(log(n)) to find all instances of element X (for instance X=7),
 and the accompanying JUnit unit tests. Return all the indices if the element is found at least once, or -1 if not found.
 Explicitly identify any assumption you are making while solving this problem.

 */
public class HEREBinarySearch {

    public int key;
    public int[] list;
    public int indicesCount;

    /**
     * Constructor
     * @param target target value you are looking for in the list
     * @param searchList list you are looking for the target value
     */
    public HEREBinarySearch(int target, int[] searchList){
        key = target;
        list = searchList;
        indicesCount = binaryIndicesSearch(list, key);
    }

    /**
     * This does the binary indices search
     * @param searchList list you are looking for the target value
     * @param target target value you are looking for in the list
     * @return int value
     */
    public int binaryIndicesSearch(int[] searchList, int target){
        if(searchList == null){
            return -1;
        }
        int start;
        int end;

        // Get start index
        start = getIndex(searchList, target, true);
        //Get end index
        end = getIndex(searchList, target, false);
        // Count range
        int indicesCount = getCount(start, end);

        if(indicesCount == 0){
            indicesCount = -1;
        }
        return indicesCount;
    }

    /**
     * Count the range between start and end indexes to determine how many indices
     * @param start start index
     * @param end   end index
     * @return int value
     */
    public int getCount(int start, int end){
        int indicesCount = 0;
        if (start != -1 && end != -1) {
            for (int i = 0; (i + start) <= end; i++) {
                indicesCount++;
            }
        }
        return indicesCount;
    }

    /**
     * This gets the start or end index (range) of indices
     * @param searchList list you are looking for the target value
     * @param target target value you are looking for in the list
     * @param isStartIndex are you looking at the start or end index
     * @return int value
     */
    public int getIndex(int[] searchList, int target, boolean isStartIndex){
        int output = -1;
        int len = searchList.length;
        int start = -1;
        int end = -1;
        int low = 0;
        int high = len-1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (searchList[middle] > target) {
                high = middle - 1;
            } else if (searchList[middle] == target) {
                if(isStartIndex){
                    start = middle;
                    high = middle - 1;
                    output = start;
                } else {
                    end = middle;
                    low = middle + 1;
                    output = end;
                }
            } else {
                low = middle + 1;
            }
        }
        return output;
    }

}
