package test0207;

import java.util.Scanner;

public class assignment2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,temp;
		
		do {
			System.out.print("��?");
			n1=sc.nextInt();
		} while (n1<0);
		
		n2=0;  // n1�� 10���� ���� �������� ���� �� 
		temp=n1;
		
	
		
		while(temp>0) {
			n2*=10; // �ڸ����� �÷��ֱ� ���� (1->10->100->...)
			n2+=temp%10; // ���� 10���� ���� ������(���� ���� �ִ� �� ���)
			temp/=10; // ���� 10���� ���� �� 
			
			// ���� �̿��Ͽ� �� ���� ���� �ִ� �� ����ϱ� 
		}
		
		System.out.println(n1+","+n2+","+(n1+n2));
					
		sc.close();
	}
}