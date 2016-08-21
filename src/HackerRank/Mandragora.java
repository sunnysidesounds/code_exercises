package HackerRank;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Mandragora {


    public static void main(String[] args){

        Scanner scan = new Scanner(new StringReader(
                "1\n" + "3\n" + "3 2 2\n"));

        int T = scan.nextInt();
        for(int i = 0; i < T; i++) {

            int N = scan.nextInt();
            int[] arr = new int[N];
            long sum = 0;
            for (int j = 0; j < N; j++) {
                arr[j] = scan.nextInt();
                sum += arr[j];
            }
            Arrays.sort(arr);
            long S = 1;
            long P = sum;
            long value = 0;

            for(int X = 0; X < N; X++) {
                S++;
                sum -= arr[X];
                value = sum*S;
                if(value > P) P = value;
            }

            System.out.println(P);



          //  ArrayList<String> numberSequence = new ArrayList<String>();
          //  ArrayList<String> characterSequence = new ArrayList<String>();
          //  comboPermuteNumbers(arr, 0, numberSequence);
          //  comboPermuteChar(N, characterSequence);
          //
          //
          //  System.out.println(numberSequence);
          //  System.out.println("---");
          //  System.out.println(characterSequence);
          //  System.out.println(" ");
          //
          //  int maximumExperiencePoints = determineMaxExperiencePoints(numberSequence, characterSequence);
          //
          //  System.out.println("Max Experience Points : " + maximumExperiencePoints);
        }
    }


    public static int findMaximumExperiencePoints(int[] arr){
        int max = 0;



        return max;
    }



    /*
    public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int k = 0; k < T; k++) {
            int N = scanner.nextInt();
            int[] data = new int[N];

            //read input and calculate sum
            long sum = 0;
            for(int i = 0; i < N; i++) {
                data[i] = scanner.nextInt();
                sum += data[i];
            }

            //sort and initiate variables
            Arrays.sort(data);
            long S = 1, P = sum, var = 0;

            //eat one by one and calculate the
            //experience from thie fight with the rest
            for(int i = 0; i < N; i++) {
                S++;
                //eaten - update the sum and new exp
                sum -= data[i];
                var = sum*S;
                //save the biggest solution
                if(var > P) P = var;
            }

            System.out.println(P);
        }
    }
}
     */


    public static int determineMaxExperiencePoints(ArrayList<String> numberSequence, ArrayList<String> characterSequence){
        int max = 0;
        int maximumExperiencePoints = 0;
        for (int x = 0; x < numberSequence.size(); x++) {
            String number = numberSequence.get(x);
            for (int y = 0; y < characterSequence.size(); y++) {
                String code = characterSequence.get(y);
                int P = 0;
                int S = 1;
                for(int z = 0; z < code.length(); z++){
                    char cde = code.charAt(z);
                    int H = Character.getNumericValue(number.charAt(z));
                    if(cde == 'E'){
                        S++;
                    }
                    if(cde == 'B'){
                        P = P + (S * H);
                    }

                }

                if(P > max){
                    max = P;
                }

                System.out.println("number : " + number + " : code : " + code + " S : " + S + " : P : " + P);




            }
            if(max > maximumExperiencePoints){
                maximumExperiencePoints = max;
            }
            System.out.println("Max : " + max);
            System.out.println("--");

        }
        return maximumExperiencePoints;
    }



    public static void comboPermuteNumbers(int[] a, int k, ArrayList<String> numbers){
        if(k == a.length){
            StringBuilder subList = new StringBuilder();
            for (int i = 0; i < a.length; i++){
                subList.append(a[i]);
            }
            // This make the list unqiue.
            if(!numbers.contains(subList.toString())){
                numbers.add(subList.toString());
            }
        } else {
            for (int i = k; i < a.length; i++){
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;

                comboPermuteNumbers(a, k + 1, numbers);

                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }

    }

    public static void comboPermuteChar(int size, ArrayList<String> list){
        final int n = size;
        for (int i = 0; i < Math.pow(2, n); i++) {
            String bin = Integer.toBinaryString(i);
            while (bin.length() < n){
                bin = "0" + bin;
            }
            String cc = bin.replace("0", "E").replace("1", "B");
            list.add(cc);
        }
    }




}
