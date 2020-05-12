package test0218;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Number_Format_Ex1 {
	public static void main(String[] args) {
		int n=1234567;
		String s;
		
		s=String.format("%d", n);
		System.out.println(s);	//1234567
	//천단위마다 , 찍어줌.
		NumberFormat nf=NumberFormat.getInstance();
		s=nf.format(n);			//천단위마다 , 찍어줌  
		System.out.println(s); //1,234,567
				
	//천단위마다 , 찍어주고 소수점 3자리까지 나옴	
		double d=123456.2626;
		s=nf.format(d);
		System.out.println(s); 	//123,456.263
	
		s="12,345";
		try {
		//	Number ob=nf.parse(s);		//parse가 예외처리나면 왼쪽 액박누르고, try/catch누르면 자동완성됨.
			Long ob=(Long) nf.parse(s); //parse는 자료형이 아버지여서 다운캐스팅(Long 로 형변환)해줘야함
			long x=ob+10;	
			System.out.println(x);//parse는 Long형이여서 Long형으로 캐스팅 해줘야함
		} catch (ParseException e) {	//ob는 문자임(숫자아님)
			e.printStackTrace();
		}
		
	
	//천단위마다 , 찍어주고 국가별 원화기호가 생긴다(한국은 ￦)		
		NumberFormat nf2 =NumberFormat.getCurrencyInstance();
		s=nf2.format(n);
		System.out.println(s);  	 //￦1,234,567
		
	//천단위마다 , 찍어주고 국가별 원화기호가 생긴다(US는 $) =>getCurrencyInstance(Locale.국가)
		NumberFormat nf3 =NumberFormat.getCurrencyInstance(Locale.US);
		s=nf3.format(n);
		System.out.println(s); 		 //$1,234,567.00
		
		
				
		
		
		
	}

}
