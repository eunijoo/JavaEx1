package test0213;

public class This_EX10 {
	public static void main(String[] args) {
		
		
	}
}

class Test10{
	private int a;
	
	public void set(int a) {
		this.a=a; //���������� �ʵ� ���� �̸��� ���� ��� this���� �Ұ���.
	}
	
	public void fun() {
		System.out.println("fun...");
	}
	
	public void print() {
		this.fun();  //this �������� //this�� ��� funȣ�� ����	 
		System.out.println(this.a); //this�������� //this�� ��� �������� a������ ��� ����.
	}
	
	public static void write() {
		//System.out.println(this.a); //������ ����
		//Ŭ���� �޼ҵ�� ��ü������ �����ϹǷ� ȣ���� ��ü�� ��Ÿ���� this�� ����� �� ����.
		Test10 t=new Test10(); //��ü ����
		
		t.a=10; //Ŭ�����޼ҵ忡���� �ν��Ͻ������� ��ü ���� �Ŀ� ���� ����.
		t.print(); 
	}
}