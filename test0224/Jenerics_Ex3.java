package test0224;

public class Jenerics_Ex3 {
	public static void main(String[] args) {
		User3<String> ob=new User3<>();  //ob라는 객체를 생성할때 T의 자료형이 결정된다.
	//	User3<String> ob=new User3<String>();  //JDK1.7버전 미만은 이렇게 해야한다.
		ob.set("korea");
		System.out.println(ob.get());
		
	//	ob.set(new Integer(20));  //컴파일오류. 
		User3<Integer> ob2=new User3<>();
		ob2.set(new Integer(20));
		System.out.println(ob2.get());
		
	//제너릭에서 일반적인 방법으로 객체를 생성하면 경고가 발생하며, 
	//프로그램 실행시 잘못된 형변환으로 런타임오류가 발생 할 수 있으므로 ob3처럼 객체를 생성하면 안된다.			
		User3 ob3=new User3();
		ob3.set(new Integer(200));
		System.out.println(ob3.get());
		
		ob3.set(new String("Seoul"));
		System.out.println(ob3.get());
		
		
	}
}

class User3<T>{   //<T> : 제너릭. 실행시 자료형이 결정.  //T자체(제너릭)는 오브젝트로 처리한다/. 
					//< >안에는 아무문자를써도 되는데 대문자로 표기.
	private T data;
		
	public void set(T t) {
		System.out.println(t.getClass().getName()); //해당되는 타입 알수있다.
		data =t;
	}
	
	public T get() {
		return data;
	}
}
