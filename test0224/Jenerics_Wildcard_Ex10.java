package test0224;

public class Jenerics_Wildcard_Ex10 {
	public static void main(String[] args) {
		User10<Integer>ob =new User10<>();
		
		ob.set(new Integer(10));
		
	//	User10<Number> ob2= ob; //�Ŀ���. ��Ӱ��谡 �ƴ�.
		User10<?> ob2 =ob;
		//? : ���Ŭ������ �������̽��� �����ϴ�.
		//	   ���ʸ�Ÿ�Կ� ���������� �ʴ� �޼ҵ� ���� ȣ���Ҷ� ���.
		
	//	ob2.set(new Integer(50)); //����. �ڷ����� �������� ���� ����.
		ob2.print();  //print�� ���������� �ʾƼ� ȣ�� ����.
	}
}
//	get/set �� t���� ������ , print�� ���������� ����.
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