package hw4;

/*有個字串陣列如下 (八大行星):
{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)*/

public class Hw4Q03StringEquals {
	public static void main(String[] args) {
		//視為二維陣列處理
		String[] ssArray = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count=0;
		for (int i=0; i<ssArray.length; i++) {
			String s = ssArray[i];
			for (int j=0; j<s.length(); j++) {
				char c = s.charAt(j);
	
				if ( c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u') {
					count++;
				}
			}
		}
		System.out.println(count+"個母音");
		
	}

}
