package HackerRank;

public class HackerRankTest {

	public static void main(String[] args){
		String testStr = "00110";

		System.out.println(countSubString(testStr, "10"));


		System.out.println(findConsecutiveOnes(Integer.valueOf(testStr)));


	}


	public static  int countSubString(String str, String searchStr){
		int lastIndex = 0;
		int count = 0;
		while(lastIndex != -1){
			lastIndex = str.indexOf(searchStr, lastIndex);
			if(lastIndex != -1){
				count++;
				lastIndex += searchStr.length();
			}


		}

		return count;
	}

	public static int findConsecutiveOnes(int n) {
		int maxCount = 0;
		int currentCount = 0;
		while (n > 0) {
			if (n % 2 != 0) {
				currentCount++;
				maxCount = Math.max(maxCount, currentCount);
			} else {
				currentCount = 0;
			}
			n /= 2;
		}
		return maxCount;
	}




}







/*

String str = "helloslkhellodjladfjhello";
String findStr = "hello";
int lastIndex = 0;
int count = 0;

while(lastIndex != -1){

    lastIndex = str.indexOf(findStr,lastIndex);

    if(lastIndex != -1){
        count ++;
        lastIndex += findStr.length();
    }
}
System.out.println(count);



 */