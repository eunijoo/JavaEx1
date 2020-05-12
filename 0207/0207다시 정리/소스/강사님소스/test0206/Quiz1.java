package test0206;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int com, user;
		
		while(true) {
			do {
				System.out.print("1.가위 2.바위 3.보 4.종료 => ");
				user=sc.nextInt();
			}while(user<1||user>4);
			if(user==4) break;
			
			com=(int)(Math.random()*3)+1;
			
			System.out.println("컴:" + (com==1?"가위":(com==2?"바위":"보")));
			System.out.println("나:" + (user==1?"가위":(user==2?"바위":"보")));
			
			// user과 com을 비교하여 누가 이겼는지를 출력하기
			if(user==com) {
				System.out.println("비김");
			} else if(user==1&&com==3||user==2&&com==1||user==3&&com==2) {
				System.out.println("이김");
			} else {
				System.out.println("짐");
			}
		}
		
		
		sc.close();

	}

}
