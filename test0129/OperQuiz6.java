package test0129;

import java.util.Scanner;

public class OperQuiz6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double kg,cm,m,bmi;
		
		System.out.println("ü��(kg) ?");
		kg=sc.nextDouble();
		
		System.out.println("Ű(cm) ?");
		cm=sc.nextDouble();
		
		m=cm/100;
		
		bmi=kg/(m*m);
		
		System.out.printf("������ :%.2fkg\n",kg);
		System.out.printf("Ű :%.2fm\n",m);
		System.out.printf("BMI :%.1f\n",bmi);
			
		sc.close();
	}

}
