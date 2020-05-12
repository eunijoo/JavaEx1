package test0217;

public class WrapperClass_Integer_Ex1 {

	public static void main(String[] args) {
		int a=10,b;
		Integer ob;
		String s,s1,s2;
		double d;
/*
 	- 객체와 기본 자료형은 기본적으로 형변환이 불가능하다.
 	- 상하관계가 아닌 경우 객체간에는 형변환이 불가능하다.
 	- Integer은 null을 가질 수 있고, 기본자료형은 null을 가질수 없다.
 */
		
		ob=a;  //ob는 Integer(객체) /a는 int(기본자료형) 
			//기본자료형이 int가 Integer로 자동변환 
			//실제로는 ob = new Integer(a); => 컴파일할때 변환
			//Autoboxing : 기본자료형에서 객체로 자동변환되는 것을 의미.
		
		b=ob;	//Integer 객체가 기본 자료형(int)로 자동변환
				// 실제로는 b= ob.intValue(); => 컴파일할때
				// Auto-unboxing : 객체에서 기본자료형으로 자동변환되는 것을 의미.
		
		System.out.println(a+":"+ob+":"+b);
		
		s1="123";
		s2="456";
		//a=s1+s2; //컴파일 오류. s1,s2는 문자열이고, a는 정수형이여서 안됨
		
		a=Integer.parseInt(s1)+ Integer.parseInt(s2); //parseInt : 문자열을 정수형으로 변환
		System.out.println(a);
		
	//	a=Integer.parseInt("123.5");  //런타임오류
						//Number FormatException //정수로 변화할수 없는 숫자를 정수형으로 변환하려할때
		
	//	a=Integer.parseInt("1,2345");  //런타임오류
						//Number FormatException //정수로 변화할수 없는 숫자를 정수형으로 변환하려할때
		
		a=10;
		s='A'+a+"korea"; //아스키코드값 65 +10
		
		s='A'+Integer.toString(a)+"korea"; //A를 문자열로 변경
		System.out.println(s);

		a=Integer.parseInt("101");
		System.out.println(a); //101
		
		a=Integer.parseInt("101",2);  //2진수
		System.out.println(a); //5
		
		
	//	a=Integer.parseInt("A1");  //런타임오류
		a=Integer.parseInt("A1",16);  //16진수에는 A라는 문자열이 있어서 가능하다.
		System.out.println(a);  //161
		
		a=123;
		s=Integer.toBinaryString(a); //2진수로 고치는것
		System.out.println(s); //1111011
		
		s=Integer.toHexString(a);
		System.out.println(s);  //7b
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES); // 4byte
		System.out.println(Integer.TYPE); //int
		System.out.println(Integer.SIZE); // 32bit
		
		s="123.45";
		d=Double.parseDouble(s2);
		System.out.println(d);
		
		s=Double.toString(d); //문자열을 실수로 고치는 방법
		System.out.println(s);  
		
	}

}
