package test0218;

import java.text.ChoiceFormat;

public class ChoiceFormat_hakjum_Ex6 {
		public static void main(String[] args) {
	//ChoiceFormat : 낮은것부터 큰순서. s와 g간의 순서, 개수맞추어야 함. /점수처리에 용이
		
		//	double[] s= {60, 70, 80, 90};
		//	String[] g= {"D","C","B","A"};
					//50=>D
			
			double[] s= {0,60, 70, 80, 90};
			String[] g= {"F","D","C","B","A"};
			ChoiceFormat cf =new ChoiceFormat(s,g);
			
			int[] ss= {50,80,100,75,90};
			for(int n:ss) {
				System.out.println(n+":"+cf.format(n));				
		}
	
	}

}
