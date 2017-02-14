package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class GridLandMetro {


	public static void main(String[] args){

		Scanner scan = new Scanner(new StringReader(
				"3 7 4\n"
				+ "1 1 3\n"
				+ "2 2 2\n"
				+ "3 1 6\n"
				+ "3 6 6\n"
		));









		// # of rows
		int n = scan.nextInt();
		// # of columns
		int m = scan.nextInt();
		// # of train tracks
		int k = scan.nextInt();
		int[][] grid = new int[n][m];

		System.out.println("n : " + n + " m : " + m + " k : " + k);
		System.out.println(Arrays.deepToString(grid));

		for(int i = 0; i < k; i++){
			// row
			int r = scan.nextInt();
			// start of train track
			int c1 = scan.nextInt();
			// end of train track
			int c2 = scan.nextInt();

			System.out.println("  r : " + r + " c1 : " + c1 + " c2 : " + c2);

			while(c1 <= c2){
				grid[r-1][c1-1] = 1;
				c1++;
			}

		}

		System.out.println(Arrays.deepToString(grid));





		System.out.println(countLampPostLocations(n, m, grid));













	}


	public static int countLampPostLocations(int rlen, int clen, int[][] grid){
		int count = 0;
		for(int i = 0; i < rlen; i++){
			for(int j = 0; j < clen; j++){
				//System.out.println("  " + grid[i][j]);
				if(grid[i][j] == 0){
					count++;
				}
			}
		}
		return count;
	}




}
