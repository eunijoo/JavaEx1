package test0213;

public class Intial_EX12 {
	public static void main(String[] args) {
		Test12 t1=new Test12();
		Test12 t2=new Test12();
		
		t1.print();
		t2.print();
/*
 		--Ŭ������ �ε���
		 1> static ����(b) �޸� �Ҵ� �ʱ�ȭ
		 2> static �ʱ�ȭ �� ����
		  ��, 1>2>�� �ѹ��� ����
		  
		--��ü�� �����ɶ� ����
		 1> ��ü �޸� �Ҵ�(�ν��Ͻ� ���� �޸� �Ҵ� �� �ʱ�ȭ)
		 2> �ʱ�ȭ ��
		 3> ������ 
*/
		
	}
}

class Test12{
	private int a;
	static int b;
	
	static {
		//static �ʱ�ȭ ��. Ŭ������ �ε��ɶ� �ѹ��� ����.
		b=100;
		//a=5; //�Ŀ���. static�̿��� �ȵ�.
		System.out.println("static �ʱ�ȭ ��");
	}
	
	{
		//�ʱ�ȭ ��
		//��ü�� �����ɶ����� ����.
		a=10;
		System.out.println("�ʱ�ȭ ��...");
	}
	
	public Test12() {
		//��ü�� �����ɶ� ���� ����
		System.out.println("������...");
	}
	
	public void print() {
		a++;
		b++;
		System.out.println(a+":"+b);
	}
}