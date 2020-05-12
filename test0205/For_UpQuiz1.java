package test0205;

import java.util.Scanner;

public class For_UpQuiz1 {
//5개의 정수를 입력 받아 입력 받은 정수 중 7에 가장 가까운 수를 출력하는 프로그램 
public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		int n;  //입력받는 변수
		int diff, min=0,result=0; 
		
		System.out.println("5개의 정수 입력,,");
		for(int i=0;i<5;i++) { //5번 실행
			n=sc.nextInt(); //입력받은 수를 n에 저장
			
			diff =n>7 ? n-7 : 7-n;  //차이구하는 변수 //차이를 구해서 최소값을 구한다.
			if(i==0 || min>diff) {  //처음 입력받은 경우이거나 처음이 아닌경우
				min=diff;  //차이값을 min에 저장
				result =n;  //차이값이중에 큰값을 result에 저장
			}
		}
		System.out.println("가장 가까운수:"+result);
		sc.close();
	}
}


