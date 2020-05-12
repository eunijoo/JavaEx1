package test0203;

import java.util.Scanner;

public class BookEx425 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;

		System.out.println("숫자입력");
		num = sc.nextInt();

		while (num != 0) {
			sum += num % 10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			num /= 10;
		}
		System.out.println("각자리수합:" + sum);
	System.out.println();
		sc.close();
		System.out.println("안녕");
	}
}
