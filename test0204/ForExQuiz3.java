package test0204;

public class ForExQuiz3 {
//1~10까지 수 중 짝수를 출력하는 프로그램
	public static void main(String[] args) {
		int n;
		
		//for(n=2;n<=10;n+=2) { //
			//System.out.print(n+" ");
		//}
		 for(n=1;n<=10;n++) { //1부터 ;10까지 ; 1씩증가
			 n+=1;			//for조건식의 증감식과 같이 계산하면 2씩 계산이 됨
			 System.out.println(n);
		}
		

	}
}


