package hw1;

public class hw1Q06 {
	public static void main(String[] args) {
		int num1=5;
		char a='5';
		String b="5";
		
		int first=num1+num1;  //int資料相加，5+5=10e
		int second=num1+(int)a;  //int和char資料相加，字元5對應到ASCII十進位為53
		String third=num1+b;   //注意third資料型別是String字串，故5+5為字串55
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
	}

}
