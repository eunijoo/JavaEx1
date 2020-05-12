package test0207;

import java.util.Scanner;

public class assignment2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,temp;
		
		do {
			System.out.print("수?");
			n1=sc.nextInt();
		} while (n1<0);
		
		n2=0;  // n1을 10으로 나눈 나머지를 담을 곳 
		temp=n1;
		
	
		
		while(temp>0) {
			n2*=10; // 자릿수를 올려주기 위해 (1->10->100->...)
			n2+=temp%10; // 수를 10으로 나눈 나머지(가장 끝에 있는 수 출력)
			temp/=10; // 수를 10으로 나눈 몫 
			
			// 몫을 이용하여 또 가장 끝에 있는 수 출력하기 
		}
		
		System.out.println(n1+","+n2+","+(n1+n2));
					
		sc.close();
	}
}