package test0213;

public class This_EX9 {
	public static void main(String[] args) {
		Test9 t1=new Test9(); //��ü����
		//��ü�� ����ϸ� "Ŭ������@�ؽ��ڵ�"�� ���.
		System.out.println("main"+t1);// maintest0213.Test9@15db9742 ��µ�
		t1.print();
		System.out.println("==============================");
		
		Test9 t2=new Test9();
		t2.set(200);
		System.out.println("main"+t2); //maintest0213.Test9@6d06d69c ��µ�
		t2.print();
		
	
	}
}

class Test9{
	private int a=10;  // a=10; : ��ü��
	
	public void set(int a) {  //(int a):�������� // �켱������ ���������� ����.
		this.a=a; //�������� a�� ��ü������ �־��
	}
	
	public int get() {
		//return a;
		return this.a;
	}
	
	public void print() {
	//	System.out.println(a); //�����ƴ�(a�� �ϳ����� this�� �����߾��)
	//	this�� ȣ���� ��ü�� ��Ÿ���� Ű����
		System.out.println(this);
		System.out.println(this.a); //t1�� �ҷ����� t1��  //t2�� �ҷ����� t2��
	}
}