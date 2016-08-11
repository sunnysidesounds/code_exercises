package HackerRank;

import java.io.StringReader;
import java.util.*;

public class FlatLandSpaceStations {


    public static void main(String[] args) {

/*        Scanner in = new Scanner(new StringReader(
                "5 2\n" + "0 4\n"));*/

        Scanner in = new Scanner(new StringReader(
                "6 6\n" + "0 1 2 4 3 5\n"));


        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }

        int[] ss = {1, 7, 2, 4};
        System.out.println(maxSubArray(ss));
        System.out.println(maxDistance(buildCitiesArray(n), c));

    }


    public static int maxSubArray(int[] A) {
        int newsum=A[0];
        int max=A[0];
        for(int i=1;i<A.length;i++){
            newsum=Math.max(newsum+A[i],A[i]);
            max= Math.max(max, newsum);
            System.out.println("newsum : " + newsum + " max : " +max);
        }
        return max;
    }

    public static int maxDistance(int[] cities, int[] spacestations){
        int[] distances = new int[cities.length];
        for(int i = 0; i < cities.length; i++){
            int city = cities[i];
            int closestDistance = -1;
            for(int k = 0; k < spacestations.length; k++){
                int spacestation = spacestations[k];
                int distance = Math.abs(city - spacestation);
                if(closestDistance == -1){
                    closestDistance = distance;
                } else {
                    if(closestDistance >= distance){
                        closestDistance = distance;
                    }
                }
            }
            distances[i] = closestDistance;
        }

       int max = 0;
       for(int d : distances){
           if(d > max){
               max = d;
           }
       }
       return max;
    }




    public static int[] buildCitiesArray(int n){
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = i;
        }
        return array;
    }




    /*

                    // City 0  [0, 4] == 0 is the closest spacestation
                // Once we find the closest distance we get the distance from current city and closest space station.
                // Add distance to the distances array.
                // Find the max value in the distance array.





                System.out.println("city : " + city + " spacestation : " + spacestation + " distance : " + distance);



     */


}
