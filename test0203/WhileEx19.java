package test0203;

import java.util.Scanner;

public class WhileEx19 {
	public static void main(String[] args) {
	//���� �Է¹޾� �Է¹��� ���� ������ ���
	 Scanner sc=new Scanner(System.in);
	 
	 int dan,n;
	 
	 System.out.println("��[1-9]?");
	 dan=sc.nextInt();
	 n=0;
	 
	 while(n<9) {
		 n++;
		 System.out.printf("%d*%d=%d\n",dan,n,dan*n);
	 }
	
	 sc.close();
	 
	}
}
