package test0211;

public class Class_Ex4 {  
//�ʵ�(Field)�������� : �ν��Ͻ������� Ŭ���������� �ִ�.
	public static void main(String[] args) { //Ŭ�������� (static)
		Test4 t1; //��ü ����. �ʱ�ȭ�������� ����
		//t1.print(); //�޼ҵ�ȣ��.�Ŀ���.�ν��Ͻ� �޼ҵ�� ��ü�� �����Ǿ�� ȣ�Ⱑ��
		t1= new Test4(); //�ؾ �ֹ���  //��ü ����.�����ڸ� ȣ���ؾ� ��ü��������
		t1.print(); //11:0
		t1.b=5;
		t1.print();//12:5 //2���θ��ſ��� ++a�� 2��������
		
		//t1=null;  ///t1:�ּҸ� ����������. //������ü���ִ� ���(ȸ����)
		
		Test4 t2=null; //null�� �ʱ�ȭ. null:��ü�� �������� ���� �����
		t2.print(); //��Ÿ�ӿ����߻�
					//��ü�� �������� ���� ���¿��� �޼ҵ� ȣ��(�ν��Ͻ��޼ҵ� ȣ����)
					//���α׷��� �̰����� ���� ����.
		System.out.println("end...");
	}
}
class Test4{ // �ؾ Ʋ ����°� 
	private int a=10; //�ν��Ͻ�����.private�̹Ƿ� Ŭ���� �������� ���ٰ���
	int b; //�ν��Ͻ� ����. ���� ��Ű���� �ٸ� Ŭ�������� ���ٰ���.
	
	//�ν��Ͻ� �޼ҵ�
	public void print() {
		++a;
		System.out.println(a+":"+b);
	}
}