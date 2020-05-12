package test0204;

public class ForExQuiz6 {
//1~100까지 수 중 짝수의 합을 계산하여 출력하는 프로그램
	public static void main(String[] args) {
		int n,s; //n:정수변수 , s:합계변수
		s=0; //합은 0부터 시작해야하니깐 0으로 초기화
		
		for(n=0;n<=100;n++) { //짝수니깐 n=0으로 초기화; 100까지;1씩증가
			s+=n;//s는 n의 짝수들의 합이 저장됨
			//System.out.println(n); //짝수가 더해지는게 맞는지 확인출력
			n++; //n+=1; 과 동일한 식인데 n++을 더 많이씀.
		}
		
		System.out.println("짝수의 합: "+s);
	}
}


