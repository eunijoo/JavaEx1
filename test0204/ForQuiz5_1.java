package test0204;

import java.util.Scanner;

public class ForQuiz5_1 {
//10���� ������ �Է¹޾� �Է¹��� ���� �� ���� ū���� ����ϴ� ���α׷�(�Լ����)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n; //���� �Է¹޴� ����
		int max;
		
		max=Integer.MIN_VALUE; //���� ���� ���� �ʱⰪ����
		System.out.println("10���� ���� �Է�: ");
		for (int i=1;i<=10;i++) { //ó�� �Է��� �޾�;
			n=sc.nextInt(); //10���� ������ �Է¹޾ƾ��ؼ� for���ȿ��� �ݺ���Ŵ
			if(max<n) {  //ó���Է¹��� ���� max�� �ʱⰪ����.
				max=n;		 //�Է¹������� max���� ������ �Է¹������� max�� ����.
							//(�Է¹��������� �񱳸� ��)	
			}					
		}
		System.out.println("�ִ밪:"+max);
			
		sc.close();
	}
}


