package test0129;

import java.util.Scanner;

public class OperQuiz2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t,h,m,s;
		
		System.out.print("초를 입력하세요 ?");
		t=sc.nextInt();
		
		h=t/3600;
		m=(t-h*3600)/60; //분,시간으로 계산된 수를 빼고
//		m=(a/60)%60; //위 식과 같지만 다른방식
		s=t%60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.",t,h,m,s);
//		System.out.printf(t+"초는" +h+"시간" +m+"분"+s+"초 입니다."); //위 코드와 같지만 다른방식
		sc.close();
	}

}
