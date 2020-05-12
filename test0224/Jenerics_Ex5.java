package test0224;

public class Jenerics_Ex5 {
	public static void main(String[] args) {
		User5<Integer> ob1=new User5<>();
		ob1.set(100);
		int a=ob1.get();
		System.out.println(a);
		
		User5<Long>ob2 =new User5<>();
		ob2.set(50L);
		long b=ob2.get();
		System.out.println(b);
		
	//	User5<String> ob3=new User5<>(); //컴오류.
		
	}
}

class User5<T extends Number>{  //Number 자식만됨(String은 안됨)
	private T t;
	
	public void set(T t) {
		this.t=t;
	}
	
	public T get() {
		return t;
	}
}