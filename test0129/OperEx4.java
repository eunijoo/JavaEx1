package test0129;

public class OperEx4 {

	public static void main(String[] args) {
		int a=10, b=4;
		double c;
		c=a/b;
		System.out.println(c); //
		
		c=(double)(a/b);
		System.out.println(c);
		
		c=(double)a/b; //a�� ������ ĳ�����Ѵ�.
		System.out.println(c);
	}
}
