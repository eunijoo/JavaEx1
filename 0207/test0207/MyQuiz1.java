package test0207;

import java.util.Scanner;

public class MyQuiz1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int []a= {17,16,15,14,13,12,11,22,21,20,19,18};
		int y;

		do {
			System.out.println("태어난 년도 입력:" );
			y=sc.nextInt();
		}while(y<1999||y>2010);
				
		if(y>=1999&&y<=2001) {
			System.out.printf("%d년생은 %d세 성인입니다.",y,a[y%12]);	
		}else if(y>=2002&&y<=2004) {
			System.out.printf("%d년생은 %d세 고등학생입니다.",y,a[y%12]);	
		}else if(y>=2005&&y<=2007) {
			System.out.printf("%d년생은 %d세 중학생입니다.",y,a[y%12]);	
		}else {
			System.out.printf("%d년생은 %d세 초등학생입니다.",y,a[y%12]);	
		}	
			sc.close();
	}
}

