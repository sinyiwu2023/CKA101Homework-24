package hw3;

import java.util.Scanner;

//進階：從阿文篩選完的樂透號碼，隨機亂數6個數字出來且不重複

public class Hw3Q03LotteryNumberAdvanced {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文…請輸入你討厭哪個數字(1~9)？：");
		int data = sc.nextInt();
		
	
	
//先把阿文不要的號碼篩選掉
		int count=0;
		int[] intArray= new int[49];
		for(int num=1; num<intArray.length+1; num+=1) {
			if((num%10 !=data)  &&  (num/10 !=data)) {
				intArray[num-1]=1;	
			}
			else{
				intArray[num-1]=0;	
			}
		}

		
//隨機取六個號碼，且不重複
		System.out.println("隨機抽出的6個號碼：");
		while(true) {
			int i = (int)(Math.random()*49)+1;
			if(intArray[i-1]==1) {
				System.out.print(i+"\t");
				count++;
			}
			else if(intArray[i-1]==0){
			}
			
			if(count==6) {
				break;
			}
		}
	
	
	
		
	}


}
