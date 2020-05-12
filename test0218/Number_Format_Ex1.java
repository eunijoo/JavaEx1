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
	//õ�������� , �����.
		NumberFormat nf=NumberFormat.getInstance();
		s=nf.format(n);			//õ�������� , �����  
		System.out.println(s); //1,234,567
				
	//õ�������� , ����ְ� �Ҽ��� 3�ڸ����� ����	
		double d=123456.2626;
		s=nf.format(d);
		System.out.println(s); 	//123,456.263
	
		s="12,345";
		try {
		//	Number ob=nf.parse(s);		//parse�� ����ó������ ���� �׹ڴ�����, try/catch������ �ڵ��ϼ���.
			Long ob=(Long) nf.parse(s); //parse�� �ڷ����� �ƹ������� �ٿ�ĳ����(Long �� ����ȯ)�������
			long x=ob+10;	
			System.out.println(x);//parse�� Long���̿��� Long������ ĳ���� �������
		} catch (ParseException e) {	//ob�� ������(���ھƴ�)
			e.printStackTrace();
		}
		
	
	//õ�������� , ����ְ� ������ ��ȭ��ȣ�� �����(�ѱ��� ��)		
		NumberFormat nf2 =NumberFormat.getCurrencyInstance();
		s=nf2.format(n);
		System.out.println(s);  	 //��1,234,567
		
	//õ�������� , ����ְ� ������ ��ȭ��ȣ�� �����(US�� $) =>getCurrencyInstance(Locale.����)
		NumberFormat nf3 =NumberFormat.getCurrencyInstance(Locale.US);
		s=nf3.format(n);
		System.out.println(s); 		 //$1,234,567.00
		
		
				
		
		
		
	}

}
