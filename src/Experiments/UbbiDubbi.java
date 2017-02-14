package Experiments;

public class UbbiDubbi {

	public static void main(String[] args){

		//"Hi, how are you?" → "Hubi, hubow ubare yubou?"

		String phrase = "Hi, how are you";
		System.out.println(translateToUbbiDubbi(phrase));

	}

	public static boolean isVowel(char v){
		if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
			return true;
		}
		return false;
	}

	public static String translateToUbbiDubbi(String phrase){

		StringBuilder result = new StringBuilder();
		boolean prevVowel = false; //is our vowel part of a cluster?

		for (int i = 0; i < phrase.length(); i++) {
			if (isVowel(phrase.charAt(i))) {
				if(prevVowel==false)
					result.append("ub");

				prevVowel=true;
			}
			else
				prevVowel=false;
			result.append(phrase.charAt(i)); //should be added anyway

		}
		return result.toString();
	}

}
