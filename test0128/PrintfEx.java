package test0128;

public class PrintfEx {
	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=25;
		c=a+b;
		
		System.out.println("��:"+c);
		System.out.println(a+"+"+b+"="+c);
		
		System.out.printf("%d + %d = %d\n",a, b, c); //printf�� ������ �Ѿ�� �ʴ´�.
													 //%d�� ����,�����Է°���=�����Է°���
		System.out.format("%d + %d = %d\n",a, b, c); //printf�� ����.
		System.out.println("==================");
		
		
		
		
}
}
