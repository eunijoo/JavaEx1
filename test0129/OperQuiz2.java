package test0129;

import java.util.Scanner;

public class OperQuiz2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t,h,m,s;
		
		System.out.print("�ʸ� �Է��ϼ��� ?");
		t=sc.nextInt();
		
		h=t/3600;
		m=(t-h*3600)/60; //��,�ð����� ���� ���� ����
//		m=(a/60)%60; //�� �İ� ������ �ٸ����
		s=t%60;
		
		System.out.printf("%d�ʴ� %d�ð� %d�� %d�� �Դϴ�.",t,h,m,s);
//		System.out.printf(t+"�ʴ�" +h+"�ð�" +m+"��"+s+"�� �Դϴ�."); //�� �ڵ�� ������ �ٸ����
		sc.close();
	}

}
