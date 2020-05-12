package test0131;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("정수?");
		n=sc.nextInt();
		if(n%2==1) {  
		//if((n&1)==1) {  // 위의if문과 동일,
			System.out.println(n+"은 홀수");	
		}
		sc.close();
	
	}

}
