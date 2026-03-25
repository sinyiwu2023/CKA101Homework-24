package hw1;

public class hw1Q05 {
	public static void main(String[] args) {
		int money=1_500_000, year=10;
		double rate=0.02;
		
		double total=money*Math.pow(1+rate, year);  // (1+rate)的10次方
		//備註：複利的公式為 本金*(1+年利率)^年
		
		System.out.println(total+"元");
		System.out.printf("%.2f 元", total); //小數點後只顯示2位 printf寫法 ，括號裡面打%.2f
	}

}
