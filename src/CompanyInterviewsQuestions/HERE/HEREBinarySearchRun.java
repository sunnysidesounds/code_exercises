package CompanyInterviewsQuestions.HERE;

public class HEREBinarySearchRun {


    public static void main(String[] args)  {
       int key = 7;
       int[] list = {0, 1, 2, 4, 4, 6, 7, 7, 7, 7, 8, 9, 10, 12, 15, 15};

       HEREBinarySearch bSearch = new HEREBinarySearch(key, list);
       System.out.println("Number of indices for value: " + key  + " is " + bSearch.indicesCount);

    }


}
