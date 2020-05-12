package test0131;

import java.util.Scanner;

public class IfelseEX2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("정수?");
		n=sc.nextInt();
		
		if(n%2==0 && n%3==0) {    //if(n%6==0){ 와 같은 식 
			System.out.println(n+": 2또는 3의 배수");
		} else if(n%2==0) {
			System.out.println(n+": 2의 배수");
		} else if(n%3==0) {
			System.out.println(n+": 3의 배수");
		} else {
			System.out.println(n+":2또는 3의 배수가 아님");
		}
		sc.close();
	
	}
}
