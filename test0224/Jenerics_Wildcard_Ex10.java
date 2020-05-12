package test0224;

public class Jenerics_Wildcard_Ex10 {
	public static void main(String[] args) {
		User10<Integer>ob =new User10<>();
		
		ob.set(new Integer(10));
		
	//	User10<Number> ob2= ob; //컴오류. 상속관계가 아님.
		User10<?> ob2 =ob;
		//? : 모든클래스나 인터페이스가 가능하다.
		//	   제너릭타입에 의존적이지 않는 메소드 등을 호출할때 사용.
		
	//	ob2.set(new Integer(50)); //에러. 자료형이 결정되지 않은 상태.
		ob2.print();  //print는 의존적이지 않아서 호출 가능.
	}
}
//	get/set 은 t한테 의존적 , print는 의존적이지 않음.
class User10<T>{
	private T t;
	
	public void set(T t) {
		this.t=t;
	}
	
	public T get() {
		return t;
	}
	public void print() {
		System.out.println(t);
	}
}