package test0203;

import java.util.Scanner;

public class IfQuiz5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int h,pay; 
		
		System.out.println("�ٹ��ð�?");
		h=sc.nextInt();
		
		if(h>8) {
			pay =8*10000 + (int)((h-8)*10000*1.5); //�Ǽ��� ���� �� ������ int(����)�� ����ȯ	
		}else {
			pay =h*10000;
		}
		
		System.out.printf("�޿� : %,d\n",pay); // �ݾ״������� ,�Է�
		
		sc.close();	

	}

}
