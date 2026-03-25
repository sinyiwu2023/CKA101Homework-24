package hw2;

/*阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
 * 請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?*/

public class Hw2Q05 {
	public static void main(String[] args) {
//		for(int i=1; i<=39 ; i+=1) {
//			if(i !=4 && i !=14 && i !=24 && i !=34) {
//				System.out.print(i+" ");
//			}
//		}
		
		int count=0;
		for(int num=1; num<=49; num+=1) {
			if((num%10 !=4)  &&  (num/10 !=4)) {
				System.out.print(num+" ");
				count++;  //累計個數
			}
		}
		System.out.println();
		System.out.println("可選擇的數字總共有"+count+"個");
	}

}
