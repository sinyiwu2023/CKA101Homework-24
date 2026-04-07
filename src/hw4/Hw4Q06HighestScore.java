package hw4;

import java.util.Arrays;

/*班上有8位同學,他們進行了6次考試結果如下:
請算出每位同學考最高分的次數*/

public class Hw4Q06HighestScore {
	public static void main(String[] args) {
		int[][] score = {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75}
		};
		
		//紀錄八位同學考最高分次數
		int[] count = new int[8];
		
		for (int i=0; i<score.length; i++) {
			//找出該次考試最高分數
			int max=0;
			for (int j=0; j<score[i].length; j++) {
				if (score[i][j]>max) {
					max=score[i][j];
				}
			}	
			//找出該次最高分數是哪位同學
			for (int j=0; j<score[i].length; j++) {
				if (score[i][j]== max) {
					count[j]++;
				}
			}
		
		}
		//印出count陣列
		for (int i=0; i<count.length; i++) {
			System.out.println((i+1)+"號同學：考"+count[i]+"次最高分");
		}
		
				
	}
		
			
		
		
}


