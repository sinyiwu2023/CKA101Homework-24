package hw3;

import java.util.Scanner;

public class Hw3Q02GuessNumberAdvanced {
	public static void main(String[] args) {
		int i = (int)(Math.random()*101)+0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧！(0~100)");
		int data = sc.nextInt();
		
		while(true) {
			if(data!=i) {
				System.out.println("猜錯囉");
				if(data>i) {
					System.out.println("再小一點！你猜的數字比答案大");
				}
				else {
					System.out.println("猜大一點！你猜的數字比答案小");
				}
				data = sc.nextInt();
			}
			else {
				System.out.println("答對了！答案就是"+i);
				break;
			}
		}
		
	}	

}
