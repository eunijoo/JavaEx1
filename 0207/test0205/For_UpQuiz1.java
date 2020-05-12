package test0205;

public class For_UpQuiz1 {
//다중for문 이용해서 2-9단까지 출력(옆으로 나오게)
public static void main(String[] args) {
		int i,j; //i: 몇단인지 변수 , j:1-9까지 곱해야하는 정수값 변수
		
		for(i=2;i<=9;i++) {  //2단-9단까지 ;1씩 증가
			for(j=1;j<=9;j++) {  //1-9까지 곱셈구문
				System.out.printf("%d * %d = %d\t",i,j,i*j);
			}
			System.out.println();
		}
	}
}


