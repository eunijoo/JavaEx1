package test0131;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//정수를 입력받아 홀수인지 판별
		int n;
		String s;
		
		System.out.println("정수?");
		n=sc.nextInt();
		s="홀수가 아니다"; //s를 초기화해줌. 짝수를 입력했을 경우 if를 통화하기 때문에 s가 갈곳이없음. 안해주면 컴파일오류
		if(n%2==1) {  //if((n&1)==1) {
			s="홀수";
		}
		System.out.println(n+":"+s);
		
		sc.close();
	}

}
