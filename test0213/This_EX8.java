package test0213;

public class This_EX8 {
	public static void main(String[] args) {
		Test8 ob= new Test8();
		ob.write();
		
		Test8 ob2= new Test8(10);
		ob2.write();
		
		
	}
	
}

class Test8{
	private int a;
	
	//생성자 중복 정의
	public Test8() {
		this(5); //this : 생성자에서 다른 생성자를 호출(다른 생성자의 코드 실행)
				 //		    최상단에서 한번만 호출가능

		
	  //Test8(5); //컴오류.생성자는 new 다음에만 기술가능.
		new Test8(5); //객체를 2개 만듬(main에 하나, Test8에 하나)
		System.out.println("인자없는 생성자");
	}
	
	public Test8(int n) {
		a=n;
		System.out.println("인자가 있는 생성자...");
	}
	
	public void write() {
		System.out.println(a);
	}
	
	
}
