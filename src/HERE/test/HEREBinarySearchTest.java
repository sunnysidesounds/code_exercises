package HERE.test;

import HERE.HEREBinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;

public class HEREBinarySearchTest  {

    int[] list = {0, 1, 2, 4, 4, 6, 7, 7, 7, 7, 8, 9, 10, 12, 15, 15};

    /**
     *  Test whether a no key value is not in list will returns -1
     */
    @Test
    public void testKeyNotInArray(){
        int noKeyValue = 21;
        HEREBinarySearch test = new HEREBinarySearch(noKeyValue, list);
        try{
            assertEquals(test.indicesCount, -1);
            System.out.println("testKeyNotInArray - passed");
        }catch(AssertionError e){
            System.out.println("testKeyNotInArray - failed");
            throw e;
        }
    }

    /**
     * Test whether a key value is in list and will return indices count.
     */
    @Test
    public void testKeyInArray(){
        int keyValue = 7;
        HEREBinarySearch test = new HEREBinarySearch(keyValue, list);
        try{
            assertEquals(test.indicesCount, 4);
            System.out.println("testKeyInArray - passed");
        }catch(AssertionError e){
            System.out.println("testKeyInArray - failed");
            throw e;
        }
    }

    /**
     * Test whether a empty list will return -1
     */
    @Test
    public void testEmptyArray(){
        int keyValue = 7;
        int[] emptyList = {};
        HEREBinarySearch test = new HEREBinarySearch(keyValue, emptyList);
        try{
            assertEquals(test.indicesCount, -1);
            System.out.println("testEmptyArray - passed");
        }catch(AssertionError e){
            System.out.println("testEmptyArray - failed");
            throw e;
        }
    }

    /**
     * Test whether a null list will return -1
     */
    @Test
    public void testNullList(){
        int keyValue = 7;
        int[] emptyList = null;
        HEREBinarySearch test = new HEREBinarySearch(keyValue, emptyList);
        try{
            assertEquals(test.indicesCount, -1);
            System.out.println("testNullList - passed");
        }catch(AssertionError e){
            System.out.println("testNullList - failed");
            throw e;
        }
    }

    /**
     * Test whether we get the right start index
     */
    @Test
    public void testStartIndex(){
        int keyValue = 7;
        HEREBinarySearch test = new HEREBinarySearch(keyValue, list);
        try{
            assertEquals(test.getIndex(list, keyValue, true), 6);
            System.out.println("testStartIndex - passed");
        }catch(AssertionError e){
            System.out.println("testStartIndex - failed");
            throw e;
        }
    }

    /**
     * Test whether we get the right end index
     */
    @Test
    public void testEndIndex(){
        int keyValue = 7;
        HEREBinarySearch test = new HEREBinarySearch(keyValue, list);
        try{
            assertEquals(test.getIndex(list, keyValue, false), 9);
            System.out.println("testEndIndex - passed");
        }catch(AssertionError e){
            System.out.println("testEndIndex - failed");
            throw e;
        }
    }

    /**
     * Test the count returned from the start and end indexes
     */
    @Test
    public void testCount(){
        int keyValue = 7;
        HEREBinarySearch test = new HEREBinarySearch(keyValue, list);
        int start = test.getIndex(list, keyValue, true);
        int end = test.getIndex(list, keyValue, false);
        try{
            assertEquals(test.getCount(start, end), 4);
            System.out.println("testCount - passed");
        }catch(AssertionError e){
            System.out.println("testCount - failed");
            throw e;
        }
    }

}