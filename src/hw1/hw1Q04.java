package hw1;

public class hw1Q04 {
	public static void main(String[] args) {
		double num=3.1415;
		int radius=5;

		double area=radius*radius*num;  //圓面積=半徑平方*π
		double circumference=2*radius*num;  //圓周長=2*半徑*π
		
		System.out.println("圓面積"+area);
		System.out.println("圓周長"+circumference);
	}

}
