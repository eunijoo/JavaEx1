package test0130;

public class OperEx10 {

	public static void main(String[] args) {
		byte a=0x0a; //16����  0000 1010 => 10
		byte b=0x48; //16����  0100 1000 => 72
		byte c=(byte)0xcc; //16���� 1100 1100 =>-52 //���� �뷮�� �ʰ��ؼ� byte�� �ٿ���
		int d = 0xcc; //204
		
		System.out.println(a+","+b+","+c+","+d); //10,72,-52
		System.out.println((byte)(a|b&c)); //����켱����  & -> |
		// a:   0000 1010 
		// b:   0100 1000
		// c:   1100 1100
		//b&c : 0100 1000 
		//a|b&c:0100 1010 //74
		
		System.out.println((byte)(a|b&~c));//����켱����  ~ -> & -> |
		// a:    0000 1010 
		// b:    0100 1000
		// c:    1100 1100
		//~c:    0011 0011
		//b&~c : 0000 0000
		//a|b&~c:0000 1010 //10
		
		System.out.println((byte)(a^b&~c));
		// a:    0000 1010 
		// b:    0100 1000
		// c:    1100 1100
		//~c:    0011 0011
		//b&~c : 0000 0000 
		//a^b&~c:0000 1010 //10
		
	
	}

}
