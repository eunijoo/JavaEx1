package test0128;

public class TypeEx {
	public static void main(String[] args) {
		int a; //a������ ���������� ����.a�� �ʱ�ȭ�� ���� ���� �����̱� ������ ����� �ȵ�
		
	 // System.out.println(a); //������ ����(��������).a��  �ʱ�ȭ�� �Ǿ����� ����.
		
	   //a���� ���������θ� �����ؼ� a���� ��� �����Ͽ� ���� ����.
		
		a=30; //10����
		System.out.println(a); //30
		
		a=030; //8����
		System.out.println(a); //24
		
		a=0x30; //16����
		System.out.println(a); //48
		
		a=0b101; //2����
		System.out.println(a); //5
		
 	 // a=080; //�����Ͽ���. 8�������� 8�� ����.
		
	 // a=2200000000; //int ������ �ʰ��Ͽ� ����
		
		long b;
	 // b=2200000000; //�����Ͽ���.22���� int����� ǥ���Ұ�
		b=2200000000L; //long�� ���
		System.out.println(b);
		
		a=10; //a=10L�� �����Ͽ���(long�� ���).ū�ڷ����� �����ڷ����� ���ԺҰ�
		
	}

}
