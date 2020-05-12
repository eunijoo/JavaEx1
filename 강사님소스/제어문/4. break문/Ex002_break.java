import java.util.Scanner;

public class Ex002_break {
	public static void main(String[] args) {
/*
		실수를 입력 받아 입력 받은 수의 합구하기. 0이하를 입력하면 종료
*/
		Scanner sc=new Scanner(System.in);
		double input, sum;
		sum=0;
		
		while(true) {  // 무한루프
			System.out.print("수 ? ");
			input = sc.nextDouble();
			if(input <= 0.0)
				break;
			
			sum+=input;
		}
		System.out.println("결과 : "+sum);
		
		sc.close();
	}
}
