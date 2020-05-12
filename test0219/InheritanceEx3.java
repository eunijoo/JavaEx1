package test0219;

public class InheritanceEx3 {
	//실행순서
	//1> main의 new연산자로 Demo3의 a와  Test3의 x메모리할당 및 0으로 초기화 (객체가 하나 만들어지면 필드가 메모리할당받음)
	//2> Test3() 생성자의 첫줄을 실행//this(100);=>Test3(int x)생성자코드가 실행되는 것
	//3> Test3(int x) 생성자의 첫줄을 실행 : super(); => Demo3()생성자코드 첫줄 실행
	//4> Demo3() 생성자의 첫줄을 실행 : super(); =>Object)() 생성자 코드실행  //Demo3의 아버지==Object
	//5> Demo3() 생성자 나머지 코드 실행
	//6> Test3(int x) 생성자. 나머지를 실행
	//7> Test3()생성자 나머지를 실행
	
	public static void main(String[] args) {
		Test3 tt1=new Test3();
		tt1.write();
	}

}
//모든생성자에는 super();이 숨어있다.
class Demo3{  //아버지클래스
	int a=10;
	
	public Demo3() {
		//super(); 가 숨어있다.
		System.out.println("인자없는  Demo3 생성자");
	}
	
	public Demo3(int a) {
		//super(); 가 숨어있다.
		System.out.println("인자있는 Demo3생성자");
		this.a=a;
	}
	
	public void pirnt() {
		//super(); 가 숨어있다.
		System.out.println("a : "+a);
	}
}

class Test3 extends Demo3{  //Test3 : 자식클래스
	int x;
	
	public Test3() { //아버지 안부름
		//this가 있으면 super();은 없다.
		this(100); //this : 본인클래스(동일클래스)의 다른생성자를 호출할때 사용
				   //최상단에서 딱 1번만 부를수있음//다른 생성자를 호출하지 않으면 super();로 상위 생성자 호출
		System.out.println("Test3 인자없는 생성자");
	}
	
	public Test3(int x) {
		//super(); 가 숨어있다.
		this.x=x;
		System.out.println("Test3 인자있는 생성자");
	}
	
	public Test3(int a,int x) {
		super(a); //super클래스의 생성자 호출.최상단에서 한번만 가능.
		this.x=x;
		System.out.println("Test3 인자가 2개인 생성자");
	}
	
	public void write() {
		//super(); 가 숨어있다.
		System.out.println(a+":"+x);
	}
}