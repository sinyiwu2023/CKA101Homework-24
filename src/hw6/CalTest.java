package hw6;

import java.util.Scanner;

	public class CalTest {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Calculator c1 = new Calculator();
			
			while (true){
				try {
					System.out.println("請輸入x的值：");
					int x = sc.nextInt();
					System.out.println("請輸入y的值：");
					int y = sc.nextInt();
					int result = c1.powerXY(x, y);
				    System.out.println(x+"的"+y+"次方等於"+result);
				    break;
				}catch(CalException e) {
					System.out.println(e.getMessage());
				}catch(Exception e) {
					System.out.println("輸入格式不正確");
					sc.nextLine();  //將輸入的字串整行清除
				}
			}
			sc.close();
			
		}
}
