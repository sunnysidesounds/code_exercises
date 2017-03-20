package HackerRank;

public class BetweenTwoSets {

	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int number : arr) {
			if(number > max) max = number;
		}
		return max;
	}

	public static int getMin(int[] arr) {
		int min = arr[0];
		for(int number : arr) {
			if(number < min) min = number;
		}
		return min;
	}

	public static boolean allAreFactors(int x, int[] a) {
		for(int number : a) {
			if(x % number != 0) return false;
		}
		return true;
	}

	public static boolean isFactorOfAll(int x, int[] b) {
		for(int number : b) {
			if(number % x != 0) return false;
		}
		return true;
	}

	public static void between(int[] a, int[] b) {
		int count = 0;
		int maxA = getMax(a);
		int minB = getMin(b);

		for(int i = maxA; i <= minB; i++) {
			if(allAreFactors(i, a) && isFactorOfAll(i, b)) count++;
		}

		System.out.println(count);
	}


}
