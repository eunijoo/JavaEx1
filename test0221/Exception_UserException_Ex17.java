package test0221;

import java.util.Scanner;

public class Exception_UserException_Ex17 {

	public static void main(String[] args) {
		int n;
		// JDK7이상.자동으로 리소스가 close(sc.score())됨.
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("나이?");
			n = sc.nextInt();
			System.out.println(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
