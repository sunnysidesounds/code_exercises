package HackerRank;

import java.io.StringReader;
import java.util.*;

public class EqualizeTheArray {


	public static void main(String[] args){
		Scanner in = new Scanner(new StringReader(
				"5\n" +
		"3 3 2 1 3\n"));

		int n = in.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i = 0; i < n; i++){
			int value = in.nextInt();
			if(map.containsKey(value)){
				map.put(value, map.get(value) + 1);
			} else {
				map.put(value, 1);
			}
		}

		int highestCount = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			int countValue = entry.getValue();
			if(highestCount < countValue){
				highestCount = countValue;
			}
		}

		int totalToRemove = Math.abs(highestCount - n);

		System.out.println(totalToRemove);









	}



}
