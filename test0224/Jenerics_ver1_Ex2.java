package test0224;

public class Jenerics_ver1_Ex2 {
	public static void main(String[] args) {
		User2 ob=new User2();
		String s;
		
		ob.set("korea");
		System.out.println(ob.get());
		s= (String)ob.get(); //다운캐스팅이 돼서 문제가 없이 스트링,인티져 다 쓸수있다.
		System.out.println(s.length());
		
		ob.set(new Integer(20));  //다운캐스팅이 안됨
		System.out.println(ob.get());
	//	s= (String)ob.get();  //런타임오류. 인티저20은 문자열로 못바꿈
	}
}

class User2{
	private Object data;
		
	public void set(Object t) {
		data =t;
	}
	
	public Object get() {
		return data;
	}
	
	
}
