package test0203;

import java.util.Scanner;

public class IfQuiz7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		int tot;
		double ave;
		String name;
		
		System.out.print("�̸� ?");
		name=sc.next();
		System.out.print("������ ���� ?");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		tot=a+b+c;
		ave=(double)tot/3;
		
		// �հ�/���հ�/���� �Ǻ�
		if(a>=40 && b>=40 && c>=40 && ave>=60) {
			System.out.println(name+" : �հ�");
		} else if(ave<60) {
			System.out.println(name+" : ���հ�");
		} else { // (a<40 || b<40 || c<40) && ave>=60
			System.out.println(name+" : ����");
		}

		sc.close();
	}
}
