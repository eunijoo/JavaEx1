package test0204;

import java.util.Scanner;

public class ForQuiz6 {
//10���� ������ �Է¹޾� �Է¹��� ���� �� ���� �������� ����ϴ� ���α׷�
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n;
		int min;
		
		min=0;
		System.out.println("10���� ���� �Է�: ");
		for (int i=0;i<3;i++) { //ó�� �Է��� �޾�;
			n=sc.nextInt();  //10���� ������ �Է¹޾ƾ��ؼ� for���ȿ��� �ݺ���Ŵ
			if(i==0) { //0�� �ʱⰪ����.
				min=n; //�Է¹������� min�� ����
			}else if(min>n) { 
				min=n;   //�Է¹������� min�� ����
			}
		}
		System.out.println("�ּҰ�:"+min);
		sc.close();
	}
}


