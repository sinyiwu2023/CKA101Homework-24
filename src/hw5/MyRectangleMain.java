package hw5;

public class MyRectangleMain {
	
	public static void main(String[] args) {
		
		//無參數建構子，需要先呼叫set
		MyRectangle r1 = new MyRectangle();
		r1.setWidth(10);
		r1.setDepth(20);
		System.out.println("面積："+r1.getArea());
		System.out.println("===========");
		
		
		//有參數建構子，可直接將數值代入
		MyRectangle r2 = new MyRectangle(10, 20);
		System.out.println("面積："+r2.getArea());
	}

}
