package test0207;

import java.util.Scanner;

public class Arr_Quiz2 {
//5개의 점수(0~10)를 입력받아 최대점수와 최소점수를 뺀 합을 구하는 프로그램
//0~10사이의 점수가 아닌경우 다시 입력
//입력받는 점수는 배열에 저장.
//취득점수=전체점수의 합 - 최대점수 - 최소점수
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int []score=new int[5];
		int max,min,tot;
		
		tot =0;
		for(int i=0;i<5;i++) {
			do {
			System.out.print((i+1)+"번째 점수 : ");
			score[i]=sc.nextInt();//첨자는 0-4까지 밖에 못감. 
			//tot+=score[i];  //0~10을 벗어나는 점수는 계싼하면 안되는데 여기에 두면 합계하게 됨
			}while(score[i]<0||score[i]>10);
			tot+=score[i];
		}
		//최대,최소구하는구문
		max=min=score[0];  //최대,최소 초기값을 0으로 해줌.
		for(int i=1;i<5;i++) {
			if(max<score[i]) { //최대값
				max=score[i];
			}
			else if(min>score[i]) {  //최소값
				min=score[i];
			}
		}
		System.out.println("취득점수 : "+(tot-max-min));	
		sc.close();
	}
}
