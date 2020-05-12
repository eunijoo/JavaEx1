package test0203;

import java.util.Scanner;

public class WhileEx19 {
	public static void main(String[] args) {
	//단을 입력받아 입력받은 단의 구구단 출력
	 Scanner sc=new Scanner(System.in);
	 
	 int dan,n;
	 
	 System.out.println("단[1-9]?");
	 dan=sc.nextInt();
	 n=0;
	 
	 while(n<9) {
		 n++;
		 System.out.printf("%d*%d=%d\n",dan,n,dan*n);
	 }
	
	 sc.close();
	 
	}
}
