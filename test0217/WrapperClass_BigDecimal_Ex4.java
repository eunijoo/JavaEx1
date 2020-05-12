package test0217;

import java.math.BigDecimal;

public class WrapperClass_BigDecimal_Ex4 {

	public static void main(String[] args) {
	
		//���ڿ��� ó��
		BigDecimal a=new BigDecimal("123456789123456789");
		System.out.println(a.toString());
		
		BigDecimal b= a.movePointLeft(3);//�Ҽ��� �������� 3ĭ �̵�
		System.out.println(b);  //123456789123456.789
		
		BigDecimal c=a.divide(b);
		System.out.println(c); //1E+3
		
		b=new BigDecimal("69887.598");
		c=a.divide(b,BigDecimal.ROUND_DOWN);
		System.out.println(c);
		
		c=a.divide(b,5,BigDecimal.ROUND_DOWN); //��ȿ�ڸ����� 5�ڸ��� �ϰڴ�.
		System.out.println(c);		
	}

}
