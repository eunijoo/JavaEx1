package test0218;

import java.text.DecimalFormat;


public class Decimal_Format_Ex3 {
	public static void main(String[] args) {
		DecimalFormat df= new DecimalFormat("#,##0");
		String s;
		
		s=df.format(123456.123); 
		System.out.println(s);		//123,456
		
	//�Ҽ��� ù°�ڸ� ���� ������	
		DecimalFormat df2	= new DecimalFormat("#,##0.#");
		s=df2.format(123456.173); 
		System.out.println(s);		//123,456.2
		
		
	//�Ҽ��� ù°�ڸ� ���� ������	
		DecimalFormat df3	= new DecimalFormat("#,##0.0");
		s=df3.format(123456.173); 
		System.out.println(s);		//123,456.2
	//DecimalFormat("#,##0.0") ����, ������ �ᵵ �Ҽ���ù°�ڸ����� ����
		DecimalFormat df4	= new DecimalFormat("#,##0.0");
		s=df4.format(123456); 
		System.out.println(s);		//123,456.0
		
		//DecimalFormat("#,##0.#") ���� ������ ���� �Ҽ��� ù°�ڸ����� �ȳ���	
		DecimalFormat df5	= new DecimalFormat("#,##0.#");
		s=df5.format(123456); 
		System.out.println(s);		//123,456
	}

}
