package test0205;

public class For_For_gugudan1 {

	public static void main(String[] args) {
		int c;
		
		System.out.println("구구단");
		for(int a=2;a<=9;a++) {     // 8번 실행
			for(int b=1;b<=9;b++) {   //8*9=72번 실행
				c=a*b;
				System.out.printf("%d * %d =%2d\t",a,b,c);
			}
			System.out.println();
		}

	}

}
