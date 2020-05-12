package test0207;

import java.util.Scanner;

public class Q {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//3번안에 1~10까지의 수 중 맞추기
		int com=(int)(Math.random()*10)+1;  //1~10까지의 난수1개
		int num,i;
		for(i=1; i<4; i++) {  //3번까지만 입력을 받을 수 있어야 하므로 i는 1~3까지
			System.out.print("숫자입력:");
			num=sc.nextInt();
			if(num==com) {
				System.out.println("정답입니다!");
				break;  //정답이면 for문을 빠져나옴
			}
			else if(num>com) System.out.println("입력하신 숫자보다 작습니다.");
			else System.out.println("입력하신 숫자보다 큽니다.");
		}
		if(i==4) {  //3번전에 끝나지 않으면 i는 4가 되므로 실패
			System.out.println("실패하셨습니다.ㅜㅜ");
		}
		sc.close();
	}
}
