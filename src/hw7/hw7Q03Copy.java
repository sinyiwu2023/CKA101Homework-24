package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

//請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案

public class hw7Q03Copy {
	
	public void copyFile(String f1, String f2) throws Exception {
		FileInputStream fis = new FileInputStream(f1);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		
		FileOutputStream fos = new FileOutputStream(f2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int i;
		while ((i= bis.read())!= -1 ) {
			bos.write(i);
		}
		bis.close();
		fis.close();
		bos.close();
		fos.close();

	}

	public static void main(String[] args) {
		hw7Q03Copy copy = new hw7Q03Copy();
		
		try {
			copy.copyFile("C:/myDir/Hello1.txt", "C:/myDir/Hello2.txt");
			System.out.println("success"); 
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
