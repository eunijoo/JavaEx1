package test0203;

public class Switch_Switch_Ex6 {
	public static void main(String[] args) {
		int a = 12;

		switch (a % 2) {
		case 0:
			System.out.println("2�� ���"); // break�� ���� �Ʒ� switch�� �ƿ� �ʿ䰡 �������� ����.
			switch (a % 3) {
			case 0:
				System.out.println("3�ǹ��");
				break;
			case 1:
			case 2:
				System.out.println("3�� ����ƴ�");
				break; // switch������ �����������̿��� ������ break�� �ǹ̾���.
			}
			break;
		case 1:
			System.out.println("2�ǹ���ƴ�");
			switch (a % 3) {
			case 0:
				System.out.println("3�ǹ��");
				break;
			case 1:
			case 2:
				System.out.println("3�� ����ƴ�");
				break;// ���� switch���� ��������
			}
			break;// �� switch������ ��������.
		}

	}
}