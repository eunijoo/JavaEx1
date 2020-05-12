package test0204;

import java.util.Scanner;

public class ForQuiz6 {
//10개의 정수를 입력받아 입력받은 정수 중 가장 작은값을 출력하는 프로그램
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n;
		int min;
		
		min=0;
		System.out.println("10개의 정수 입력: ");
		for (int i=0;i<3;i++) { //처음 입력을 받아;
			n=sc.nextInt();  //10개의 정수를 입력받아야해서 for문안에서 반복시킴
			if(i==0) { //0을 초기값으로.
				min=n; //입력받은수를 min에 저장
			}else if(min>n) { 
				min=n;   //입력받은수를 min에 저장
			}
		}
		System.out.println("최소값:"+min);
		sc.close();
	}
}


