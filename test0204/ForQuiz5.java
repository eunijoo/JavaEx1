package test0204;

import java.util.Scanner;

public class ForQuiz5 {
//10���� ������ �Է¹޾� �Է¹��� ���� �� ���� ū���� ����ϴ� ���α׷�
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int max;
		
		max=0;
		System.out.println("10���� ���� �Է�: ");
		for (int i=1;i<=3;i++) { //ó�� �Է��� �޾�;
			n=sc.nextInt();  //10���� ������ �Է¹޾ƾ��ؼ� for���ȿ��� �ݺ���Ŵ
			if(i==1) { //ó���Է¹��� ���� max�� �ʱⰪ����.
				max=n; //�Է¹������� max�� ����
			}else if(max<n) { 
				max=n;   //�Է¹������� max�� ����
			}
					
		}
		System.out.println("�ִ밪:"+max);
			
		sc.close();
	}
}


