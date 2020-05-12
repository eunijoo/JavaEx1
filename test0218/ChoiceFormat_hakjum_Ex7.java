package test0218;

import java.text.ChoiceFormat;

public class ChoiceFormat_hakjum_Ex7 {
		public static void main(String[] args) {
	// # , < 두가지는 "limit#value" , "limit<value" 형태
	// <는 경계값 포함 안함. 80점은 C
			
			String p="60#D|70#C|80<B|90#A";
			int []ss= {99,95,88,70,58,60,80};
			ChoiceFormat cf= new ChoiceFormat(p);
			
			for(int s:ss) {
				System.out.println(s+":"+cf.format(s));	//99:A,95:A,88:B,70:C,58:D,60:D,80:C
			}
	
	}

}
