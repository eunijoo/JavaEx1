package test0218;

import java.text.DecimalFormat;


public class Decimal_Format_Ex3 {
	public static void main(String[] args) {
		DecimalFormat df= new DecimalFormat("#,##0");
		String s;
		
		s=df.format(123456.123); 
		System.out.println(s);		//123,456
		
	//소수점 첫째자리 까지 나오게	
		DecimalFormat df2	= new DecimalFormat("#,##0.#");
		s=df2.format(123456.173); 
		System.out.println(s);		//123,456.2
		
		
	//소수점 첫째자리 까지 나오게	
		DecimalFormat df3	= new DecimalFormat("#,##0.0");
		s=df3.format(123456.173); 
		System.out.println(s);		//123,456.2
	//DecimalFormat("#,##0.0") 쓰고, 정수만 써도 소수점첫째자리까지 나옴
		DecimalFormat df4	= new DecimalFormat("#,##0.0");
		s=df4.format(123456); 
		System.out.println(s);		//123,456.0
		
		//DecimalFormat("#,##0.#") 쓰고 정수만 쓰면 소수점 첫째자리까지 안나옴	
		DecimalFormat df5	= new DecimalFormat("#,##0.#");
		s=df5.format(123456); 
		System.out.println(s);		//123,456
	}

}
