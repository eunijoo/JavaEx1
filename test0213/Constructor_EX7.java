package test0213;

public class Constructor_EX7 {
	public static void main(String[] args) {
		//Test7 t= new Test7; // �Ŀ���. ���ڰ� ���� �����ڰ� ����
							// �����ڸ� �ϳ��� ����� �����Ϸ��� ����Ʈ�����ڸ� ������ ����
							// ����Ʈ������: �����ڸ� ������ ������ �����Ϸ��� ���� �������.
							//			 ���ڰ� ������,�ƹ��� �ڵ尡 ���� �� ������.
		
		Test7 t=new Test7(10);
	//	System.out.println(t);
		t.write(); //10
	}
}

class Test7{
	private int a;
	
	public Test7(int n) {//������
		a=n;
		System.out.println("���ڰ� �ִ� ������...");
	}
	public void write() {
		System.out.println(a);
	}
	
}
	
