package test0131;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//������ �Է¹޾� Ȧ������ �Ǻ�
		int n;
		String s;
		
		System.out.println("����?");
		n=sc.nextInt();
		s="Ȧ���� �ƴϴ�"; //s�� �ʱ�ȭ����. ¦���� �Է����� ��� if�� ��ȭ�ϱ� ������ s�� �����̾���. �����ָ� �����Ͽ���
		if(n%2==1) {  //if((n&1)==1) {
			s="Ȧ��";
		}
		System.out.println(n+":"+s);
		
		sc.close();
	}

}
