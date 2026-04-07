package hw4;

import java.util.Scanner;

/*請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天

例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」

進階題：擋下錯誤輸入，例如月份輸入為2,則日期不該超過29*/

public class Hw4Q05TheDayOfTheYear {
	public static void main(String[] args) {
		//輸入年月日
		Scanner sc = new Scanner(System.in);
		System.out.println("請分別輸入 年(西元)、月、日：");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		//建立各月份天數陣列
		int[] monthDays= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//判斷是否為閏年
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
				monthDays[1]=29;
		}
		
		//檢查月份及日期的合理性
		if (month<1 || month>12 || day<1 || day>monthDays[month-1]) {
			System.out.println("輸入錯誤，請確認！");
		}else {
			
			//先算出月份的天數
			int theDayOfTheYear=0;
			for(int i=0; i<(month-1); i++) {
				theDayOfTheYear += monthDays[i];
				
			}
			//加上日期的天數
			theDayOfTheYear += day;
			System.out.println("輸入的日期為該年第"+theDayOfTheYear+"天");
			
		}

	}

}
