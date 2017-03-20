package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class AppleAndOrange {


	public static void main(String[] args){
		Scanner in = new Scanner(new StringReader(
				"7 11\n" // m, n
						+ "5 15\n"     // a, b
						+ "3 2\n"         //m, n
						+ "-2 2 1\n"	//m distance
						+ "5 -6\n"));    //n distance


		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for(int apple_i=0; apple_i < m; apple_i++){
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n];
		for(int orange_i=0; orange_i < n; orange_i++){
			orange[orange_i] = in.nextInt();
		}



		System.out.println(Arrays.toString(apple));
		System.out.println(Arrays.toString(orange));


		int appleCount = 0;
		int orangeCount = 0;
		for(int ai = 0; ai < apple.length; ai++){
			int mDistance = apple[ai];
			int productA = (a + mDistance);
			if(productA >= s && productA <= t){
				appleCount++;
			}
		}
		for(int bi = 0; bi < orange.length; bi++){
			int nDistance = orange[bi];
			int productN = (b + nDistance);
			if(productN >= s && productN <= t){
				orangeCount++;
			}

		}



		System.out.println("Appple Count : " + appleCount);
		System.out.println("Orange Count : " + orangeCount);







	}







}
