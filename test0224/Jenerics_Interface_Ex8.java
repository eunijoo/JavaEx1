package test0224;

public class Jenerics_Interface_Ex8 {
	public static void main(String[] args) {
		User8<Integer> ob=new UserImple8<>();
		ob.print(10);
	}
}

interface User8<T>{
	public void print(T t);
	
}

class UserImple8<T> implements User8<T>{
	@Override  //¿Á¡§¿«
	public void print(T t) {
		System.out.println(t);
	}
	
}