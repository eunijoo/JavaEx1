package score1_0212;

import java.util.Scanner;

//����ó��(50�� ������ ����ó��)
//���α׷� �����ϸ� ���������̹����� �߰� 1.�Է� 2.��� 3.�˻� 4.���� 5.����
//�Է¹޴� ����(�������Է�) : �й�,�̸�,����,����,����
//��³��� : ����ó��:�й�.�̸�,��.��,��,����,����,ȯ������,���
//�˻����� : �̸��Է��ϸ� �ش� �������
//--------------------------------------------------------
//������ : �й�,�̸�,����[3](��,��,��),����,����,�ο���(����Է��ߴ��� �˾ƾ��ؼ�)
//		=>�ִ� 50��
//��� : �Է�,���,�˻�,����,����,���,����

public class App {  
//main(�޴��ۼ�)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		
		ScoreService ss = new ScoreService();
		
		while(true) {
			do {
				System.out.println("1.�Է� 2.��� 3.�˻� 4.���� 5.����=>");
				ch=sc.nextInt();
			}while(ch<1||ch>5);
			
			if(ch==5) {
				break;
			}
			switch(ch) {
			case 1:ss.input(); break;	  	//�Է°�1�̸� input
			case 2:ss.print(); break;		//�Է°�2�̸� print
			case 3:ss.findByName(); break;	//�Է°�3�̸� findByName
			case 4:ss.delete(); break;	  	//�Է°�4�̸� delete
			}
		}
		sc.close();
	}
}
