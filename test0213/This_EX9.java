package test0213;

public class This_EX9 {
	public static void main(String[] args) {
		Test9 t1=new Test9(); //객체만듬
		//객체를 출력하면 "클래스명@해쉬코드"가 출력.
		System.out.println("main"+t1);// maintest0213.Test9@15db9742 출력됨
		t1.print();
		System.out.println("==============================");
		
		Test9 t2=new Test9();
		t2.set(200);
		System.out.println("main"+t2); //maintest0213.Test9@6d06d69c 출력됨
		t2.print();
		
	
	}
}

class Test9{
	private int a=10;  // a=10; : 객체꺼
	
	public void set(int a) {  //(int a):지역변수 // 우선순위는 지역변수가 높음.
		this.a=a; //지역변수 a를 객체변수에 넣어라
	}
	
	public int get() {
		//return a;
		return this.a;
	}
	
	public void print() {
	//	System.out.println(a); //오류아님(a가 하나여서 this를 생략했어도됨)
	//	this는 호출한 객체를 나타내는 키워드
		System.out.println(this);
		System.out.println(this.a); //t1이 불렀을땐 t1꺼  //t2가 불렀을땐 t2꺼
	}
}