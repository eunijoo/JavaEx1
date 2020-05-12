package test0204;

import java.util.Scanner;

public class ForQuiz5_1 {
//10개의 정수를 입력받아 입력받은 정수 중 가장 큰값을 출력하는 프로그램(함수사용)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n; //정수 입력받는 변수
		int max;
		
		max=Integer.MIN_VALUE; //가장 적은 값을 초기값으로
		System.out.println("10개의 정수 입력: ");
		for (int i=1;i<=10;i++) { //처음 입력을 받아;
			n=sc.nextInt(); //10개의 정수를 입력받아야해서 for문안에서 반복시킴
			if(max<n) {  //처음입력받은 수를 max의 초기값으로.
				max=n;		 //입력받은수가 max보다 작을때 입력받은수를 max에 저장.
							//(입력받을때마다 비교를 함)	
			}					
		}
		System.out.println("최대값:"+max);
			
		sc.close();
	}
}


