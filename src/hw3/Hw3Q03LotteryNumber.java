package hw3;

import java.util.Scanner;

public class Hw3Q03LotteryNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文…請輸入你討厭哪個數字(1~9)？：");
		int data = sc.nextInt();
		
		int count=0;
		for(int num=1; num<=49; num+=1) {
			if((num%10 !=data)  &&  (num/10 !=data)) {
				System.out.print(num+"\t");
				count++; 
				
				if(count%6 ==0) {
				System.out.println();
				}
				
				 
			}
		
		}
		System.out.print("總共有"+count+"個數字可選");
	}

}
