package HackerRank;

import java.io.StringReader;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args){
		Scanner in = new Scanner(new StringReader(
				"1 2 3 4 5\n"));

		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long e = in.nextLong();

		long sumA = b + c + d + e;
		long sumB = a + c + d + e;
		long sumC = a + b + d + e;
		long sumD = a + b + c + e;
		long sumE = a + b + c + d;

		long[] sumArray = {sumA, sumB, sumC, sumD, sumE};

		System.out.println(min(sumArray));
		System.out.println(max(sumArray));
	}

	public static long max(long[] array) {
		long maxValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}

	public static long min(long[] array) {
		long minValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}




}
