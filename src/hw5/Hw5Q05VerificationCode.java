package hw5;

/*身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
與數字的亂數組合*/

public class Hw5Q05VerificationCode {

	public String genAuthCode() {
		
		//先宣告String為空字串，以便後續串接
		String code = "";
		
		
		//執行8次迴圈
		for (int i=0; i<8; i++) {
			
			int type = (int)(Math.random()*3);   //先決定要選數字、大寫英文、小寫英文哪一種
			
			if(type==0) {
				int num = (int)(Math.random()*10)+0; //數字0~9
				code +=num;
			}
			else if (type==1) {
				int A1 = (int)(Math.random()*26)+65; //大寫英文，其中A的ASCII值65
				code +=(char) A1;
			}
			else if (type==2) {
				int a2 = (int)(Math.random()*26)+97;  //小寫英文，其中a的ASCII值97
				code +=(char) a2;
			}
		
			
		}
		return code;
	}
	
	public static void main(String[] args) {
		Hw5Q05VerificationCode vc = new Hw5Q05VerificationCode();
		System.out.println(vc.genAuthCode());
	}
}
