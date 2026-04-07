package hw4;

import java.util.Arrays;

/*有個一維陣列如下:
{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素*/

public class Hw4Q01OneArrayAverage {
	public static void main(String[] args) {
		//陣列排序
		int[] intArray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		Arrays.sort(intArray);
		
		//算出所有元素的平均值
		double sum,average;
		sum = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
			
		}
		average = sum/intArray.length;
		System.out.println("所有元素的平均值："+average);
		
		//找出大於平均值的元素
		System.out.print("大於平均值的元素：");
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i]>average) {
				System.out.print(intArray[i]+" ");
			}
		}
	}

}
