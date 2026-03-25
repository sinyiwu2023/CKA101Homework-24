package hw1;

public class Hw1Q03 {
	public static void main(String[] args) {
		int time=256559;
		int day, hour, minute, second;
		
		day=time/(60*60*24);  //算出256559秒是幾天
//		hour=(time%(60*60*24))/(60*60);
//		minute=((time%(60*60*24))%(60*60))/60;
//		second=((time%(60*60*24))%(60*60))%60;
		time=time%(60*60*24); //把剩下的時間直接更新為上述天數的餘數 
		
		hour=time/(60*60); //算出幾小時
		time=time%(60*60); //再用小時的餘數更新時間
		
		minute=time/60;  //算出幾分鐘
		second=time%60;  //分鐘的餘數即為剩下的秒數
		
		
		System.out.println(day+"天");
		System.out.println(hour+"小時");
		System.out.println(minute+"分鐘");
		System.out.println(second+"秒");
	}

}
