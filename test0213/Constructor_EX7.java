package test0213;

public class Constructor_EX7 {
	public static void main(String[] args) {
		//Test7 t= new Test7; // 컴오류. 인자가 없는 생성자가 없음
							// 생성자를 하나라도 만들면 컴파일러는 디폴트생성자를 만들지 않음
							// 디폴트생성자: 생성자를 만들지 않을때 컴파일러에 의해 만들어짐.
							//			 인자가 없으며,아무런 코드가 없는 빈 생성자.
		
		Test7 t=new Test7(10);
	//	System.out.println(t);
		t.write(); //10
	}
}

class Test7{
	private int a;
	
	public Test7(int n) {//생성자
		a=n;
		System.out.println("인자가 있는 생성자...");
	}
	public void write() {
		System.out.println(a);
	}
	
}
	
