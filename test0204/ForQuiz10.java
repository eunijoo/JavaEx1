package test0204;

//1~100까지  수 중에 4와 6의 공배수를 출력하는 프로그램
//공배수는 4의배수이고,6의배수 의 경우
public class ForQuiz10 {
	public static void main(String[] args) {

		int n; //정수변수
		
		for(n=1;n<=100;n++) {	  //1~100까지 ;1씩 증가
			if(n%4==0 && n%6==0) { // 4의배수이고,6의 배수인 경우 출력
				System.out.print(n+" ");
			}
		}
	}
}
		
	
	

	



