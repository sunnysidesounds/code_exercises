package HackerRank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BearAndSteadyGene {


		/*

		GAAATAAA        - Replace AAATA with TCCGT (min length: 5)
		CACCGCTACCGC    - Replace CACCGC with AGAGTT (min length: 6)
		CAGCTAGC        - Replace C with T (min length: 1)
		AAAAAAAA        - Replace AAAAAA with CCGGTT (min length: 6)
		GAAAAAAA        - Replace AAAAA with CCGTT (min length: 5)
		GATGAATAACCA    - Replace ATGAA with TGCGT (min length: 5)
		ACGT            - Replace  with  (min length: 0)


		 */


		public static void main(String[] args) {

			/*Scanner in = new Scanner(new StringReader(
					"8\n" // Contains N divible by 4.
							+ "GAAATAAA\n" //S string

			));*/

			File file = new File("/Users/jasonalexander/Desktop/input04-bearsteady.txt");
			try {
			Scanner in = new Scanner(file);



			//input04-bearsteady.txt

			int n = in.nextInt();
			String s = in.next();

			String genes = "ACGT";
			int geneOccuranceRequirements = (n / genes.length());
			int[] counter = new int[genes.length()];
			int[] array = new int[n];

			for(int i = 0; i < n; i++){
				array[i] = genes.indexOf(s.charAt(i));
				counter[array[i]]++;
			}


			System.out.println("Each character needs to occur : " + geneOccuranceRequirements + " times");
			System.out.println("counter array : " + Arrays.toString(counter));
			System.out.println("array : " + Arrays.toString(array));


			if (counter[0] == geneOccuranceRequirements
					&& counter[1] == geneOccuranceRequirements
					&& counter[2] == geneOccuranceRequirements
					&& counter[3] == geneOccuranceRequirements) {
				System.out.println(0);
				return;
			}


			int low = 0;
			int high = n;

			outer:while(high - low > 1){
				int middle = low + (high - low) / 2;


				int[] tmp = counter.clone();
				for (int i = 0; i < middle; i++) {
						System.out.println("tmp : " + Arrays.toString(tmp));
						tmp[array[i]]--;

				}

				if (tmp[0] <= geneOccuranceRequirements
						&& tmp[1] <= geneOccuranceRequirements
						&& tmp[2] <= geneOccuranceRequirements
						&& tmp[3] <= geneOccuranceRequirements) {
					high = middle;
					System.out.println("high : " + Arrays.toString(tmp));
					continue outer;
				}


				for (int i = middle; i < n; i++) {
					tmp[array[i - middle]]++;
					tmp[array[i]]--;

					if (tmp[0] <= geneOccuranceRequirements
							&& tmp[1] <= geneOccuranceRequirements
							&& tmp[2] <= geneOccuranceRequirements
							&& tmp[3] <= geneOccuranceRequirements) {
						high = middle;
						continue outer;
					}
				}
				low = middle;

			}
			System.out.println(high);



			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}



		public static boolean isSteady(String geneString){
			boolean isSteady = false;
			char[] geneCharacters = {'A', 'C', 'T', 'G'};
			int geneOccuranceRequirements = (geneString.length() / geneCharacters.length);
			for(int i = 0; i < geneCharacters.length; i++){
				int index = geneString.indexOf(geneCharacters[i]);
				int indexCount = 0;
				while(index >= 0){
					indexCount++;
					index = geneString.indexOf(geneCharacters[i], index+1);
				}
				if(indexCount != geneOccuranceRequirements){
					isSteady = false;
					break;
				} else {
					isSteady = true;
				}

			}
			return isSteady;
		}


	}



