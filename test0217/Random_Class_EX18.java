package test0217;

import java.util.Random;
import java.util.Scanner;

/*
 	-스무고개
 	1~100까지 수 중 하나의 난수를 발행하여 20번 안에 맞추는 게임	
 ex>
 	input ? 20
 	20보다는 큽니다.
 	
 	input ? 40
 	40보다는 작습니다.
 	
 	input ? 37
 	3번에 성공했습니다.
 */
public class Random_Class_EX18 {
	public static void main(String[] args) {
		Random rnd=new Random();
		Scanner sc=new Scanner(System.in);
		
/* for문으로 작성	
		int s,n;
		int cnt=0;
		
		n=rnd.nextInt(100)+1;	//1~100까지 난수발생
		for(int i=1; i<=20 ;i++) {
			System.out.println("input ? :" );
			s=sc.nextInt();
			cnt++;
			
			 if(n<s) { 
				System.out.println(s+"보다 작습니다");
			 }else if(n>s) {
				 System.out.println(s+"보다 큽니다.");
			 }else if(n==s) {
					System.out.println(cnt+"번에 성공했습니다."); break;
			 }
				
			}
			if(cnt>20) {
				System.out.println("입력횟수를 초과하였습니다.");

			}	
*/
	//do-while문으로 짜면 더 짧고 효율적으로 짤수있다.
		int input;
		int cnt=0;
		
		int com = rnd.nextInt(100)+1;
		do {
			System.out.println("input?");
			input=sc.nextInt();
			
			if(com>input) {
				System.out.println(input+"보다 크다");
			}else if(com<input) {
				System.out.println(input+"보다 작다");
			}
			cnt++;
		}while(input != com && cnt <20);
		
		if(input==com) {
			System.out.println(cnt+"번에 성공...");
		}else{
			System.out.println("실패");
		}			
			sc.close();
		}	
	}
