package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

public class hw7Q01Document {
	public static void main(String[] args) throws Exception {
		File f1 = new File("C:/myDir/Sample.txt");
		FileReader fr = new FileReader(f1);		
		int i;
		int count=0;
		while ((i = fr.read()) != -1)
            count++;
		fr.close();
		
		FileReader fr2 = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr2);
		String j;
        int z=0;
        while((j = br.readLine()) != null) {
        	z++;
        }
		
        br.close();
        fr2.close();
        
		System.out.println(f1.getName() +"檔案共有"+f1.length()+"個位元組，"+count+"個字元，"+z+"列資料");
	}

}
