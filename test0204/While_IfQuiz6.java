package test0204;

import java.util.Scanner;

//두 정수를 입력받아 입력받은 수 중 적은수에서 큰수까지의 합을 구하는 프로그램 작성.
public class While_IfQuiz6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,temp;
		int s,n;
		
		System.out.println("두수?");
		n1=sc.nextInt(); //숫자 입력
		n2=sc.nextInt();//숫자입력
		
		s=0;
		n=n1;
		
		if(n1>n2) { //작은수와 큰수를 비교해서 n2가 작을 경우 n1으로 값을 변경해주는 구문
			temp=n1; //temp(빈방)변수에 n1값넣어줌
			n1=n2;  //n1(빈방)
			n2=temp;
		}
		while(n<=n2) { //입력받은 n2 까지 더해주는 구문.
			s+=n;
			n++;		
		}
		System.out.println(n1+"~"+n2+"까지의 합 : "+s);
		
		sc.close();
	}
}


