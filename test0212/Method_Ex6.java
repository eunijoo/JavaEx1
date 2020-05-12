package test0212;
//자바가 만들어놓은것 : API
public class Method_Ex6 {  //main과 같은 class 안에 있음
	
	private int a=10; //인스턴스변수
	private int b=20;
	
	static int c=30; //클래스변수
	
	public void print() { //인스턴스 메소드
		System.out.println(a+":"+b);
	}
	public void write() { //인스턴스 메소드
		print();
		System.out.println(c);
	}
	
	public static void fun() {  //클래스(static)메소드 
		System.out.println("static 메소드 : "+c);
		Method_Ex6 oo=new Method_Ex6();
		oo.print(); //static 메소드에서 인스턴스 메소드는 객체생성 후, 호출
	}
		
	public static void main(String[] args) {//클래스(static) 메소드.
		System.out.println("main :" + c); //같은 클래스라서 호출 가능.
	//	System.out.println("main :" + Method_Ex6.c); //가능.
		fun(); //메소드 전체를 호출
		
	//	print(); //컴오류. 인스턴스 메소드는 객체 생성 후 호출 가능,
	
		Method_Ex6 ee=new Method_Ex6(); //객체 생성
		ee.a=200; //객체 생성해서 호출가능
		ee.print();//객체 생성해서 호출가능
	}
}

	

	
	

