package test0131;

import java.util.Scanner;

public class OperEx8 {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		int y;
		String s;
		
		System.out.println("�⵵?");
		y=sc.nextInt();
		
		//�⵵�� 4�ǹ���̰�,100�� ����� �ƴϰų�,400�� ����̸� ����. �׷��� ������ ���
		//���� = ���� ? ���϶� : �����϶�
		
		s= (y%4==0 && y%100!=0 || y%400==0) ? "����"  : "���" ; 
		System.out.println(y+":"+s);
					
		sc.close();

	}
}