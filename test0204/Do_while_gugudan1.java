package test0204;

import java.util.Scanner;

public class Do_while_gugudan1 {
	//���� �Է¹޾� ������ ���,��, �Է¹��� ���� 1-9 �� ����� ���Է�.
	public static void main(String[] args) {
		
		int dan,n;
		Scanner sc=new Scanner(System.in);
		
		do {   //1-9�� ��� �Է��� �� ��� ���Է��ϴ±���.
			System.out.println("��?");
			dan=sc.nextInt();		
		}while(dan<1 || dan>9);
		
		n=0;
		while(n<9) {  //������ ��±���
			n++;
			System.out.printf("%d*%d=%d\n",dan,n,dan*n);
		}
		
		sc.close();
	
	}
}

