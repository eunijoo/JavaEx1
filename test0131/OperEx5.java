package test0131;

import java.util.Scanner;

public class OperEx5 {

	public static void main(String[] args) {
/*	
		int a=10,b=5;
		int c;
		
		c=a>b ? a:b;
		System.out.println("ū�� :"+c);
*/
		//������ �Է� �޾� ���밪 ���ϱ�
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		System.out.println("����?");
		a=sc.nextInt();
		
		//���밪 ���ϱ�
		b=a>0 ? a:-a; // (���ǽ� ? ��/����� : ��/�����)
		System.out.println(a+"�� ���밪 :"+b);
		
		sc.close();
	}
}
