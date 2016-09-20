package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class BonAppetit {


	public static void main(String[] args){
		Scanner in = new Scanner(new StringReader(
				"4 1\n"
						+ "3 10 2 9\n"
						+ "7\n"));
		// Setup
		int N = in.nextInt();
		int K = in.nextInt();
		int[] a = new int[N];

		for(int i = 0; i < N; i++){
			a[i] = in.nextInt();
		}

		int B = in.nextInt();




		System.out.println("N : " + N + " K : " + K + " B : " + B);
		System.out.println(Arrays.toString(a));

		System.out.println(isBonAppetit(a, K, B) == 0 ? "Bon Appetit" : isBonAppetit(a, K, B));


	}


	public static int isBonAppetit(int[] arr, int k, int b){
		int difference = 0;
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			if(i != k){
				sum += arr[i];
			}
		}
		int half = (sum / 2);
		if(half != b){
			difference = Math.abs(b - half);
		}
		return difference;
	}


}
