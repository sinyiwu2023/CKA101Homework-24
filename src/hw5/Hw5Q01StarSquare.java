package hw5;

import java.util.Scanner;

/*請設計一個方法為starSquare(int width, int height),
 * 當使用者鍵盤輸入寬與高時,即會印出對應的*長方形*/

public class Hw5Q01StarSquare {
	
	public static void main(String[] args) {
		
		//使用者輸入寬高
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入長方形的寬與高：");
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		//呼叫starSquare方法
		Hw5Q01StarSquare ss = new Hw5Q01StarSquare();
		ss.starSquare(width, height);
		
	}
	
	
	//設計starSquare方法
	public void starSquare(int width, int height) {
		for (int i=0; i<height; i++) {
			for (int j=0; j<width; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	

}
