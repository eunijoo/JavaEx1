package test0129;

public class OperEx2 {
	public static void main(String[] args) {
		byte b1=5, b2=10, b3;
		b3=(byte)(b1+b2);
//		b3=b1+b2; //컴오류
		System.out.println(b3);
		System.out.println("---------------");
//--------------------------------------------------------------------		
//		b1=200; //컴파일오류. overflow가 발생하므로
		b1=100;
		b2=120;
		b3=(byte)(b1+b2); //overflow가 발생하여 잘림현상이 발생
		System.out.println(b3); //-36
		System.out.println("---------------");
//--------------------------------------------------------------------			
		int x,y,z;
		x=2000000000;
		y=2000000000;
		z=x+y;
		System.out.println(z); //overflow가 발생하여 잘림현상 발생
		System.out.println("---------------");
//--------------------------------------------------------------------			
		b1=100;
		b2=120;
		z=b1+b2; //z=(int)b1+(int)b2; 와 동일
		System.out.println(z); //220
//--------------------------------------------------------------------			
		long s;
		s=x+y;//overflow가 발생하여 잘림현상 발생 (int+int=int)  여기서 잘린값이 윗줄의 long에 대입됨
		System.out.println(s); //-294967296
//--------------------------------------------------------------------		
		s=2000000000+2000000000L; //(int+long=long)
		System.out.println(s); //4000000000
	}
}
