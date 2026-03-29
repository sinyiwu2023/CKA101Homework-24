package hw3;

import java.util.Scanner;

public class Hw3Q02GuessNumber {
	public static void main(String[] args) {
		int i = (int)(Math.random()*10)+0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧！(0~9)");
		int data = sc.nextInt();
		
		while(true) {
			if(i==data) {
				System.out.println("答對了！答案就是"+ i);
				break;
			}
			else {
			System.out.println("猜錯囉");
			data=sc.nextInt();
			}
			
		}
		
	}

}
