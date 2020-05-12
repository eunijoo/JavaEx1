package test0203;

import java.util.Scanner;

public class WhileEx17 {
	public static void main(String[] args) {
		// 정수를 입력 받아 1부터 입력 받은 수까지 홀수를 한줄에
		//   5개씩 출력하고 마지막에 합 구하기
		Scanner sc=new Scanner(System.in);
		int num;
		int n, s, cnt;
		
		System.out.print("정수?");
		num=sc.nextInt();
		
		n=1;
		s=0;
		cnt=0;
		while(n <= num) {
			s+=n;
			System.out.print(n+"\t");
			cnt++; // 홀수 출력 개수 카운트
			if(cnt%5==0) // 한줄에 5개출력했으면 라인 넘기기
				System.out.println();
			
			n+=2; // 홀수 만들기
		}
		if(cnt%5!=0)
			System.out.println();
		
		System.out.println("결과:"+s);
		
		sc.close();
	}
}
