package test0130;

import java.util.Scanner;

public class OpreQuiz1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		
		System.out.printf("가로입력 :");
		a=sc.nextInt();
		System.out.printf("세로입력 :");
		b=sc.nextInt();
		
		//넓이를 계산할때 출력:가*세
		System.out.println("넓이 :"+(a*b));
		//둘레를 계산할때 출력 :(가+세)*2
		System.out.printf("둘레 :"+((a+b)*2));
		
		//아래코드와 같이 추가선언해주고 계산과 출력 따로 줘도 됨.
		//int c;
		//c=((a+b)*2);
		//System.out.println("둘레="+c);
		
		sc.close();

	}

}
