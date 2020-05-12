package test0204;

public class ForExQuiz5 {
//1~10까지 정수의 합을 계산하여 출력하는 프로그램
	public static void main(String[] args) {
		int n,s; //n:1~10까지정수의변수 s:정수 합변수 
		s=0; //합은 0부터 시작해야하니깐 0으로 초기화
		for(n=1;n<=10;n++) { //1부터;10까지;1씩 증가
			s+=n;		//1~10까지 반복되는 수의 합이 s에 저장됨.
		}
		System.out.println("1~10 의 합 : "+s);
	}
}


