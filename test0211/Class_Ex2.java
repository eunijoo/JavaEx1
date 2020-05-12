package test0211;

public class Class_Ex2 {  

	public static void main(String[] args) {
		
		Bank b1; //참조변수(레퍼런스변수) 선언
		//b1.name="홍길동"; //컴오류 =>인스턴스 변수나 인스턴스 메소드는 객체가 생성되어야 접근가능
		
		//참조변수메모리 할당(생성자를 호출)
		b1=new Bank();
		b1.name="홍길동"; //디폴트접근제어자는 동일패키지의 클래스에서는 접근가능.
		//b1.money=1000; //컴오류 => private는 외부에서 접근불가
		b1.saving(1000);
		
		//참조변수 선언과 동시에 메모리 할당
		Bank b2=new Bank();
		b2.name="이순신";
		b2.saving(500);
		
		System.out.println(b1.name+ ": "+b1.getMoney());
		System.out.println(b2.name+ ": "+b2.getMoney());
	}
		
}

class Bank{
	//인스턴스 변수나 인스턴스 메소드는 객체가 생성되어야 호출 할 수있다.
	
	//인스턴스 변수. 변수 선언시 초기화 가능
	//private : 클래스 내에서만 사용 가능한 변수.외부접근불가
	private int money;
	//money 0;  //컴오류. 실행문이 올수없다.
	
	//인스턴스변수.
	//접근제어자가 디폴트(생략한경우) 인 경우 동일한 패키지에서만 접근가능
	String name;
	
	//인스턴스 메소드
	public int getMoney() {
		return money;
	}
	
	//인스턴스메소드
	public int draw(int m) {  // m : 매개변수
		//인출
		if(m>money)
			return 0;
		
		int s; // s: 지역변수(메소드 안에있는 변수를 지역변수라고 함)
		s=money-m;  //잔고에서 돈을뺌
		money=s;
		
		return m;
	}
	
	//인스턴스 메소드
	public void saving(int m) {
		//입금
		money+=m; //돈이 쌓임
	}
}
	
