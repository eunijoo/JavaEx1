package test0203;

import java.util.Scanner;

public class IfQuiz7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		int tot;
		double ave;
		String name;
		
		System.out.print("이름 ?");
		name=sc.next();
		System.out.print("세과목 점수 ?");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		tot=a+b+c;
		ave=(double)tot/3;
		
		// 합격/불합격/과락 판별
		if(a>=40 && b>=40 && c>=40 && ave>=60) {
			System.out.println(name+" : 합격");
		} else if(ave<60) {
			System.out.println(name+" : 불합격");
		} else { // (a<40 || b<40 || c<40) && ave>=60
			System.out.println(name+" : 과락");
		}

		sc.close();
	}
}
