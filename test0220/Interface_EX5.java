package test0220;

public class Interface_EX5 {
	public static void main(String[] args) {
	//	Demo5 ob=new Demo5();  //�������̽��� ��ü�����Ұ�(�������̽��� �߻�Ŭ���� �����̿��� �� �ȸ��������)
		
		Demo5 ob=new Test5(); //��ĳ����
		ob.print();
	//	ob.sub(); //�����Ͽ��� =>Demo�ȿ� sub�ִ�?�� Ȯ���ϸ��(new�� ����ȵ�=>new�� ����ÿ��� )
		
		((Test5)ob).sub(); //�ٿ�ĳ����. ��¥�� Test5��ü

	}
}

//���� �ְ�, ���ǰ� ���� �߻�Ŭ������ ����.
interface Demo5{
	public static final double PI=3.141592; //final ���
	public int A=10;	//static final�� ��� static final 
	
	public abstract void print(); //�޼ҵ� ����
	void fun(); //public �� ��� public, abstract�� ��� abstract =>�����Ϸ��� �ڵ����� ����.
}

//�������̽��� �����ϴ� Ŭ����
class Test5 implements Demo5{
	int a=10;
	
	@Override
	public void print() {
		System.out.println("print...");
	}

	@Override
	public void fun() {
		System.out.println("fun...");
		
	}
	
	public void sub() {
		System.out.println("sub...");
	}
	
}