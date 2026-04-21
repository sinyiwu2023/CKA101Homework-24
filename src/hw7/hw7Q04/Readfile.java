package hw7.hw7Q04;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
//型簡化本題的程式設計)

public class Readfile {
	public static void main(String[] args) throws Exception {
	
		File file = new File("C:/data/Object.ser");
		
		//確認檔案是否存在
		if (! file.exists()) {
			System.out.println("找不到檔案，請先執行 WriteDogCat.java！");
            return;
		}
			
		//輸入
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {			
				((Animal) ois.readObject()).speak();    //原為object物件，需轉型成Animal
				System.out.println("--------------------");			
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢");
		}
		ois.close();
		fis.close();
	}
	
}
