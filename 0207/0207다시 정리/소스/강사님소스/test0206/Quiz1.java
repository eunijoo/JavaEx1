package test0206;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int com, user;
		
		while(true) {
			do {
				System.out.print("1.���� 2.���� 3.�� 4.���� => ");
				user=sc.nextInt();
			}while(user<1||user>4);
			if(user==4) break;
			
			com=(int)(Math.random()*3)+1;
			
			System.out.println("��:" + (com==1?"����":(com==2?"����":"��")));
			System.out.println("��:" + (user==1?"����":(user==2?"����":"��")));
			
			// user�� com�� ���Ͽ� ���� �̰������ ����ϱ�
			if(user==com) {
				System.out.println("���");
			} else if(user==1&&com==3||user==2&&com==1||user==3&&com==2) {
				System.out.println("�̱�");
			} else {
				System.out.println("��");
			}
		}
		
		
		sc.close();

	}

}
