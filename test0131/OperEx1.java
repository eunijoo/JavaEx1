package test0131;

public class OperEx1 {

	public static void main(String[] args) {
		short a,b;
		/*
		 a+=b;  //byte,short,char ���� ����ȯ�� �Ͼ�� �ʴ´�.
		 a=a+b; //byte,short,char ���� int(����)�� ����ȯ�Ͼ��.
		 
		 a-=b;
		 a=a-b;
		 
		 */
		
		//a+=b;// ������ ����, �ʱ�ȭ�� �Ǿ����� �ʾƼ�
		
		a=10;
		b=5;
		//a=a+b; //int�� ����ȯ�� �Ͼ�Ƿ� �����߻�
		a+=b; //�� �İ� ������������ ����ȯ�� �Ͼ�� �ʰ�,�ӵ��� ������.(����������)
		System.out.println(a);
		
		char c='A';
		c+=10;
		System.out.println(c); //'K'
		
		float f =3.5f;
		char ch = 'A';
		
		ch+=f;//65�� +3.5�� �� 68.5�� 68��  char�� �Ǿ� 'D'�� ��.
		System.out.println(ch); //'D' 
		
		f =3.5f;
		ch = 'A';
		f+=ch;
		System.out.println(f); //68.5
	}

}
