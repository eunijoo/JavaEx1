package test0218;

import java.text.NumberFormat;

public class Number_Format_Ex2 {
	public static void main(String[] args) {
		NumberFormat nf=NumberFormat.getInstance();
		
		String s1="1000";
		String s2="1000.12";
		String s3="1,000";
		
	//parse는 소수점있으면 나오고 없으면 안나옴
		try {
			Number n1=nf.parse(s1);
			Number n2=nf.parse(s2);
			Number n3=nf.parse(s3);
			System.out.println(n1+" : "+n2+" : "+n3); 	//1000 : 1000.12 : 1000
			
	//s2소수점 없애고싶음(소수점 버림)
			nf.setParseIntegerOnly(true);
			n2=nf.parse(s2);
			System.out.println(n2);	//1000
			
	//.getPercentInstance : %나오게 함	
			double d=0.12;
			NumberFormat nf2=NumberFormat.getPercentInstance();
			String s=nf2.format(d);
			System.out.println(s);	//12%
					
		} catch (Exception e) {
			
		}
		
		
	}

}
