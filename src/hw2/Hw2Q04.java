package hw2;

/*請設計一隻Java程式,輸出結果為以下:
	1 4 9 16 25 36 49 64 81 100*/

public class Hw2Q04 {
	public static void main(String[] args) {
		int s=1;
		for(int i=1; i<=10; i+=1) {
			s=i*i;
			System.out.print(s+" ");
		}
		
	}

}
