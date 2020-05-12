package test0204;

public class ForEx4 {

	public static void main(String[] args) {	
/*	
//1-100까지 합구하기 
 
		int s=0;
		
		for(int n=1;n<=100 ; n++) { 
			s+=n; //합구하기
			
		}
		System.out.println("결과:"+s); //5050
*/
		
/*
//홀수 합구하기
		int s=0;
		
		for(int n=1;n<=100 ; n+=2) {  //홀수 합구하기(홀수는 2씩차이가 나니깐)
			s+=n; //합구하기
			
		}
		System.out.println("홀수합:"+s); //2500
*/
/*
//짝수합구하기
		int s,n;
		
		for(n=2,s=0;n<=100 ; n+=2) {  //s=0처럼 초기식에서(,)를 쓰고 초기값을 줄 수 있다.
			s+=n; //합구하기
			
		}
		System.out.println("짝수합:"+s); //2550
*/
//합구하기
		int s,n;
		
		for(n=1,s=0; n<=100 ; s+=n,n++) {  //맞기는 하지만 가독성이 떨어짐.좋은 수식이 아님.
			;
			
		}
		System.out.println("결과:"+s); //5050
}
}
