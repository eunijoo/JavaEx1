package test0131;

public class OperEx3 {

	public static void main(String[] args) {
		short a;
		byte b;
		int c;
		long d;
		
		a=10;
		c=a;//�ڵ����� ����ȯ�� �Ͼ��. //a�� int������ ����ȯ�ؼ� c�� ����.
		
		//b=a; //����, ū���� �����Ϳ� ���ԺҰ� //short���� byte������ ũ��.
		b=(byte)a; //������ ����ȯ
		System.out.println(b); //10
		
		a=200;
		b=(byte)a; //������ ����ȯ.overflow�߻�.�߸�����
		System.out.println(b); //-56
		
		c='A'+10;//char +int =>int+int
		System.out.println(c);//75
		
		c=1000000;
		//d= c*c; //int*int =>int(��꿡�� �߸� �Ͼ �Ŀ� d�� �Ѿ)=>long //-727379968
		d= (long)c*c; //long(������ ����ȯ)*int =>long =>long  //1000000000000
		System.out.println(d); 
		
		int e=1,f=2;
		double g;
	 // g=e/f;  // int/int =int(�Ҽ����������� 0(����)�� ����)=>g�� double���̿��� 0.0�� ��(�Ҽ�������)
		g=(double)e/f; //e�� ������ double�� ����ȯ�� //1.0/2�� ���Ǿ� 0.5�� ���� 
		System.out.println(g); //0.5
		

	}

}
