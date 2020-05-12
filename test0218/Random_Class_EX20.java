package test0218;

import java.util.Random;

public class Random_Class_EX20 {
	public static void main(String[] args) {

		int[] num = new int[50]; // 배열생성
		Random rnd = new Random(); // 랜덤생성

		for (int i = 0; i < 50; i++) { // 50번 반복
			num[i] = rnd.nextInt(100) + 1; // 난수발생(1~100)
			for (int j = 0; j < i; j++) { // 중복제거
				if (num[i] == num[j]) { // 발생된 수가 겹칠경우
					i--; // 맨 위 for문으로 감
					break;
				}
				System.out.print(i);
				if(i%10==0) {
					System.out.println();
				}
		//	System.out.println(i); // 배열 값 출력

		}


		}
		
		}
	}


