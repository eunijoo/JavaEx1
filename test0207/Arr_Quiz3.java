package test0207;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_Quiz3 {
//구매개수를 입력받아 구매개수만큼의 로또를 출력하는 프로그램.
	//구매개수가 1~5사이가 아닌경우 다시 입력받는다.
//1~45사이의 난수 발생. => (int)(Math.ranom()*45+1; 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//	int[]a= {4,6,8,34,33,10};
		int []num=new int[6];
		int cnt; //cnt:구매개수변수
		
		//구매개수 입력받는 구문.ㅈ
		do {
		System.out.println("구매개수[1~5]? : ");
		cnt=sc.nextInt();
		}while(1>cnt||cnt>5);  //입력값이 1-5범위 벗어나면 재입력 구문. 
			
		for(int i=1;i<=cnt;i++) {			
			for(int a=0; a<num.length;a++) { //똑같은 숫자가 안나오게 하는 구문.
				num[a]=(int)(Math.random()*45)+1; //45까지 수가 랜덤출력되는 함수.
				for(int b=0; b<a;b++) {     
					if(num[a]==num[b]) {
						a--;
						break;
					}
				}
			}
			//정렬
			Arrays.sort(num); //순차적으로 정렬해주는 함수
			System.out.println(i+"번째 : ");
			for(int n: num) {
				System.out.printf("%5d",n);
			}
			System.out.println();
		}
		sc.close();
		
	}	
}		
		//Arrays.sort(num);  //순차적으로 정렬해주는 함수
	//	for(com=1;com<=45;com++) {
	//		System.out.print(com+" ");
	//		for(n=1;n<6;n++) {
	//		com=(int)(Math.random()*45)+1;
	//	}
	//	}
		//for(int n:num) {
			//System.out.print(n+" ");
	//	}
		//System.out.println();
	


