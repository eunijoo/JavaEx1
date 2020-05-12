package test0129;

import java.util.Scanner;

public class OperQuiz4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sub;
	double ha;
	
	System.out.println("¼·¾¾¿Âµµ ?");
	sub=sc.nextInt();
	
	ha=sub*1.8+32;
	System.out.printf("È­¾¾¿Âµµ : %.1f\n",ha);
	
	sc.close();
}
}
