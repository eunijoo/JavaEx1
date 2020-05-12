package test0204;

public class ForQuiz4 {
//다중for문을 이용하여 2단~9단까지 구구단 출력
	
	public static void main(String[] args) {
		int c;
		
		System.out.println("구구단");
		for(int a=1;a<=9;a++) {     // 8번 실행
			for(int b=2;b<=9;b++) {   //8*9=72번 실행
				c=a*b;
				System.out.printf("%d * %d =%2d\t",b,a,c);
			}
			System.out.println();
		}
	}
}


