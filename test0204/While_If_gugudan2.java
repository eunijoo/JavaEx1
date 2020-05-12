package test0204;

import java.util.Scanner;

public class While_If_gugudan2 {
//단을 입력받아 구구단 출력,단, 입력받은 단이 1-9 를 벗어나면 재입력.
	public static void main(String[] args) {
		
		int dan=0,n;
		boolean b;
		Scanner sc=new Scanner(System.in);
		
		//boolean, if문도 쓰고,변수 초기화도 시켜줘야해서 더 비효율적
		// do~while문으로 작성하는 것이 더 효율적이다.	
		b=true;
		while(b) {  //입력받은 단이 1-9 를 벗어나면 재입력하는 구문
			System.out.println("단?");
			dan=sc.nextInt();	
			if(dan>=1 && dan <=9) //1-9까지 입력했을 경우 구문을 빠져나감.
				b=false;	    //제대로 입력했을 경우 false로 처리해서 나가게함.
		}
	
		n=0;
		while(n<9) {  //구구단 출력구문
			n++;
			System.out.printf("%d*%d=%d\n",dan,n,dan*n);
		}
		
		sc.close();
	
	}
}

