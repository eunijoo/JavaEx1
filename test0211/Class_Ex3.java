package test0211;

public class Class_Ex3 {  
//�ʵ�(Field)�������� : �ν��Ͻ������� Ŭ���������� �ִ�.
	public static void main(String[] args) { //Ŭ�������� (static)
		
		//Ŭ���������� Ŭ������ �ε��Ǹ鼭 �ѹ��� �޸��Ҵ��� ����(�ڵ����� ��)
		// 	=> <ex>System.out,System.in (in,out�� Ŭ���� ����)
		//Ŭ���� ������ ��ü������ ������� Ŭ�����̸����� ����
		System.out.println(Test3.PI); //System.out�� Ŭ���������� �޸��Ҵ��� �ڵ����� ��
		
		Test3 t1; 
		//System.out.println(t1.b); //�޸��Ҵ��� �ȵǾ����Ƿ� �Ŀ���
		
		t1= new Test3();
		//System.out.println(t1.a);//private�̹Ƿ� �Ŀ���
		System.out.println(t1.b); //0
		Test3 t2 =new Test3();
		
		t2.b=50;		
		System.out.println(t1.b+" : "+t2.b);
		
		//�Ϲ������� Ŭ���� ������ Ŭ���������� �����ϸ�, ��ü�� �������� �ʴ´�.
		t1.PI=10;
		System.out.println(t1.PI+" : "+t2.PI);
	}
}

class Test3{
	//�ν��Ͻ����� : ��ü�� �����ؾ� ���� ����.
//	private int a=10; //����� ���ÿ� �ʱ�ȭ. private: �ܺ����ٺҰ�
	int b; //0���� �ʱ�ȭ	
	
	String name;//null�� �ʱ�ȭ
	
	//Ŭ�������� (static): ��ü�� �������� �ʾƵ� ���ٰ����ϸ�,��� ��ü�� ������ ���� ���´�.
	//					Ŭ���������� ��ü�� ���������ʰ�, Ŭ���������� �����Ѵ�.
	public static double PI=3.141592;
}