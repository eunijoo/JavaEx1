package test0214;

public class Equals_String_Ex1 {
	public static void main(String[] args) {
		Test1 t1=new Test1(); //객체 생성
		Test1 t2=new Test1(); //객체생성
		Test1 t3=t2; //방하나에 2개
		
		boolean b;
		b=t1.equals(t2); //t2랑 t3 주소비교 
		System.out.println(b);  //false
		System.out.println(t1==t2);  //false // == : 객체는 주소비교
		System.out.println(t2==t3);  //true 
		
		b= t2.equals(t3);
		System.out.println(b); //true // t2랑 t3주소비교
		
		String s;
		s=t1.toString(); //클래스 정보 : 패키지명.클래스이름@해쉬코드(16진수)
		System.out.println(s);
		
		System.out.println(t2); //객체명을 출력하면 toString()과 같은 결과
		System.out.println(t2.toString()); //toString 을 쓰지 않아도 같은 결과가 나온다.단, 출력할때만.
		System.out.println(t3);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());//t3와 같은객체여서 같은 결과
		System.out.println(t3.hashCode());//t2와 같은객체여서 같은 결과
		
		
	}

}

class Test1{
	private int a=10;
	
	public void print() {
		System.out.println(a);
	}
}
