package test0204;

import java.util.Scanner;

public class WhileQuize1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num;
		int n,s1,s2,s3;
		
		System.out.println("�����Է�");
		num=sc.nextInt();
		
		n=0;
		s1=s2=s3=0; //1���ʹ�������ؼ� 0���� �ʱ�ȭ�����ְ���.
		
		while(n<num) {
			n++;
			s1+=n; //��ü�� ���� 
			
			if(n%2==0) { //¦Ȧ����
				s2+=n; // ¦���� ���� 	
			}else {
				s3+=n; // Ȧ���� ����
			}
		}
		System.out.println("1~"+num+" ��  =   "+s1);
		System.out.println("1~"+num+" ¦�� �� ="+s2);
		System.out.println("1~"+num+" Ȧ�� �� ="+s3);
		
		sc.close();
	}

}
