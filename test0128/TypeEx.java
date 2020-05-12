package test0128;

public class TypeEx {
	public static void main(String[] args) {
		int a; //a변수를 정수형으로 선언.a는 초기화가 되지 않은 상태이기 때문에 출력이 안됨
		
	 // System.out.println(a); //컴파일 오류(문법오류).a는  초기화가 되어있지 않음.
		
	   //a값을 정수형으로만 선언해서 a값을 계속 변경하여 선언 가능.
		
		a=30; //10진수
		System.out.println(a); //30
		
		a=030; //8진수
		System.out.println(a); //24
		
		a=0x30; //16진수
		System.out.println(a); //48
		
		a=0b101; //2진수
		System.out.println(a); //5
		
 	 // a=080; //컴파일오류. 8진수에는 8이 없다.
		
	 // a=2200000000; //int 범위를 초과하여 오류
		
		long b;
	 // b=2200000000; //컴파일오류.22억은 int상수로 표현불가
		b=2200000000L; //long형 상수
		System.out.println(b);
		
		a=10; //a=10L은 컴파일오류(long형 상수).큰자료형는 작은자료형에 대입불가
		
	}

}
