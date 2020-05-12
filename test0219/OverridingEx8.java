 package test0219;

public class OverridingEx8 {
	public static void main(String[] args) {
		Test8 tt= new Test8();//Demo8은 자식때문에 메모리 할당이됨(직접 new하지 않았음)
		Demo8 dd=tt;  // 진짜 dd는 Test8 (new한건 Test8이지 Demo8이 아니여서)
		//상위클래스 객체가 하위클래스 객체를 가르킴
		//업 캐스팅(up casting) : 언제나 가능
		
		System.out.println(tt.b+":"+tt.c);  //200 : 300
	
		System.out.println(dd.b); // 20
		dd.print();  //10 : 200 : 300
		//상위클래스의 메소드를 하위클래스에서 재정의하면 상위클래스의 메소드는 숨는다.
		//따라서 상위클래스의 객체가 하위클래스의 객체를 가르키고있으므로 
		//메소드에서는 오버라이딩이 된 하위클래스의 메소드가 호출된다.
		//즉, 외부에서는 메소드가 오버라이딩이 된 경우. 상위클래스의 메소드는 부를 수 없다.
		//하위클래스안에서는 super키워드로 호출가능하다.
		
	  // System.out.println(dd.c); //컴파일오류 // 
	//동적바인딩 :
	//정적바인딩 :
	}
}
class Demo8{  //아버지
	int a=10;
	int b=20;
	
	public void print() {
		System.out.println(a+":"+b);
	}
}

class Test8 extends Demo8{
	int b=200;
	int c=300;
	
	public void print() {
		System.out.println(a+":"+b+":"+c);
	}
	
	public void sub() {
		super.print();//상위메소드 호출가능.
		System.out.println(b+":"+c);
	}
}