package test0224;

public class Jenerics_Interface_Ex9 {
	public static void main(String[] args) {
		User9<Number> ob1=new User9<>();
		ob1.set(new Integer(30));	// Ÿ�ԸŰ������� ��Ӱ���� ����.
		System.out.println(ob1.get());
		
		User9<Integer> ob2= new User9<>();
		ob2.set(new Integer(50));
	//	User9<Number> ob3=ob2;  //Integer�� �ƹ����� Number�� ������, User9<Integer>�� �ƹ����� User9<Number> �� �ƴϴ�. (���ϰ��谡 �ƴϿ��� ��ӺҰ�)
								//���ʸ� ��ĳ���� �Ұ�.
	
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