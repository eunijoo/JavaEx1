package test0213;

public class Overloading_Ex2 {
	public static void main(String[] args) {
		Test2 ob=new Test2();
	
		int a=10;
		short b=10;
		int c=10;
		Integer d=10;  //int를 클래스로 만든것.
		long e=10;
		Long f=10L;  //  Long f=10; => 에러

	//호출
		ob.write();	//인자없는 것.
		ob.write(a);  //short  //a를 보냄
		ob.write(b);  //short  //b를 보냄
		ob.write(c);  //int  //c를 보냄
		ob.write(d);  //int : 매개변수에 Integer은 없지만 int는 Integer로 int를 넘겨받을 수 있다.
		ob.write(a,b);  //int,int 는 short,short 를 받을수있다.(받는곳 자료형(int>short)이 더 커서 가능)
		ob.write(e);    //Long //우선순위는 자기꺼가 더 크다. 
		ob.write(f);	//Long
		
		//메소드 찾는 순서
		//	메소드명,파라미터로 메소드를 결정
		// 1> 매개변수의 동일한 자료형을 먼저 검색
		// 2> 기본형은 동일한 자료형이 없으면. 기본형 중 가장 가까운 큰 기본형을 찾는다.
		// 3> 기본형은 동일한 자료형이 없고,기본형 중 큰 자료형이 없는 경우. 같은 크기의 Wrapper 클래스를 찾는다.
		
		
		
		short s=10;
		ob.print(s); //int

	}
}

class Test2{
	public void write() {
		System.out.println("인자없는 메소드");
		
	}
/*
	//컴파일 오류,메소드 오버로딩은 매개변수로 구분한다.
	public int write() {
		return 0;
	}
*/
	
	 public void write(short a) {
		 System.out.println("short..."+a);
	 }
	 
	 public void write(int a) {
		 System.out.println("int..."+a);
	 }
	 
	 public void write(int a,int b) {
		 System.out.println("int 2개..."+a+","+b);
	 }
	 
	 // short를 클래스로 만든것 : Short
	 public void write(Short a) {
		 System.out.println("Short..."+a);
	 }
/*	//위에서 호출한 long이 없어서 클래스 Long으로 가는데 double자료형이 더크니깐 double이 있으면 여기로 온다. 
	 public void write(double a) {
		 System.out.println("double.."+a);
	 }
*/
	 // long을 클래스로 만든것 : Long
	 public void write(Long a) {
		 System.out.println("Long..."+a);
	 }
	 
	 public void print(Short a) {
		 System.out.println("Short...pppp"+a);
	 }
	 
	 public void print(int b) {
		 System.out.println("int...ssss");
	 }
}
