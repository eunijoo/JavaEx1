package test0219;

public class InheritanceEx4 {
public static void main(String[] args) {
	//Demo4 dd=new Demo4();  //�Ŀ���. ���ڰ� ���� �����ڰ� ��� ���ڰ��� �־������.
	Demo4 dd=new Demo4(5); 
	dd.print();
}
}



class Demo4{  //�ƹ����� �����ڰ� �� ���ڰ� ����
	int a;
	
	public Demo4(int a) {
		this.a=a;
		System.out.println("Demo4�����ִ� ������");
	}
	
	public void print() {
		System.out.println(a);
	}
}

class Test4 extends Demo4{
	//�����ڸ� ������ ������ ���� : ���� Ŭ������ �����ִ� �����ڸ� �����ϹǷ�.
	//�ݵ�� �����ڸ� �����  'super(��);' �� �̿��Ͽ� �ݵ�� ����Ŭ���� �����ڸ� ȣ���ؾ���
	public Test4() {  //������ ����
		super(10);		//�ݵ�� super(��);
	}
}