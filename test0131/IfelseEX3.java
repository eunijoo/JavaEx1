package test0131;

import java.util.Scanner;

public class IfelseEX3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("����?");
		n=sc.nextInt();
		
		if(n>=90) {  
			System.out.println(n+":��");
		} else if(n>=80) {     // } else if(n>=80 && n<90) { �� ����.
			System.out.println(n+": ��");
		} else if(n>=70) {
			System.out.println(n+": ��");
		} else if(n>=60) {
			System.out.println(n+": ��");
		} else {
			System.out.println(n+":��");
		}
		sc.close();
	
	}
}
