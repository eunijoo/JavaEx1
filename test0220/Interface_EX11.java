package test0220;

public class Interface_EX11 {

	public static void main(String[] args) {
		//Demo11 ob=new Demo11(); //�Ŀ��� .�������̽��� ��ü���� �Ұ�.
		
		//�͸�Ŭ���� :Interface_EX11$1.class �� Ŭ������ ����
		Demo11 ob=new Demo11() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("�͸� Ŭ������ ������...");
			}
		};//1ȸ��//1ȸ�� Ŭ����
		ob.print();
	}	
}
//�͸� : Ŭ������ �ʿ��ѵ� �̸��� ����.
//���� 11�� ���� Ŭ������ �ִµ� �ѹ����� ��ġ�� Ŭ���� 
interface Demo11{
	public void print();
}