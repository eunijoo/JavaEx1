package test0213;

public class This_EX8 {
	public static void main(String[] args) {
		Test8 ob= new Test8();
		ob.write();
		
		Test8 ob2= new Test8(10);
		ob2.write();
		
		
	}
	
}

class Test8{
	private int a;
	
	//������ �ߺ� ����
	public Test8() {
		this(5); //this : �����ڿ��� �ٸ� �����ڸ� ȣ��(�ٸ� �������� �ڵ� ����)
				 //		    �ֻ�ܿ��� �ѹ��� ȣ�Ⱑ��

		
	  //Test8(5); //�Ŀ���.�����ڴ� new �������� �������.
		new Test8(5); //��ü�� 2�� ����(main�� �ϳ�, Test8�� �ϳ�)
		System.out.println("���ھ��� ������");
	}
	
	public Test8(int n) {
		a=n;
		System.out.println("���ڰ� �ִ� ������...");
	}
	
	public void write() {
		System.out.println(a);
	}
	
	
}
