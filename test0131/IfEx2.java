package test0131;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("����?");
		n=sc.nextInt();
		if(n%2==1) {  
		//if((n&1)==1) {  // ����if���� ����,
			System.out.println(n+"�� Ȧ��");	
		}
		sc.close();
	
	}

}
