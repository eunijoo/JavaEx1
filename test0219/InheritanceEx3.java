package test0219;

public class InheritanceEx3 {
	//�������
	//1> main�� new�����ڷ� Demo3�� a��  Test3�� x�޸��Ҵ� �� 0���� �ʱ�ȭ (��ü�� �ϳ� ��������� �ʵ尡 �޸��Ҵ����)
	//2> Test3() �������� ù���� ����//this(100);=>Test3(int x)�������ڵ尡 ����Ǵ� ��
	//3> Test3(int x) �������� ù���� ���� : super(); => Demo3()�������ڵ� ù�� ����
	//4> Demo3() �������� ù���� ���� : super(); =>Object)() ������ �ڵ����  //Demo3�� �ƹ���==Object
	//5> Demo3() ������ ������ �ڵ� ����
	//6> Test3(int x) ������. �������� ����
	//7> Test3()������ �������� ����
	
	public static void main(String[] args) {
		Test3 tt1=new Test3();
		tt1.write();
	}

}
//�������ڿ��� super();�� �����ִ�.
class Demo3{  //�ƹ���Ŭ����
	int a=10;
	
	public Demo3() {
		//super(); �� �����ִ�.
		System.out.println("���ھ���  Demo3 ������");
	}
	
	public Demo3(int a) {
		//super(); �� �����ִ�.
		System.out.println("�����ִ� Demo3������");
		this.a=a;
	}
	
	public void pirnt() {
		//super(); �� �����ִ�.
		System.out.println("a : "+a);
	}
}

class Test3 extends Demo3{  //Test3 : �ڽ�Ŭ����
	int x;
	
	public Test3() { //�ƹ��� �Ⱥθ�
		//this�� ������ super();�� ����.
		this(100); //this : ����Ŭ����(����Ŭ����)�� �ٸ������ڸ� ȣ���Ҷ� ���
				   //�ֻ�ܿ��� �� 1���� �θ�������//�ٸ� �����ڸ� ȣ������ ������ super();�� ���� ������ ȣ��
		System.out.println("Test3 ���ھ��� ������");
	}
	
	public Test3(int x) {
		//super(); �� �����ִ�.
		this.x=x;
		System.out.println("Test3 �����ִ� ������");
	}
	
	public Test3(int a,int x) {
		super(a); //superŬ������ ������ ȣ��.�ֻ�ܿ��� �ѹ��� ����.
		this.x=x;
		System.out.println("Test3 ���ڰ� 2���� ������");
	}
	
	public void write() {
		//super(); �� �����ִ�.
		System.out.println(a+":"+x);
	}
}