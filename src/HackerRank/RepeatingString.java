package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class RepeatingString {

	public static void main(String[] args){
		Scanner in = new Scanner(new StringReader(
				"aba\n"
						+ "10\n"));
		// Setup
		int countAs = 0;
		char[] sCharacters = in.next().toCharArray();

		for(int c = 0; c < sCharacters.length; c++){
			if(sCharacters[c] == 'a'){
				countAs++;
			}
		}

		long N = in.nextLong();
		long count = 0;
		int difference = (int )(N / sCharacters.length);
		int indexDifference = (difference * sCharacters.length);

		int numberOfAs = difference * countAs;

		//if(indexDifference != N){
			for(int i = indexDifference; i < sCharacters.length; i++){
				if(sCharacters[indexDifference] == 'a'){
					numberOfAs++;
				}
			}



		//}


		System.out.println("difference : " + difference + " indexDifference : " + indexDifference + " numberOfAs : " + numberOfAs);



		// Find number of a's in original string, e.g 2 from aba
		// Next divide N / length of character array, e.g 10 / 3 = 3.333
		// if ((N / character.length) == character.length)  3.333 * character.length (3) = 9
		// current count : 3.33 * 2 = 6
		// Start loop @ index 9 and count remainder of a's






	/*	if(sCharacters.length == 1 && sCharacters[0] == 'a'){
			count = N;
		} else {

			for(int i = 0; i < N; i++){
				int index = i % sCharacters.length;
				int character = sCharacters[index];
				if(character == 'a'){
					count++;
				}



				System.out.println(sCharacters[index]);


			}


		}*/





		System.out.println(Arrays.toString(sCharacters) + " count : " + count);





	}

}
