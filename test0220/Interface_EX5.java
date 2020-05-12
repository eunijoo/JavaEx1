package test0220;

public class Interface_EX5 {
	public static void main(String[] args) {
	//	Demo5 ob=new Demo5();  //인터페이스는 객체생성불가(인터페이스는 추상클래스 일종이여서 다 안만들어져서)
		
		Demo5 ob=new Test5(); //업캐스팅
		ob.print();
	//	ob.sub(); //컴파일오류 =>Demo안에 sub있니?를 확인하면됨(new를 보면안됨=>new는 실행시에만 )
		
		((Test5)ob).sub(); //다운캐스팅. 진짜는 Test5객체

	}
}

//선언만 있고, 정의가 없는 추상클래스의 일종.
interface Demo5{
	public static final double PI=3.141592; //final 상수
	public int A=10;	//static final이 없어도 static final 
	
	public abstract void print(); //메소드 선언
	void fun(); //public 이 없어도 public, abstract이 없어도 abstract =>컴파일러가 자동으로 생성.
}

//인터페이스를 구현하는 클래스
class Test5 implements Demo5{
	int a=10;
	
	@Override
	public void print() {
		System.out.println("print...");
	}

	@Override
	public void fun() {
		System.out.println("fun...");
		
	}
	
	public void sub() {
		System.out.println("sub...");
	}
	
}