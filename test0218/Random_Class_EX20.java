package test0218;

import java.util.Random;

public class Random_Class_EX20 {
	public static void main(String[] args) {

		int[] num = new int[50]; // �迭����
		Random rnd = new Random(); // ��������

		for (int i = 0; i < 50; i++) { // 50�� �ݺ�
			num[i] = rnd.nextInt(100) + 1; // �����߻�(1~100)
			for (int j = 0; j < i; j++) { // �ߺ�����
				if (num[i] == num[j]) { // �߻��� ���� ��ĥ���
					i--; // �� �� for������ ��
					break;
				}
				System.out.print(i);
				if(i%10==0) {
					System.out.println();
				}
		//	System.out.println(i); // �迭 �� ���

		}


		}
		
		}
	}


