package test0130;

public class ShiftEx1 {

	public static void main(String[] args) {
		int a=126;
		int b;
		//�������� 3bit�̵�
		b= a<<2; //�������� 2bit�̵� , a*4�� ����
		System.out.println(b);

		b= a>>2; //���������� 2bit�̵� , a/4�� ����
		System.out.println(b);
		//�������� 3bit�̵�
		a=32;
		b= a << 3; //�������� 3bit�̵�, a/8�� ����
		System.out.println(b); //4
		
		a=-32;
		b= a << 3; //�������� 3bit�̵�, a/8�� ����
		System.out.println(b); //-4
		
    	// >>>������ shift������ : ��Ʈ�̵����� ���� ������� 0���� ä���.		
		a=32;
		b= a >>> 3; //
		System.out.println(b);//4
		
		a=-32;
		b= a >>> 3; //
		System.out.println(b);
		
	}

}
