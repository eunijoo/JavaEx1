package test0203;

import java.util.Scanner;

public class WhileEx16 {
	public static void main(String[] args) {
	//������ �Է¹޾� 1���� �Է¹��������� Ȧ���ձ��ϱ�
	 Scanner sc=new Scanner(System.in);
	 
	 int num;
	 int n,s;
	 
	 System.out.println("����?");
	 num=sc.nextInt();
	 
	 n=1;
	 s=0;
	 
	 while(n <= num) {  //1���� num���� Ȧ����
		//n++;
	 	s+=n;
	 	n+=2;
	 }
	 System.out.println("���: "+s);
	 sc.close();
	 
	}
}
