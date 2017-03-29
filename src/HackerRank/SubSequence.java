package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {


	public static void main(String[] args){

		//System.out.println(Arrays.toString(buildSubsequences("abc")));

	}



	static ArrayList<String> buildSubsequences(String s) {
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < s.length(); i++){
			for(int y = i + 1; y <= s.length(); y++){
				System.out.println(s.substring(i, y));
				list.add(s.substring(i, y));
			}
		}



		return list;
	}




	/*

	a
	ab
	abc
	ac
	b
	bc
	c

	 */

}
