import java.util.Scanner;

public class Ex002_continue {
	public static void main(String[] args) {
/*
		5개의 실수를 입력 받아 0보다 큰수의 합구하기.
*/
		Scanner sc=new Scanner(System.in);
		double input, sum;
		sum=0;
		
		for(int i=1; i<=5; i++) {
			System.out.print("수 ? ");
			input = sc.nextDouble();
			if(input <= 0.0)
				continue;
			
			sum+=input;
		}
		System.out.println("결과 : "+sum);
		
		sc.close();
	}
}
