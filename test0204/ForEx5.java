package test0204;

public class ForEx5 {

	public static void main(String[] args) {	
/*
		int n;
		for(n=10;n<=1;n++) {
			System.out.println("��: "+n); //������ �������� ������ �ѹ��� ����ȵ�.
		}
		System.out.println("��: "+n); //ó���� �� �� 10 �״�� ����.
*/
		int n;
		for(n=10;n>=1;n--) { //ó���� 10 ; n�� 1���� ũ�� -> ���������ε� -> n-- -> 9�� �Ǽ� n�� 1����ũ��..
			System.out.println("��: "+n); //10 9..2 1
		}
		System.out.println("��: "+n); //0
}
}
