package test0221;

import java.util.Scanner;

public class Exception_UserException_Ex17 {

	public static void main(String[] args) {
		int n;
		// JDK7�̻�.�ڵ����� ���ҽ��� close(sc.score())��.
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("����?");
			n = sc.nextInt();
			System.out.println(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
