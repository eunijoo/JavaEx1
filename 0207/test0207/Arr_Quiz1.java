package test0207;

import java.util.Scanner;

public class Arr_Quiz1 {
//�⵵�� �Է¹޾� �Է¹��� �⵵�� �츦 ���ϴ� ���α׷�
//�Է¹��� �⵵�� 1990���� ������ �ٽ� �Է¹޴´�.
//��� �迭�� �̿��Ͽ� ���Ѵ�.
//��,��,��,�䳢,��,��,��,��,������.��,��,����	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//�ʱⰪ�� 12�� �������� �⵵���� �����ؾ���
		String []ani = {"������","��","��","����","��","��","�䳢","��","��","��","��"};
		int y;
		
		//�⵵ �Է¹޴´�.
		do {
		System.out.println("�⵵?");
		y=sc.nextInt();//�⵵ �Է�
		}while(y<1900); //1900���� ������ �ٽ� �Է�
		
		//����Ѵ�/		
		System.out.printf("%d�⵵�� %s�� ���Դϴ�.",y,ani[y%12]);
		//ani[y%12]�����̸� �������� ���������� �迭�濡 ����.
		
		sc.close();
	}

}
