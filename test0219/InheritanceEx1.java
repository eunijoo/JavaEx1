package test0219;

public class InheritanceEx1 {

	public static void main(String[] args) {
		Demo1 d=new Demo1(); //Demo 의 객체생성
		System.out.println(d.b);
		//	b.print(); //컴오류.//print는 자식꺼여서 아버지가 못씀(하위클래스 메소드나 필드 접근불가)
		
		Test1 t= new Test1(); //Test1의 객체생성
		t.write(); //write는 아버지껀데 자식이니깐 쓸수있음
		//	System.out.println(t.a); //컴오류 //a가 private이므로 상속이 안됨
		System.out.println(t.b+":"+t.c);
		
		t.print();
	
	}

}
//Demo의 아버지는 Object
//메모리할당받아야 자식이 있음.(아버지도 아기일때가 있는데 아버지(아기일때)가 자식을 못낳음)
class Demo1{
	private int a=10;
	protected int b=20;
	public int c=30;
	
	public void write() {
		System.out.println(a+":"+b+":"+c);
	}
}

class Test1 extends Demo1{
	int x=100;
	
	public void print() {
		System.out.println(x+":"+b+":"+c);
	}
	public void fun() {
		write();
	}
}
