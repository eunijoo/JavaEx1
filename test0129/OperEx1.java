package test0129;

public class OperEx1 {
	public static void main(String[] args) {
		short a=10, b=5 ,c;
		//c=a+b; //+����� int, int�� short�� ������ �� �����Ƿ� �����Ͽ���
		
		//c=(short)a+b; //+������ ���� 
		c=(short)(a+b); 
		
		System.out.println(c);
		
		int x,y; //x�� y�� ���� ���� ����
	//	x=y+'A'; //�����Ͽ���,y�� �ʱ�ȭ ���� �ʾ����Ƿ�.
		
		y=10;
		x=y+'A';
		System.out.println(x);
		
	}

}
