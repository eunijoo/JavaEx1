package test0203;

import java.util.Scanner;

public class WhileEx17 {
	public static void main(String[] args) {
	//������ �Է¹޾� 1���� �Է¹��������� ¦���ձ��ϱ�
	 Scanner sc=new Scanner(System.in);
	 
	 int num;
	 int n,s;
	 
	 System.out.println("����?");
	 num=sc.nextInt();
	 
	 n=0;
	 s=0;
	 
	 while(n < num) {  //1���� num���� ��
		//n++;
		 n+=2;
	 	s+=n;
	 }
	 System.out.println("���: "+s);
	 sc.close();
	 
	}
}
