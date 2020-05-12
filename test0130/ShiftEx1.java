package test0130;

public class ShiftEx1 {

	public static void main(String[] args) {
		int a=126;
		int b;
		//우측으로 3bit이동
		b= a<<2; //왼쪽으로 2bit이동 , a*4와 같다
		System.out.println(b);

		b= a>>2; //오른쪽으로 2bit이동 , a/4와 같다
		System.out.println(b);
		//좌측으로 3bit이동
		a=32;
		b= a << 3; //좌측으로 3bit이동, a/8와 같다
		System.out.println(b); //4
		
		a=-32;
		b= a << 3; //좌측으로 3bit이동, a/8와 같다
		System.out.println(b); //-4
		
    	// >>>논리적인 shift연산자 : 비트이동으로 인한 빈공간을 0으로 채운다.		
		a=32;
		b= a >>> 3; //
		System.out.println(b);//4
		
		a=-32;
		b= a >>> 3; //
		System.out.println(b);
		
	}

}
