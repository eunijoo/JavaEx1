package test0205;

import java.util.Scanner;

public class WhileQuiz6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int com, user, cnt;
		
		// 1~100 사이 난수 발생
		com = (int)(Math.random()*100)+1;
		
		// 카운트 변수 초기화
		cnt=0;
		while(true) { // 무한 루프
			System.out.println("수?");
			user=sc.nextInt();
			cnt++;
			
			if(com>user) {
				System.out.println("입력한 수보다 더 큽니다.");
			} else if(com<user) {
				System.out.println("입력한 수보다 더 작은수입니다.");
			}  else {
				System.out.println(cnt+"번에 성공했습니다.");
				break;
			}
		}
		sc.close();

	}

}
