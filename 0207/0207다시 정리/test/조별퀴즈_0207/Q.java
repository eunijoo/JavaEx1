package test0207;

import java.util.Scanner;

public class Q {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//3���ȿ� 1~10������ �� �� ���߱�
		int com=(int)(Math.random()*10)+1;  //1~10������ ����1��
		int num,i;
		for(i=1; i<4; i++) {  //3�������� �Է��� ���� �� �־�� �ϹǷ� i�� 1~3����
			System.out.print("�����Է�:");
			num=sc.nextInt();
			if(num==com) {
				System.out.println("�����Դϴ�!");
				break;  //�����̸� for���� ��������
			}
			else if(num>com) System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�.");
			else System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�.");
		}
		if(i==4) {  //3������ ������ ������ i�� 4�� �ǹǷ� ����
			System.out.println("�����ϼ̽��ϴ�.�̤�");
		}
		sc.close();
	}
}
