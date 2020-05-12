package test0129;

public class PrintfEx4 {

	public static void main(String[] args) {
		System.out.printf("%d\n", 123); // 123
		System.out.printf("숫자 : %d\n", 123); // 숫자 : 123
		System.out.println("----------------");

		// 문자는 오른쪽부터 채워짐
		System.out.printf("%10d\n", 123); // 10칸의 공간을확보(숫자는 오른쪽부터 채워짐)
		System.out.printf("%020d%n", 1); // 20칸공간확보하고,1앞의 공간을 0으로 채움
		System.out.printf("%010d\n", 123); // 10칸의 공간확보,123앞의 공간을 0으로 채움
		System.out.printf("%-5d%n", 1); // 5칸의 공간확보,-는 왼쪽부터 숫자가 채워짐(1 _ _ _ _ _이렇게됨)
		System.out.printf("%-10d0\n", 123); // 10칸확보공간 왼쪽부터 123이 채워지고,이후공간에 0이 출력
		System.out.printf("%-10d*\n", 123);
		System.out.printf("%-5d\n", 1);
		System.out.println("----------------");

		// 컴파일오류 : 문법오류- 컴파일할때 검사
		// 런타임 오류 : 실행할때 발행하는 오류.런타임 오류가 발생하면 프로그램 실행중지
		// System.out.printf("%d\n",'A');
		System.out.println("-------------");

		System.out.printf("%d %% %d = %d\n", 10, 3, 10 % 3); // 나머지값 출력
		System.out.printf("%f\n", 123.23); // 기본으로 소수점 6자리 까지 나타냄(정수그대로)
		System.out.printf("%8.2f\n", 123.236); // 8칸 확보 후, 소수점2자리까지 출력(정수는 그대로)
		System.out.printf("%.2f\n", 123.236); // 소숫점 2자리 까지 출력(정수는 그대로)
		System.out.println("----------------");

		// g는 자바에서 잘 사용안함(c언어에서 사용)
		System.out.printf("%g\n", 123.23); // 기본으로 6자리를 확보 // 123.230 출력됨
		System.out.printf("%10.5g\n", 123.567); // 10.5g는 10자리 확보 후,숫자5개만 출력
		System.out.printf("%.2g\n", 123.567); /*
												 * 숫자2개만 출력해야해서 소숫점을 옮기고 10의2승으로 출력됨 숫자 2개 출력된 후, 문자 이후 숫자는 괜찮음
												 */
		System.out.println("----------------");

		System.out.printf("%,d\n", 1234567);// 천단위로',' 찍어줌
		System.out.println("----------------");

		System.out.printf("%d %d %d %d\n", 10, 5, 10, 10);// 10 5 10 10 출력
		System.out.printf("%1$d %2$d %1$d %1$d\n", 10, 5);// 1$는 첫번째숫자10,2$는 두번쨰숫자5 출력(반복적일때 사용)

	}

}
