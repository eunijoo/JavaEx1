package test0204;

import java.util.Scanner;

public class Do_while_gugudan1 {
	//단을 입력받아 구구단 출력,단, 입력받은 단이 1-9 를 벗어나면 재입력.
	public static void main(String[] args) {
		
		int dan,n;
		Scanner sc=new Scanner(System.in);
		
		do {   //1-9를 벗어난 입력을 할 경우 재입력하는구문.
			System.out.println("단?");
			dan=sc.nextInt();		
		}while(dan<1 || dan>9);
		
		n=0;
		while(n<9) {  //구구단 출력구문
			n++;
			System.out.printf("%d*%d=%d\n",dan,n,dan*n);
		}
		
		sc.close();
	
	}
}

