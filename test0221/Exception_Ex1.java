package test0221;

import java.util.Scanner;

/* 
 * ����ó�� why? ���α׷��� �����̰� Ŭ���̾�Ʈ���� ������ ������
 * 	1) 10/0= error �߻�  => 0�� ����Ұ���
 * 	2) �����ڸ� �Է��ؼ� error �߻�
 * 	3) �Ҽ����� �Է��ؼ� error �߻�
 * 	4) int ������  �Ѿ ���ڸ� �Է��ؼ� error �߻�
 * => �������� ������ if�θ� �ذ��ϱ⿡�� ������
 * 
 * stack overflow error = ���ȣ��_�ڱ��ڽ��� �θ��ٰ� ������� stack ��ħ
 * 
 * ���� ���� : �����������(���ĺ���). ������/��Ÿ���� ���µ� �������� �ٸ���� 
 * 
 */

public class Exception_Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.print("�� ����? ");	//�����϶�
		a = sc.nextInt();
		b = sc.nextInt();
		if(b==0) { 						//�������϶�
			System.out.println("0���� �����������");
		}

		c = a / b;

		System.out.println(a + " / " + b + " = " + c);

		System.out.println("end...");

		sc.close();
	}
}
