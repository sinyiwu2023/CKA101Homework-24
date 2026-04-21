package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用append功能讓每次執行結果都能被保存起來)

public class hw7Q02NewFile {
	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("C:/myDir/Data.txt", true); //建構子發現目的地檔案不存在就自動創建
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		
		for (int j=1; j<=10; j++) {
			int i = (int)(Math.random()*1000)+1;
			ps.println(i);

		}
		
		ps.close();
		bos.close();
		fos.close();
		
	}

}
