package test0205;

import java.util.Scanner;

public class ForQuiz201 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int diff, min=0, result=0;
		
		System.out.println("5���� �����Է�...");
		for(int i=0; i<5; i++) {
			n=sc.nextInt();
			diff = n>7 ? n-7 : 7-n;
			
			if(i==0 || min > diff) { 
				min = diff;
				result = n;
			}
		}
		
		System.out.println("���� ������ : "+result);
		
		sc.close();

	}

}
