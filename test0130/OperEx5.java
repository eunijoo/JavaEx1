package test0130;

public class OperEx5 {
	public static void main(String[] args) {
		int a,b;
		boolean c;
		
		a=10; b=5;
		//c=a&&b; //�Ŀ���,&&(����)�� �ǿ����ڰ� boolean�̿�����.
		
		c=a>b && false;
		System.out.println(c); //false
		
		c=a>b && true;
		System.out.println(c); //true
	}
}
