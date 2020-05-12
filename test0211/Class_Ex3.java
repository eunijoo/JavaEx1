package test0211;

public class Class_Ex3 {  
//필드(Field)구성형식 : 인스턴스변수와 클래스변수가 있다.
	public static void main(String[] args) { //클래스변수 (static)
		
		//클래스변수는 클래스가 로딩되면서 한번만 메모리할당을 받음(자동으로 함)
		// 	=> <ex>System.out,System.in (in,out이 클래스 변수)
		//클래스 변수는 객체생성과 상관없이 클래스이름으로 접근
		System.out.println(Test3.PI); //System.out이 클래스변수로 메모리할당이 자동으로 됨
		
		Test3 t1; 
		//System.out.println(t1.b); //메모리할당이 안되었으므로 컴오류
		
		t1= new Test3();
		//System.out.println(t1.a);//private이므로 컴오류
		System.out.println(t1.b); //0
		Test3 t2 =new Test3();
		
		t2.b=50;		
		System.out.println(t1.b+" : "+t2.b);
		
		//일반적으로 클래스 변수는 클래스명으로 접근하며, 객체로 접근하지 않는다.
		t1.PI=10;
		System.out.println(t1.PI+" : "+t2.PI);
	}
}

class Test3{
	//인스턴스변수 : 객체를 생성해야 접근 가능.
//	private int a=10; //선언과 동시에 초기화. private: 외부접근불가
	int b; //0으로 초기화	
	
	String name;//null로 초기화
	
	//클래스변수 (static): 객체를 생성하지 않아도 접근가능하며,모든 객체가 동일한 값을 갖는다.
	//					클래스변수는 객체로 접근하지않고, 클래스명으로 접근한다.
	public static double PI=3.141592;
}