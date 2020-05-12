package test0206;

import java.util.Scanner;
//난수를 이용하여 컴퓨터와 가위,바위,보 게임을 진행하는 프로그램 작성.
//조건:  컴퓨터는 1~3사이의 난수를 발생
//		1:가위, 2:바위 3:보
//		유저는 1~4사이의 수를 입력하여 게임을 진행.1~4외의 수를 입력하면 다시 입력.
public class Mix_Quiz1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int com,user;
		
		while(true) {
			do {
				System.out.println("1.가위   2.바위   3.보   4.종료=>");
				user=sc.nextInt();
				
			}while(user<1 || user>4);
			if(user==4) break;
			
			com=(int)(Math.random()*3)+1; 									
			System.out.println("컴퓨터 : "+(com==1?"가위":(com==2?"바위":"보")));
			System.out.println("당신 : "+(user==1?"가위":(user==2?"바위":"보")));
			
//user과 com을 비교하여 누가 이겼는지 출력하기.
			if(com==user) {
				System.out.println("비겼습니다.");				
			}else if(user==1 && com==3 ||user==2 && com==1||user==3 && com==2) {
				System.out.println("당신이 이겼습니다.");	
			}else {
				System.out.println("당신이 졌습니다.");
			}
		}
		sc.close();
	}
}
