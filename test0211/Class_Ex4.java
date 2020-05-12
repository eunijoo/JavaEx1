package test0211;

public class Class_Ex4 {  
//필드(Field)구성형식 : 인스턴스변수와 클래스변수가 있다.
	public static void main(String[] args) { //클래스변수 (static)
		Test4 t1; //객체 선언. 초기화되지않은 상태
		//t1.print(); //메소드호출.컴오류.인스턴스 메소드는 객체가 생성되어야 호출가능
		t1= new Test4(); //붕어빵 주문함  //객체 생성.생성자를 호출해야 객체생성가능
		t1.print(); //11:0
		t1.b=5;
		t1.print();//12:5 //2번부른거여서 ++a가 2번더해짐
		
		//t1=null;  ///t1:주소를 가지고있음. //빨리객체없애는 방법(회수됨)
		
		Test4 t2=null; //null로 초기화. null:객체가 생성되지 않은 빈상태
		t2.print(); //런타임오류발생
					//객체가 생성되지 않은 상태에서 메소드 호출(인스턴스메소드 호출함)
					//프로그램은 이곳에서 강제 종료.
		System.out.println("end...");
	}
}
class Test4{ // 붕어빵 틀 만드는곳 
	private int a=10; //인스턴스변수.private이므로 클래스 내에서만 접근가능
	int b; //인스턴스 변수. 동일 패키지의 다른 클래스에서 접근가능.
	
	//인스턴스 메소드
	public void print() {
		++a;
		System.out.println(a+":"+b);
	}
}