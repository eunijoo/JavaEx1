package test0220;

public class Interface_EX7 {

	public static void main(String[] args) {
		User7 ob=new User7();
		Test7 tt=new User7(); //��ĳ����
		
		tt.write();
		((Demo7)tt).print(); //User7Ŭ������ Demo7�������̽��� �����Ǿ������Ƿ�.
		
		Demo7 dd=ob; //��ĳ���� 
		dd.print(); //����� ����Ʈ�� ������ �־ ����Ʈ�ۿ� �ȵ�.
					//����Ʈ ������������� �ٿ�ĳ�����ؼ� User�� �����.
	}	
}

interface Demo7{
	public void print();
}

interface Test7{
	public void write();
}

//�ΰ� �̻��� �������̽� ���� ����
class User7 implements Demo7, Test7{

	@Override
	public void write() {
		System.out.println("write...");
	}

	@Override
	public void print() {
		System.out.println("print...");
	}
}

