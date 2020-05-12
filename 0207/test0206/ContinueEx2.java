package test0206;

import java.util.Scanner;

public class ContinueEx2 {

public static void main(String[] args) {
		//5개의 홀수를 입력받아 입력받은 홀수의 합구하기.
		//단, 입력받은 수가 0보다 적거나 짝수이면 다시 입력 받기
		Scanner sc=new Scanner(System.in);

		int s,n,i;  //s:합계변수 , n:입력받는변수 , i: 몇개 입력을 받았는지 변수
		s=i=0;
		System.out.println("0이상의 5개의 홀수 입력...");
		while(i<5) {
			n=sc.nextInt();
//			i++
			if(n<0 || n%2==0) {  //0보다 작거나 짝수이면 다시 while문으로 올라감.(재입력)
//				i--;
				continue;
			}
			i++;
			s+=n;  //홀수 합 계산
		}		
		System.out.println("결과 : "+s);
		sc.close();
	}
	

}
