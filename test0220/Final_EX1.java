package test0220;

public class Final_EX1 {
	public static void main(String[] args) {
		
	}

}
/*
final class Sam{ //final Ŭ���� : ����Ŭ������ ����������.
	int a;
}

class Ex extends Sam{  //�Ŀ��� :  ����Ŭ���� ���������
	
}
*/

class Demo1{
	int a;
	public final void print() {  //����Ŭ�������� �޼ҵ� �����ǺҰ�
		System.out.println(a);
	}
}

class Test1 extends Demo1{
//	public void print() {  //�Ŀ���. ������ ���ؼ� ����

	final int x;
	final int y=10;	//�ݵ�� �ѹ� �ʱ�ȭ�� �̷��������.
					//�ν��Ͻ� final������ �����, ������, �ʱ�ȭ������ �ʱ�ȭ����
	static final int A;
	static final int B=10;;
			//static final������ ����ÿ� �Ǵ� static�ʱ�ȭ������ �ʱ�ȭ�ؾ��Ѵ�.
			//static final������ �����ڿ��� �ʱ�ȭ �Ұ�.
	
	static {
		A=5;
	}
	
	public Test1() {
		x=5;
	}
	
	public void write() {
		final int n=10;
		//n=20; //�Ŀ���. final������ ������ �Ұ�
		//x=25; //�Ŀ���. final������ ������ �Ұ�
		System.out.println(x+":"+y+":"+n);
	}
}
