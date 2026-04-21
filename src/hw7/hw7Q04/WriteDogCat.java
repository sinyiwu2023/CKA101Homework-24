package hw7.hw7Q04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。
//注意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾

public class WriteDogCat{
	public static void main(String[] args) throws Exception {
		File dir = new File ("C:/data");
		if (! dir.exists()) {
			dir.mkdir();
		}
				
		
		Dog dog = new Dog("ddd");
		Dog dog2 = new Dog("ddd2");
		Cat cat = new Cat("ccc");
		Cat cat2 = new Cat("ccc2");
		
		FileOutputStream fos = new FileOutputStream("C:/data/Object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dog);
		oos.writeObject(dog2);
		oos.writeObject(cat);
		oos.writeObject(cat2);
		oos.close();
		fos.close();
		
	}

}
