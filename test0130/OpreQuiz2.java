package test0130;

import java.util.Scanner;

public class OpreQuiz2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		double a;
		double b,c;
		
		System.out.printf("������?");
		a=sc.nextInt();
		
		b=a*a*3.14;
		c=(a*2)*3.14;
		
		System.out.println("���� : "+b);
		System.out.printf("�ѷ� : "+c);
		
		//System.out.println("���� : "+(a*a*3.14));
		//System.out.printf("�ѷ� : %.1f ",((a*2)*3.14));
		
		sc.close();
		
		
		
	}

}
