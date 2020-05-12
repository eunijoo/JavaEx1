package test0206;

import java.util.Scanner;

public class Continue_For_Ex1 {

public static void main(String[] args) {
		//5개의 홀수를 입력받아 입력받은 홀수의 합구하기.
		//단, 입력받은 수가 0보다 적거나 짝수이면 다시 입력 받기
		Scanner sc=new Scanner(System.in);
		
		int s,n; //s:합계변수
		System.out.println("0이상의 5개의 홀수 입력...");
		s=0; //합계
		for(int i=1;i<=5;i++) {
			n=sc.nextInt();
			if(n<0 || n%2==0) {
				i--;
				continue;
			}
			s+=n; //5개의 수 합산.
		}
		System.out.println("결과 : "+s);
		sc.close();
	}
	

}
