package test0219;

public class InheritanceEx1 {

	public static void main(String[] args) {
		Demo1 d=new Demo1(); //Demo �� ��ü����
		System.out.println(d.b);
		//	b.print(); //�Ŀ���.//print�� �ڽĲ����� �ƹ����� ����(����Ŭ���� �޼ҵ峪 �ʵ� ���ٺҰ�)
		
		Test1 t= new Test1(); //Test1�� ��ü����
		t.write(); //write�� �ƹ������� �ڽ��̴ϱ� ��������
		//	System.out.println(t.a); //�Ŀ��� //a�� private�̹Ƿ� ����� �ȵ�
		System.out.println(t.b+":"+t.c);
		
		t.print();
	
	}

}
//Demo�� �ƹ����� Object
//�޸��Ҵ�޾ƾ� �ڽ��� ����.(�ƹ����� �Ʊ��϶��� �ִµ� �ƹ���(�Ʊ��϶�)�� �ڽ��� ������)
class Demo1{
	private int a=10;
	protected int b=20;
	public int c=30;
	
	public void write() {
		System.out.println(a+":"+b+":"+c);
	}
}

class Test1 extends Demo1{
	int x=100;
	
	public void print() {
		System.out.println(x+":"+b+":"+c);
	}
	public void fun() {
		write();
	}
}
