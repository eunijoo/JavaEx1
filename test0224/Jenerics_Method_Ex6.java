package test0224;

public class Jenerics_Method_Ex6 {
	public static void main(String[] args) {
		User6 ob=new User6();
		ob.print("seoul");
		ob.print(100);
	}
}

class User6{
	//제너릭 메소드
	public <U> void print(U u) {
		System.out.println(u.getClass().getName());
		System.out.println(u);
	}
}