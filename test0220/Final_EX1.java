package test0220;

public class Final_EX1 {
	public static void main(String[] args) {
		
	}

}
/*
final class Sam{ //final 클래스 : 하위클래스를 가질수없다.
	int a;
}

class Ex extends Sam{  //컴오류 :  하위클래스 가질수없어서
	
}
*/

class Demo1{
	int a;
	public final void print() {  //하위클래스에서 메소드 재정의불가
		System.out.println(a);
	}
}

class Test1 extends Demo1{
//	public void print() {  //컴오류. 재정의 못해서 오류

	final int x;
	final int y=10;	//반드시 한번 초기화가 이루어져야함.
					//인스턴스 final변수는 선언시, 생성자, 초기화블럭에서 초기화가능
	static final int A;
	static final int B=10;;
			//static final변수는 선언시에 또는 static초기화블럭에서 초기화해야한다.
			//static final변수는 생성자에서 초기화 불가.
	
	static {
		A=5;
	}
	
	public Test1() {
		x=5;
	}
	
	public void write() {
		final int n=10;
		//n=20; //컴오류. final변수는 값변경 불가
		//x=25; //컴오류. final변수는 값변경 불가
		System.out.println(x+":"+y+":"+n);
	}
}
