package test0203;

import java.util.Scanner;

public class IfQuiz7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		int total;
		double ave;
		String name;
		
		System.out.println("�̸�?");
		name = sc.next();
		
		System.out.println("������ ���� �Է�");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		total = a+b+c;
		ave=(double)total/3; //�Ǽ��̴ϱ� double�� ����ȯ ��Ŵ.
		
		/*if(40<=a && 40<=b && 40<=c && 60<=ave) {
			System.out.println("�հ�");
		}else if(60<=ave && 40>a || 40>b || 40>c) {  //�´¹�������� ���ǽ��� �ִ��� ���̴°� ����.
			System.out.println("����");
		}else {
			System.out.println("���հ�");
		}*/
		if(40<=a && 40<=b && 40<=c && 60<=ave) {
			System.out.println(name+"�հ�");
		}else if(ave<60) { 
			System.out.println(name+"���հ�");
		}else {
			System.out.println(name+"����");
		}
		sc.close();	
	}

}
