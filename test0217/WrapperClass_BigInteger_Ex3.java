package test0217;

import java.math.BigInteger;

public class WrapperClass_BigInteger_Ex3 {

	public static void main(String[] args) {
	
		//���������δ� ���ڿ��� ó���Ѵ�.
		BigInteger a=new BigInteger("12345678912345678134");
		BigInteger b=new BigInteger("12345678912345678134");
		
		BigInteger c=a.add(b);
		System.out.println(c);
		
		BigInteger d=a.subtract(b);
		System.out.println(d);
		
		BigInteger e=a.multiply(b);
		System.out.println(e);
		
		BigInteger f=a.divide(b);
		System.out.println(f);
		
		
		
	}

}
