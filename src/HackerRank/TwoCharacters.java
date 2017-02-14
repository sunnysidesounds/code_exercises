package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoCharacters {


	public static void main(String[] args){

		Scanner scan = new Scanner(new StringReader(
				"121\n"
						+ "txnbvnzdvasknhlmcpkbxdvofimsvqbvkswlkrchohwuplfujvlwpxtlcixpajjpaskrnjneelqdbxtiyeianqjqaikbukpicrwpnjvfpzolcredzmfaznnzd\n"
		));


		int N = scan.nextInt();
		String S = scan.next();

		Set<String> list = getCharacterCombinationList(N, S);
		Set<String> combinations = new HashSet<String>();
		String newS;
		for(String item : list){
			if(item.length() == 1){
				newS = S.replace(item, "");
			} else {
				newS = S.replace(item.charAt(0)+"", "").replace(item.charAt(1)+"", "");
			}

			combinations.add(newS);
		}

		int maxLength = 0;
		for(String str : combinations){
			System.out.println("" + str);
			System.out.println(" " + list);
			if(isValid(str)){
				if(str.length() > maxLength){
					maxLength = str.length();
				}

			}
		}



		System.out.println(maxLength);


	}


	public static boolean isValid(String str){
		boolean is = false;

		if(str.length() >= 2) {
			String key = str.substring(0, 2);
			String firstCharacter = str.substring(0, 1);
			String secondCharacter = str.substring(1, 2);
			if (!firstCharacter.equals(secondCharacter)) {
				String[] pairs = str.split("(?<=\\G.{2})");
				for (int i = 0; i < pairs.length; i++) {
					if (!pairs[i].equals(key)) {
						if (pairs[i].length() == 1 && pairs[i].equals(firstCharacter)) {
							System.out.println("  key : " + key + " value : " + pairs[i] + " EQUAL");
							is = true;
						} else {
							System.out.println("  key : " + key + " value : " + pairs[i] + " NOT EQUAL");
							is = false;
							break;
						}
					} else {
						is = true;
						System.out.println("  key : " + key + " value : " + pairs[i] + " EQUAL");
					}
				}
			}
		}

		return is;
	}


	public static Set<String> getCharacterCombinationList(int N, String S){
		char[] Sarray = S.toCharArray();
		Set<String> characters = new HashSet<String>();
		for(int i = 0; i < N; i++){
			characters.add(Sarray[i]+"");
		}
		for(int k = 0; k < N; k++){
			char x = S.charAt(k);
			for(int j = 1; j < N; j++){
				char y = S.charAt(j);
				if(x != y) {
					characters.add(x + "" + y);
				}
			}
		}
		return characters;
	}





}
