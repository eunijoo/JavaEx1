package test0224;

public class Jenerics_multi_Ex4 {
	public static void main(String[] args) {
		User4<String, Integer> ob=new User4<>();
		ob.set("seoul", 1000);
		//ob.set(1000,"seoul");  // 컴오류. 자료형안맞음.
		ob.print();
		
		String s= ob.getT(); //no casting
		System.out.println(s);
	}
}

class User4<T, U>{
	private T t;
	private U u;
	
	public void set(T t,U u) {
		this.t=t;
		this.u=u;
		
	}
	
	public T getT() {
		return t;
	}
	
	
	public U getU() {
		return u;
	}
	
	public void print() {
		System.out.println(t+":"+u);
		System.out.println(t.getClass().getName()+":"+ u.getClass().getName());
	}
}