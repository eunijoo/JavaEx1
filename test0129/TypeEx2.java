package test0129;

public class TypeEx2 {

	public static void main(String[] args) {
		float a=2000000000;
		float b=2000000050; //���е��� ���Ƽ� 20������ ������ ��(50�� �߸�)-������ ��û ŭ
		
		double c=2000000000; //float ���ٴ� ������ ����
		double d=2000000050;
		
		System.out.println(a+","+b);
		System.out.println(c+","+d);
		
		System.out.printf("%.2f %.2f\n",a,b); //�� �� ��� 20���� ���
		System.out.printf("%.2f %.2f\n",c,d); //c,d,���� ���� ���
		
		System.out.println(a==b); //true
		System.out.println(c==d); //false
		
		c=0.015;
		d=0.0000072;
		System.out.println(c+","+d);

		
		
	}

}
