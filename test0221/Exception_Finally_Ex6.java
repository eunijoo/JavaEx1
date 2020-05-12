package test0221;

import java.util.Scanner;

public class Exception_Finally_Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = new String[3];

		int idx = 0;
		String s;

		try {
			System.out.println("�̸��Է�[����:���ڿ� �Է������ʰ� ����]...");
			
			while ((s = sc.nextLine()).length() != 0) {
				names[idx++] = s;
				System.out.println("�̸��Է� : "); //���ܹ߻��ϸ� �������
			}
			System.out.println("========================");  //���ܿͻ������ ��µ�.
			//ArrayIndexOutOfBoundsException : uncheck ����
			// 								      �迭�� ÷�ڰ� ������ ����� �߻��ϴ� ����.
			for (String str : names) {
				System.out.println(str + " ");
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�Է��� �ʰ��߽��ϴ�.");
		}finally {
			// try { } finally { } ó�� catch�� ��� ����. (catch�Ұ��̾����� try finally�� �ᵵ��)
			System.out.println("���ܿ� ������� ����˴ϴ�.");
			sc.close();
		}

		System.out.println();

	}
}