package test0204;

import java.util.Scanner;

public class ForQuiz3 {
//10개의 정수를 입력받아 입력받은 정수 중,짝수 갯수,홀수갯수를 출력하는 프로그램.
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int  s1,s2;
		
		s1=s2=0;
		System.out.println("숫자10개 입력");
		for(int i=0;i<10;i++) {
			n=sc.nextInt(); //10번 반복(10번 입력)
			if(n%2==0) {
				s1++;
			}else {
				s2++;
			}
		}
		System.out.println("짝수갯수 : "+s1);
		System.out.println("홀수갯수 : "+s2);
		sc.close();
	}
}


