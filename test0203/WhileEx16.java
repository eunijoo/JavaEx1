package test0203;

import java.util.Scanner;

public class WhileEx16 {
	public static void main(String[] args) {
	//정수를 입력받아 1부터 입력받은수까지 홀수합구하기
	 Scanner sc=new Scanner(System.in);
	 
	 int num;
	 int n,s;
	 
	 System.out.println("정수?");
	 num=sc.nextInt();
	 
	 n=1;
	 s=0;
	 
	 while(n <= num) {  //1부터 num까지 홀수합
		//n++;
	 	s+=n;
	 	n+=2;
	 }
	 System.out.println("결과: "+s);
	 sc.close();
	 
	}
}
