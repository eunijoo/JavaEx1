package test0204;

public class ForQuiz4 {
//����for���� �̿��Ͽ� 2��~9�ܱ��� ������ ���
	
	public static void main(String[] args) {
		int c;
		
		System.out.println("������");
		for(int a=1;a<=9;a++) {     // 8�� ����
			for(int b=2;b<=9;b++) {   //8*9=72�� ����
				c=a*b;
				System.out.printf("%d * %d =%2d\t",b,a,c);
			}
			System.out.println();
		}
	}
}


