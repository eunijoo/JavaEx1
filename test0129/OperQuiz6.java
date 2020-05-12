package test0129;

import java.util.Scanner;

public class OperQuiz6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double kg,cm,m,bmi;
		
		System.out.println("체중(kg) ?");
		kg=sc.nextDouble();
		
		System.out.println("키(cm) ?");
		cm=sc.nextDouble();
		
		m=cm/100;
		
		bmi=kg/(m*m);
		
		System.out.printf("몸무게 :%.2fkg\n",kg);
		System.out.printf("키 :%.2fm\n",m);
		System.out.printf("BMI :%.1f\n",bmi);
			
		sc.close();
	}

}
