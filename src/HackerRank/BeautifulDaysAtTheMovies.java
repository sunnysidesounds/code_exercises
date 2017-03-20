package HackerRank;

import java.io.StringReader;
import java.util.Scanner;

public class BeautifulDaysAtTheMovies {


	public static void main(String[] args){
		Scanner in = new Scanner(new StringReader(
				"20 23 6\n"));

		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();

		int count = 0;
		for(int x = i; x <= j; x++){
			System.out.println(x + " : " + reverse(x));
			if(Math.abs(x-reverse(x))%k==0) {
				count++;
			}
		}

		System.out.println(count);
	}

	public static int reverse(int input){
		long reversedNum = 0;
		long input_long = input;
		while (input_long != 0) {
			reversedNum = reversedNum * 10 + input_long % 10;
			input_long = input_long / 10;
		}
		return (int)reversedNum;
	}



}
