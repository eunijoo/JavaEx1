package test0129;

import java.util.Scanner;
//ctrl + shift +o : �ڵ�  inport

public class InputEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name, tel;
		int age;

		System.out.print("�̸�?");
		name = sc.nextLine(); // �Է� �߰��� ���� �Է°��� //���ͱ��� �����ͷ� ����
		System.out.print("����?");
		age = sc.nextInt();
		sc.nextLine(); // ���͸� ���� //���͸� �޾ƾ� ���������� //�ȹ����� ��ȭ��ȣ���� �Է��� ���ްԵ�
		System.out.print("��ȭ?");
		tel = sc.nextLine();

		System.out.print(name + "," + age + "," + tel);
		sc.close();
	}

}
