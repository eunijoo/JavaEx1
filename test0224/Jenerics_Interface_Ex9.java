package test0224;

public class Jenerics_Interface_Ex9 {
	public static void main(String[] args) {
		User9<Number> ob1=new User9<>();
		ob1.set(new Integer(30));	// 타입매개변수에 상속관계는 성립.
		System.out.println(ob1.get());
		
		User9<Integer> ob2= new User9<>();
		ob2.set(new Integer(50));
	//	User9<Number> ob3=ob2;  //Integer의 아버지는 Number가 맞지만, User9<Integer>의 아버지는 User9<Number> 가 아니다. (상하관계가 아니여서 상속불가)
								//제너릭 업캐스팅 불가.
	
	}
}


class User9<T>{
	private T t;
	
	public void set(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
}