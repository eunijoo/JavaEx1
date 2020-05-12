package test0204;

public class ForExQuiz4 {
//1~10까지 수 중 홀수를 출력하는 프로그램
	public static void main(String[] args) {
		int n;
		
		 for(n=0;n<10;n++) { //0부터 ;10까지 ;1씩증가  =>1도 홀수기때문에 0으로 조건을 줌
			 n+=1;			//for조건식의 증감식과 같이 계산하면 2씩 계산이 됨
			 System.out.println(n);
		}
	}
}


