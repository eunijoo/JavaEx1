package test0205;

public class For_For_Star1 {

	public static void main(String[] args) {
		//int i,j; //i����: �ټ��� ������ִ� ����, j: ��°�(*," ")�� ������ִ� ����,
//���ʺ��� ���� �ݼ���	
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
//���ʿ� ���� �ݿ�����	
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
//�����ʿ� ���� �ݼ���		
		for(int i=1;i<=5;i++) { //5������
			for(int j=1;j<=5-i;j++) {  //4������ //����ó������
				System.out.print(" "); //������ĭ
			}
			for(int j=1;j<=i;j++) { //�����
				System.out.print("*");
			}
			System.out.println();
		}		
		System.out.println();
//for�� 2���Ἥ �����ʿ� �ݼ���
		for(int i=0;i<5;i++) { //�� ���� ��Ÿ���� ���� //5��
			for(int j=5;j>0;j--) {  //���ٿ� 5�� ����ض�. //5��
				System.out.print(j<=i+1?"*":" "); //���׿����� ���
			}
			System.out.println();
		}
		System.out.println();	
	}
}
