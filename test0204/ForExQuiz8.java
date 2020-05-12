package test0204;

public class ForExQuiz8 {
//1~100까지 수 중 3의배수를 한 줄에 10개씩 출력
//마지막에 3의 배수 합 및 평균을 출력하는 프로그램
	public static void main(String[] args) {
		int n,s; //n:정수변수 , s:합계변수
		int ave; //평균변수
		int cnt; //숫자세주는 변수
		
		s=0; //합계는 0부터 니깐 0으로 초기화
		cnt=0; //숫자세는건 0부터니간 0으로 초기화
		
		for(n=1;n<=100;n++){ //1부터 ;100까지 ;1씩 증가 (반복)
			//cnt++;
			if(n%3==0) { //정수를 3으로 나눠서 몫이 0이 된다면 if문으로 들어옴.
				s+=n; //n의 합계를 구하는 식
				System.out.print(n+"\t");
				
				++cnt; //숫자 세는 식
				if(cnt%10==0) { //10개씩 구분하는 식
				System.out.println(); //10개마다 엔터출력
				}	
			}
		}	
		ave=(int)(s/cnt); //평균구하는 식
		System.out.println();
		System.out.println("합:"+s);
		System.out.println("평균:"+ave);
	}
}


