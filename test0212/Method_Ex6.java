package test0212;
//�ڹٰ� ���������� : API
public class Method_Ex6 {  //main�� ���� class �ȿ� ����
	
	private int a=10; //�ν��Ͻ�����
	private int b=20;
	
	static int c=30; //Ŭ��������
	
	public void print() { //�ν��Ͻ� �޼ҵ�
		System.out.println(a+":"+b);
	}
	public void write() { //�ν��Ͻ� �޼ҵ�
		print();
		System.out.println(c);
	}
	
	public static void fun() {  //Ŭ����(static)�޼ҵ� 
		System.out.println("static �޼ҵ� : "+c);
		Method_Ex6 oo=new Method_Ex6();
		oo.print(); //static �޼ҵ忡�� �ν��Ͻ� �޼ҵ�� ��ü���� ��, ȣ��
	}
		
	public static void main(String[] args) {//Ŭ����(static) �޼ҵ�.
		System.out.println("main :" + c); //���� Ŭ������ ȣ�� ����.
	//	System.out.println("main :" + Method_Ex6.c); //����.
		fun(); //�޼ҵ� ��ü�� ȣ��
		
	//	print(); //�Ŀ���. �ν��Ͻ� �޼ҵ�� ��ü ���� �� ȣ�� ����,
	
		Method_Ex6 ee=new Method_Ex6(); //��ü ����
		ee.a=200; //��ü �����ؼ� ȣ�Ⱑ��
		ee.print();//��ü �����ؼ� ȣ�Ⱑ��
	}
}

	

	
	

