package test0213;

public class Intial_EX12 {
	public static void main(String[] args) {
		Test12 t1=new Test12();
		Test12 t2=new Test12();
		
		t1.print();
		t2.print();
/*
 		--클래스로 로딩시
		 1> static 변수(b) 메모리 할당 초기화
		 2> static 초기화 블럭 실행
		  단, 1>2>은 한번만 실행
		  
		--객체가 생성될때 마다
		 1> 객체 메모리 할당(인스턴스 변수 메모리 할당 및 초기화)
		 2> 초기화 블럭
		 3> 생성자 
*/
		
	}
}

class Test12{
	private int a;
	static int b;
	
	static {
		//static 초기화 블럭. 클래스가 로딩될때 한번만 실행.
		b=100;
		//a=5; //컴오류. static이여서 안됨.
		System.out.println("static 초기화 블럭");
	}
	
	{
		//초기화 블럭
		//객체가 생성될때마다 실행.
		a=10;
		System.out.println("초기화 블럭...");
	}
	
	public Test12() {
		//객체가 생성될때 마다 실행
		System.out.println("생성자...");
	}
	
	public void print() {
		a++;
		b++;
		System.out.println(a+":"+b);
	}
}