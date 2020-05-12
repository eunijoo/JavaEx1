package test0204;

import java.util.Scanner;

public class WhileQuize1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num;
		int n,s1,s2,s3;
		
		System.out.println("정수입력");
		num=sc.nextInt();
		
		n=0;
		s1=s2=s3=0; //1부터더해줘야해서 0으로 초기화시켜주고함.
		
		while(n<num) {
			n++;
			s1+=n; //전체합 구문 
			
			if(n%2==0) { //짝홀구별
				s2+=n; // 짝수합 구문 	
			}else {
				s3+=n; // 홀수합 구문
			}
		}
		System.out.println("1~"+num+" 합  =   "+s1);
		System.out.println("1~"+num+" 짝수 합 ="+s2);
		System.out.println("1~"+num+" 홀수 합 ="+s3);
		
		sc.close();
	}

}
