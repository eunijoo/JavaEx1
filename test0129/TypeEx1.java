package test0129;

public class TypeEx1 {
	public static void main(String[] args) {
		float a,b; //�������� �Ǽ�
		double c,d; //�������� �Ǽ�
		
	  //a=0.5; //�����Ͽ���.0.5�� �������� ���ͳ��̹Ƿ� ���������� ���ԺҰ�
		a=0.5f; //0.5F�� �������� ���ͳ�
		b='A'; //char < int < long < float < double
		
		c=0.5; //��������
		d=0.5d; //��������
		
		System.out.println(a+" , "+b+" , "+c+" , "+d);
	}
}
