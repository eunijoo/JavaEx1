package test0131;

import java.util.Scanner;

public class OperEx9 {
//������ �Է¹޾� ������� �������� �������� �Ǻ�
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		String s;
		
		System.out.println("����?");
		a=sc.nextInt();
		
		//����ƴϸ�,�����ƴϸ�,0
		s= a>0 ? "���" :( a<0 ? "����" : "��");
		
		System.out.println("a :"+s);
		
		sc.close();

	}
}