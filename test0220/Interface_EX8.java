package test0220;

public class Interface_EX8 {

	public static void main(String[] args) {
		//Demo ob=new Demo8(); //�Ŀ���. �߻�Ŭ���� ��ü �����Ұ�
		Test8 ob=new User8(); //��ĳ����
		ob.print();

	}	
}

interface Test8{ //�ƹ���
	public void print();
	public void write();
}

abstract class Demo8 implements Test8{  //�������ؾ���
	public void print() {
		System.out.println("print...");
	}
}

class User8 extends Demo8{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
	
}

