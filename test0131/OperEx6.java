package test0131;

import java.util.Scanner;

public class OperEx6 {

	public static void main(String[] args) {
		//������ �Է¹޾� ¦������ Ȧ������ �Ǻ�
		Scanner sc=new Scanner(System.in);
		int a;
		String s;
		 
		System.out.println("����?");
		a=sc.nextInt();
		
		s=a%2==0 ? "¦��" : "Ȧ��"	; //(���ǽ� ? �� : ��)
		//s=(a&1)==0 ? "¦��" : "Ȧ��"	; // & �����ڷ� ¦/Ȧ �Ǻ��ϴ� �ٸ����
		System.out.println(a+":"+s);
		
		sc.close();

	}

}
