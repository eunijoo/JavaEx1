package test0204;

import java.util.Scanner;

public class ForQuiz3 {
//10���� ������ �Է¹޾� �Է¹��� ���� ��,¦�� ����,Ȧ�������� ����ϴ� ���α׷�.
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int  s1,s2;
		
		s1=s2=0;
		System.out.println("����10�� �Է�");
		for(int i=0;i<10;i++) {
			n=sc.nextInt(); //10�� �ݺ�(10�� �Է�)
			if(n%2==0) {
				s1++;
			}else {
				s2++;
			}
		}
		System.out.println("¦������ : "+s1);
		System.out.println("Ȧ������ : "+s2);
		sc.close();
	}
}


