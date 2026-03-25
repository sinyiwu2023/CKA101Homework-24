package hw2;

/*• 請設計一隻Java程式,輸出結果為以下:
A
BB
CCC
DDDD
EEEEE
FFFFFF
*/

public class Hw2Q07 {
	public static void main(String[] args) {
		char alphabet='A';
		for(int i =1;i<=6;i+=1) {
			for(int j=1;j<=i;j+=1) {
				System.out.print(alphabet);
			}
			alphabet++;
			System.out.println();
		}
	}

}
