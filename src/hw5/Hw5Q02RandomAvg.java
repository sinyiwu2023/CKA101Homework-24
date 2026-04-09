package hw5;

/*請設計一個方法為randAvg(),
 * 從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值*/

public class Hw5Q02RandomAvg {
	
	public static void main(String[] args) {
		Hw5Q02RandomAvg ra = new Hw5Q02RandomAvg();
		ra.ranAvg();
		
	}
	
	
	public void ranAvg() {
		
		int sum=0;
		System.out.println("本次亂數結果：");
		
		for (int i =0; i<10; i++) {
			int num = (int)(Math.random()*101)+0;
			System.out.print(num+" ");
			sum+=num;
		}
		double avg= sum/10.0;
		System.out.println("\n平均值："+avg);
		
	}
	

}
