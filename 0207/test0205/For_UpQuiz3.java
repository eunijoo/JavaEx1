package test0205;

public class For_UpQuiz3 {
//a+b+c=25를 만족하는 한 자리 자연수 a,b,c를 모두 구하는 프로그램
public static void main(String[] args) {
		
		int a,b,c;
		for(a=1;a<10;a++) {   		 //a가 1-9까지; 1씩증가
			for(b=1;b<10;b++) {		 //b가 1-9까지; 1씩증가
				for(c=1;c<10;c++) {  //c가 1-9까지; 1씩증가
					if((a+b+c)%25==0) {  //a+b+c를 더한값이 25로 나눴을때 0이면 출력
						System.out.println(a+"+"+b+"+"+c+"="+"25");
					}
				}
	 		}
		}
	}
}


