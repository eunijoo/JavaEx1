package test0131;

public class OperEx4 {

	public static void main(String[] args) {
		char a='A';
		char b;
		
		b='A'+3; //���ͳο����� ����ȯ�� �Ͼ�� �ʴ´�.
		System.out.println(a+","+b);
		
		//b=a+3; //����, int�� ����ȯ�� �Ͼ�� ����
		b=(char)(a+3);
		System.out.println(a+","+b);
			
		b=60+20; //�����ϴ�.
		System.out.println(b);
		//byte,short,char,int �� ���� �޶�����.
		//1-9 ���� ����(����)//����ȯ�� �Ͼ�� �ʴ´�.
	}

}
