package test0203;

import java.util.Scanner;

public class WhileEx15 {
	public static void main(String[] args) {
		// ������ �Է� �޾� 1���� �Է� ���� ������ �ձ��ϱ�
		Scanner sc=new Scanner(System.in);
		int num;
		int n, s;
		
		System.out.print("����?");
		num=sc.nextInt();
		
		n=0;
		s=0;
		while(n < num) {
			n++;
			s+=n;
		}
		System.out.println("���:"+s);
		
		sc.close();
	}
}
