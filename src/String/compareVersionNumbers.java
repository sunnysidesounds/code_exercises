package String;

/*
Compare two version numbers version1 and version1.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37


1)
- compare two version

2)
 1.1 < 1.2

 3)
 - split the string into two parts (front / back) based on . character.
 - if front1 > front2 return front1, else return front2
 - else if front1 == front2, compare back1 and back2
 - if back1 > back2 return back1, else return back2

 */

import java.util.Arrays;

public class compareVersionNumbers {

    public static void main(String[] args){

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};




        System.out.println(compareVersion("01", "1"));

        // 0 && 1 == -1
        // 01 &&



    }


    public static int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        for(int i = 0; i < Math.max(v1.length, v2.length); i++){
            int vv1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int vv2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if(vv1 > vv2){
                return 1;
            } else if(vv1 < vv2){
                return -1;
            }
        }

        if(v1.length > v2.length){
            return 1;
        } else if (v1.length < v2.length){
            return -1;
        } else {
            return 0;
        }
    }












}
