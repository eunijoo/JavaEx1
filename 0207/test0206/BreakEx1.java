package test0206;

import java.util.Scanner;

public class BreakEx1 {

public static void main(String[] args) {
		//������ �Է� �޾� �Է� ���� ���� �ձ��ϱ�
		//��, �Է¹��� ���� 0�̸� ���α׷� ����.
		
		Scanner sc=new Scanner(System.in);
		int n,s;
		
		s=0;
		System.out.println("���� �Է�[���� : 0]");  
		while(true) {  
			n=sc.nextInt();
			if(n==0) break;  //0�Է��ϸ� ���� ����(0 �Է� ������ ���ڸ� ��� �Է�)
			s+=n; //�Է¼��ڵ��� �� ���
		}
		System.out.println("���"+s);
		sc.close();
	}
	

}