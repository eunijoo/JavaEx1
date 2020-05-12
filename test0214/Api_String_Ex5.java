package test0214;

public class Api_String_Ex5 {
	public static void main(String[] args) {
		String s="  자    바   ";
		System.out.println(":"+s+":");
		System.out.println(":"+s.trim()+":");
		System.out.println(":"+s.replaceAll(" "," ")+":");
		
		int a=1234567;
		s=String.format("%,d", a);
		System.out.println("format : "+s);
		
		s=String.format("%1s,d %1$d %2$d", a,20); //a:1$ 20:2$
		System.out.println("format : "+s);
		
		s="KOREA";
		byte[] bb=s.getBytes();  //문자열의 ASCII코드값을  byte배열로 반환
		for(byte b:bb) {
			System.out.println("getBytes : "+ b);
		}
		
		//bytes는 배열로
		String s1=new String(bb);
		System.out.println("s1 : "+ s1);
		
		System.out.println("대한민국...");
		bb="대한민국".getBytes();
		for(byte b :bb) {
			System.out.println("b:"+ b);
		}
		
		String s2;
		//s2= 123; //123은정수고 s2는 문자열이라 컴오류
		//s2= ""+123; //문자열로 바꿔줘서 가능하지만 쓰지마!!
		
		//정수를 문자열로 변경
		s2=Integer.toString(123); 
		System.out.println("Integer.toString정수->문자열 : "+s2);
		
		//문자열을 정수로 변경
		s2="100";
		int n= Integer.parseInt(s2);
		System.out.println("Integer.parseInt문자열->정수: "+n);
		
		
		
	}
}
