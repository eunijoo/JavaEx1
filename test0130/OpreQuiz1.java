package test0130;

import java.util.Scanner;

public class OpreQuiz1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		
		System.out.printf("�����Է� :");
		a=sc.nextInt();
		System.out.printf("�����Է� :");
		b=sc.nextInt();
		
		//���̸� ����Ҷ� ���:��*��
		System.out.println("���� :"+(a*b));
		//�ѷ��� ����Ҷ� ��� :(��+��)*2
		System.out.printf("�ѷ� :"+((a+b)*2));
		
		//�Ʒ��ڵ�� ���� �߰��������ְ� ���� ��� ���� �൵ ��.
		//int c;
		//c=((a+b)*2);
		//System.out.println("�ѷ�="+c);
		
		sc.close();

	}

}
