package test0218;

import java.text.ChoiceFormat;

public class ChoiceFormat_hakjum_Ex6 {
		public static void main(String[] args) {
	//ChoiceFormat : �����ͺ��� ū����. s�� g���� ����, �������߾�� ��. /����ó���� ����
		
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
