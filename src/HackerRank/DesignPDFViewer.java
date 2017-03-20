package HackerRank;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class DesignPDFViewer {

	public static void main(String[] args){
		Scanner in = new Scanner(new StringReader(
				"1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5\n" +
						"abc\n"));

		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		for(char i = 'a'; i <= 'z'; i++){
				map.put(i, in.nextInt());
		}

		String word = in.next();
		char[] charArray = word.toCharArray();

		System.out.println(map);
		System.out.println(word);

		int tallestLetter = 0;
		for(int x = 0; x < charArray.length; x++){
			char value = charArray[x];
			if(tallestLetter < map.get(value)){
				tallestLetter = map.get(value);
			}
		}

		System.out.println("Tallest letter : " + tallestLetter);

		int selectedArea = (charArray.length * 1) * tallestLetter;

		System.out.println(selectedArea);








	}



}
