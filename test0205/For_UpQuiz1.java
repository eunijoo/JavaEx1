package test0205;

import java.util.Scanner;

public class For_UpQuiz1 {
//5���� ������ �Է� �޾� �Է� ���� ���� �� 7�� ���� ����� ���� ����ϴ� ���α׷� 
public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		int n;  //�Է¹޴� ����
		int diff, min=0,result=0; 
		
		System.out.println("5���� ���� �Է�,,");
		for(int i=0;i<5;i++) { //5�� ����
			n=sc.nextInt(); //�Է¹��� ���� n�� ����
			
			diff =n>7 ? n-7 : 7-n;  //���̱��ϴ� ���� //���̸� ���ؼ� �ּҰ��� ���Ѵ�.
			if(i==0 || min>diff) {  //ó�� �Է¹��� ����̰ų� ó���� �ƴѰ��
				min=diff;  //���̰��� min�� ����
				result =n;  //���̰����߿� ū���� result�� ����
			}
		}
		System.out.println("���� ������:"+result);
		sc.close();
	}
}


