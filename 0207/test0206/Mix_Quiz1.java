package test0206;

import java.util.Scanner;
//������ �̿��Ͽ� ��ǻ�Ϳ� ����,����,�� ������ �����ϴ� ���α׷� �ۼ�.
//����:  ��ǻ�ʹ� 1~3������ ������ �߻�
//		1:����, 2:���� 3:��
//		������ 1~4������ ���� �Է��Ͽ� ������ ����.1~4���� ���� �Է��ϸ� �ٽ� �Է�.
public class Mix_Quiz1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int com,user;
		
		while(true) {
			do {
				System.out.println("1.����   2.����   3.��   4.����=>");
				user=sc.nextInt();
				
			}while(user<1 || user>4);
			if(user==4) break;
			
			com=(int)(Math.random()*3)+1; 									
			System.out.println("��ǻ�� : "+(com==1?"����":(com==2?"����":"��")));
			System.out.println("��� : "+(user==1?"����":(user==2?"����":"��")));
			
//user�� com�� ���Ͽ� ���� �̰���� ����ϱ�.
			if(com==user) {
				System.out.println("�����ϴ�.");				
			}else if(user==1 && com==3 ||user==2 && com==1||user==3 && com==2) {
				System.out.println("����� �̰���ϴ�.");	
			}else {
				System.out.println("����� �����ϴ�.");
			}
		}
		sc.close();
	}
}
