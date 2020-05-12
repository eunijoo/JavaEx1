package test0203;

import java.util.Scanner;

public class WhileEx18 {
	public static void main(String[] args) {
	//정수를 입력받아 1부터 입력받은수까지 홀수를 한줄에 5개씩 출력,마지막에 합구하기
	 Scanner sc=new Scanner(System.in);
	 
	 int num;
	 int n,s,cnt; //n: 홀수구하는거 s:는 합구하는거
	 
	 System.out.println("정수?");
	 num=sc.nextInt();
	 
	 n=1;
	 s=0;
	 cnt=0;
	 
	 while(n <= num) {  //1부터 num까지 홀수합
		//n++;
	 	s+=n;
	 	System.out.print(n+"\t");
	 	cnt++;// 홀수 출력 개수 카운트
	 	if(cnt%5==0) {//한줄에 5개 출력했으면 라인넘기기
	 		System.out.println();
	 	}
	 	n+=2;//홀수만들기
	 }
	 if(cnt%5 !=0) {//5로 나눠지면 위에서 나눠짐.5개가 아닐때도 조건을 달아 라인을넘겨줌.
	 	System.out.println();
	 }

	 System.out.println("결과: "+s);
	 sc.close();
	 
	}
}
