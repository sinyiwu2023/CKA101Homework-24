package hw1;

public class Hw1Q02 {
	public static void main(String[] args){
		int eggs=200, num=12;
		int dozen=eggs/num;  //雞蛋數量除以12即為打數
		int remainder=eggs%num;  //上述餘數可知還有幾顆蛋
		
		System.out.println(dozen+"打");
		System.out.println(remainder+"顆");
	}

}
