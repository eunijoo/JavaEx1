package test0217;

public class Lang_Math_Class_EX14 {
	public static void main(String[] args) {
		double a;

	// PI��
		System.out.println(Math.PI);
	
	//sin30�� ���
		a = Math.sin(30.0/180*Math.PI); //
		System.out.println(a);
		
	//2�� �����ٱ��ϱ�
		a= Math.sqrt(2); //sqrt : ������
		System.out.println(a);
		
	//�Ҽ������� �����ϱ�.	
		a=Math.floor(12.77); // floor : �Ҽ������� ����(�ݿø�����)
		System.out.println(a); //12.0
		
	//2�� 10�±��ϱ�
		a=Math.pow(2,10);
		System.out.println(a);
		
	//����� �������ϱ�
		a=Math.ceil(12.77);
		System.out.println(a); //ceil : ũ�ų� ���� ����
	
	
	}
}
