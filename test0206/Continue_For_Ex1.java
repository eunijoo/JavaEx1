package test0206;

import java.util.Scanner;

public class Continue_For_Ex1 {

public static void main(String[] args) {
		//5���� Ȧ���� �Է¹޾� �Է¹��� Ȧ���� �ձ��ϱ�.
		//��, �Է¹��� ���� 0���� ���ų� ¦���̸� �ٽ� �Է� �ޱ�
		Scanner sc=new Scanner(System.in);
		
		int s,n; //s:�հ躯��
		System.out.println("0�̻��� 5���� Ȧ�� �Է�...");
		s=0; //�հ�
		for(int i=1;i<=5;i++) {
			n=sc.nextInt();
			if(n<0 || n%2==0) {
				i--;
				continue;
			}
			s+=n; //5���� �� �ջ�.
		}
		System.out.println("��� : "+s);
		sc.close();
	}
	

}
