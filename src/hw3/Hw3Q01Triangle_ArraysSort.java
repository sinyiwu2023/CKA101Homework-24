package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3Q01Triangle_ArraysSort {


//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形
//、等腰三角形、其它三角形或不是三角形，如圖示結果
//進階：判斷是否為直角三角形
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入：");
			int data1 = sc.nextInt();
			int data2 = sc.nextInt();
			int data3 = sc.nextInt();
	
//先將邊長由小到大排序
		    int[] intArray= {data1, data2, data3};
		    Arrays.sort(intArray);
		    for(int i=0; i<intArray.length;i++) {
//		    	System.out.println(intArray[i]);
		    }

//判斷為何種三角形
		    if(intArray[0]+intArray[1]>intArray[2]) {
		    	if(intArray[0]==intArray[1] && intArray[1]==intArray[2]) {
		    		System.out.println("正三角形");
		    	}
		    	else if(intArray[0]==intArray[1] || intArray[1]==intArray[2]) {
		    		System.out.println("等腰三角形");
		    	}
		    	else if((Math.pow(intArray[0], 2))+(Math.pow(intArray[1], 2))==(Math.pow(intArray[2], 2))) {
		    		System.out.println("直角三角形");
		    	}
		    	else {
		    		System.out.println("其他三角形");
		    	}
		    }
		    else {
		    	System.out.println("不是三角形");
		    }
	}

}
