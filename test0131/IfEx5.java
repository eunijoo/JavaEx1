package test0131;

import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		// �� ���� �Է¹޾� ���������� ū�� ������ ���
		Scanner sc=new Scanner(System.in);
		int a,b,c,t;
		
		System.out.println("���� 3��?");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	
		if(a>b) {
			t=a; a=b; b=t;  //a��  b�� ���ؼ� �������� a�� ����. ���� t�� ���ؼ� a���� b���� �ٲ۴�.
		}
	
		if(a>c) {
			t=a; a=c;c=t;//a��  c�� ���ؼ� �������� a�� ����. ���� t�� ���ؼ� a���� c���� �ٲ۴�.
		}
		
		if(b>c) {
			t=b; b=c; c=t;//b��  c�� ���ؼ� �������� b�� ����. ���� t�� ���ؼ� b���� c���� �ٲ۴�.
		}
	
		System.out.println(a+","+b+","+c);
		
		sc.close();	
	}

}
