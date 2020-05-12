package test0217;

import java.util.Random;
//s값중에서 랜덤으로 출력되도록 프로그램 작성.(10자리의 임시 p/w)

public class Random_Class_EX16 {
	public static void main(String[] args) {
		Random rnd = new Random();
		String s;
		int n;
		s="!@#$%^&*ABCDEFGHIJKLNMOPQRSTUVWXYZ1234567890-+abcdefghijklnmopqrstuvwxyz";
		
		StringBuffer sb=new StringBuffer();   //문자는 +를 하지 않는다.
		for(int i=1;i<=10;i++) {
			n=rnd.nextInt(s.length());  	  //0~s.length()-1 
		//	System.out.println(n+":"+(n+1)+":"+s.substring(n,n+1));
			sb.append(s.substring(n,n+1));
		}
		System.out.println(sb.toString());		
		
		//substring : 
	}
}
