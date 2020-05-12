 package test0219;

public class OverridingEx9 {
	public static void main(String[] args) {
		
		
		
		Demo9 dd1=new Demo9(); //진짜 데모객체 //데모메모리할당
		System.out.println(dd1);//Demo9@해쉬코드 
//Demo9:아버지 Test9:자식  
		Demo9 dd2=new Test9(); //업캐스팅 :언제나 가능  //데모,테스트 메모리할당 //진짜 new한건 Test 
		System.out.println(dd2);//Test9@해쉬코드
		
		System.out.println(dd2.b); //Demo9의 필드 출력
		dd2.print();//오버라이딩 된 하위클래스메소드 호출, 외부에서는 아버지가 들어올수없다.
					//실행할때 결정됨:동적바인딩 : 다형성
					//메소드와 필드는 다르다.
		
		//dd2.sub();//호출불가 //컴파일러는 Demo9로 본다.
		//int x= dd2.c; //컴파일오류
		
		// int x=(Test9)dd2.b; //정수를 바꿔라여서 오류
		int x=((Test9)dd2).b; 
		System.out.println(x);
		// Test9 tt=(Test9)dd1; //다운캐스팅.런타임오류  (dd1은 업캐스팅한게 아니여서 오류)
								//다운캐스팅은 업 캐스팅한 것만 가능하고, 반드시 캐스팅해야함.
								//아버지가 자식 담으려면 캐스팅해줘야한다.
		
		Test9 tt=(Test9)dd2;//다운캐스팅 (dd2가 업한거여서 가능)
		System.out.println(tt.b);
		
/*
	- 객체간의 캐스팅은 상하관계(자식,부모관계)에서만 가능하다.
	- 업캐스팅은 언제나 가능하다. 
	- 다운캐스팅은 업캐스팅한 것만 가능하고, 반드시 캐스팅이 필요하다.
		 
*/
	//instanceof:해당되는 객체 확인
		System.out.println(dd1 instanceof Test9);	//false  //이 클래스의 객체이니? 확인 
		System.out.println(dd2 instanceof Test9);	//ture
	
		if(dd2 instanceof Test9) {  //해당클래스 객체이면
			Test9 tt2=(Test9)dd2;
			tt2.sub();
		}
	}
}

class Demo9{
	int a=10;
	int b=20;
	
	public void print() {		// 1>
		System.out.println(a+":"+b);
	}
}

class Test9 extends Demo9{
	int b=200;
	int c=300;
	
	public void print() {		// 2>
		System.out.println(a+":"+b+":"+c);	//10:200:300
	}
	
	public void sub() {
		System.out.println(a+":"+super.b+":"+c); //10:20:300
		super.print(); 	//1 >호출
		//print(); 		// 2>호출
	
	}
}