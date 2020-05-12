package test0213;

public class This_EX10 {
	public static void main(String[] args) {
		
		
	}
}

class Test10{
	private int a;
	
	public void set(int a) {
		this.a=a; //지역변수와 필드 변수 이름이 같을 경우 this생략 불가능.
	}
	
	public void fun() {
		System.out.println("fun...");
	}
	
	public void print() {
		this.fun();  //this 생략가능 //this가 없어도 fun호출 가능	 
		System.out.println(this.a); //this생략가능 //this가 없어도 지역변수 a변수가 없어서 가능.
	}
	
	public static void write() {
		//System.out.println(this.a); //컴파일 오류
		//클래스 메소드는 객체생성과 무관하므로 호출한 객체를 나타내는 this는 사용할 수 없다.
		Test10 t=new Test10(); //객체 생성
		
		t.a=10; //클래스메소드에서는 인스턴스변수는 객체 생성 후에 접근 가능.
		t.print(); 
	}
}