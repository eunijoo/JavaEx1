package test0217;

import java.util.Random;
//s���߿��� �������� ��µǵ��� ���α׷� �ۼ�.(10�ڸ��� �ӽ� p/w)

public class Random_Class_EX16 {
	public static void main(String[] args) {
		Random rnd = new Random();
		String s;
		int n;
		s="!@#$%^&*ABCDEFGHIJKLNMOPQRSTUVWXYZ1234567890-+abcdefghijklnmopqrstuvwxyz";
		
		StringBuffer sb=new StringBuffer();   //���ڴ� +�� ���� �ʴ´�.
		for(int i=1;i<=10;i++) {
			n=rnd.nextInt(s.length());  	  //0~s.length()-1 
		//	System.out.println(n+":"+(n+1)+":"+s.substring(n,n+1));
			sb.append(s.substring(n,n+1));
		}
		System.out.println(sb.toString());		
		
		//substring : 
	}
}
