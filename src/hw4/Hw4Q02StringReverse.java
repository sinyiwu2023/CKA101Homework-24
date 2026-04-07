package hw4;

/*請建立一個字串,經過程式執行後,輸入結果是反過來的
例如String s = “Hello World”,執行結果即為dlroW olleH*/

public class Hw4Q02StringReverse {
	public static void main(String[] args) {
		//字串反轉api
		StringBuilder s = new StringBuilder("Hello World!");
		System.out.println(s);
		System.out.println(s.reverse());
		
		//for迴圈
		String s2 = "Good morning";
		System.out.println(s2);
		for (int i=(s2.length()-1); i>=0 ; i--) {
			System.out.print(s2.charAt(i));
		}
	}
}
