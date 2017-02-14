package HackerRank;

import java.io.StringReader;
import java.util.*;

public class SockMerchant {


	public static void main(String[] args){

		Scanner scan = new Scanner(new StringReader(
				"9\n"
						+ "10 20 20 10 10 30 50 10 20\n"
		));


		int N = scan.nextInt();
		int pairCount = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for(int i = 0; i < N; i++){
			String cI = scan.next();
			if(map.containsKey(cI)){
				int count = map.get(cI);
				map.put(cI, count + 1);
			} else {
				map.put(cI, 1);
			}
		}

		Iterator it = map.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();
			int value = Integer.valueOf(pair.getValue().toString());
			int pairs = (value / 2);

			if((value / 2) != 0){
				pairCount = pairCount + pairs;
			}
			System.out.println(value +" "+  (value / 2));



		}



		System.out.println(pairCount);






	}


}
