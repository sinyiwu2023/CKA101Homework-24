package hw3;

import java.util.Scanner;

//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形
//、等腰三角形、其它三角形或不是三角形，如圖示結果

public class Hw3Q01Triangle {
	public static void main(String[] args) {
		//Scanner可以取得鍵盤輸入的內容
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入：");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();
//		System.out.println(data+100);
		
		if((data1+data2)>data3 && (data1+data3)>data2 && (data2+data3)>data1) {
			if(data1==data2 && data2==data3) {
				System.out.println("正三角形");
			}
			else if(data1==data2 || data2==data3 || data3==data1){
				System.out.println("等腰三角形");
			}
			else if(data1*data1+data2*data2==data3*data3 || data1*data1+data3*data3==data2*data2 || data2*data2+data3*data3==data1*data1) {
				System.out.println("直角三角形");
			}
			else {
				System.out.println("其它三角形");
			}
		}
		else {
			System.out.println("不是三角形");
		}

	}

}
