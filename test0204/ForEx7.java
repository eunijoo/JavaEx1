package test0204;

public class ForEx7 {
//A~Z��� //�� ���ٿ� 5����
	public static void main(String[] args) {	
		char ch;
		int cnt=0;
		
		for(ch='A'; ch<='Z';ch++) {
			System.out.print(ch+" ");
			//cnt++;
			if(++cnt%5==0) {  //++cnt�� ���ǽ��� ��ħ
				System.out.println();
			}
		}
 }
}