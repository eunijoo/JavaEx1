package test0130;

public class OperEx3 {
	public static void main(String[] args) {
		char a='A',b;
		
	//	b=a+1; //�Ŀ���.����+����=���� / char+int => int+int=>int
	//	b=(char)(a+1); //'B'
		
	//++,-- : byte,short,char���� ����� int�� ����ȯ�� �Ͼ�� �ʴ´�.
		
		b=++a; //����ȯ�� �Ͼ�� ����. // ���� �ڵ庸�� �ӵ��� ������.
		System.out.println(a+","+b); //'B' , 'B'
	
		a='A';
		b= a++;
		System.out.println(a+","+b); //'B' , 'A'	
	}
}
