package test0205;

public class For_For_star2 {

	public static void main(String[] args) {
		//int i,j; //i����: �ټ��� ������ִ� ����, j: ��°�(*," ")�� ������ִ� ����,
//����(������ �״��, ������ �߰���)
		for(int i=1;i<=5;i++) { //5������ // �ټ� ��±���
			for(int j=1;j<=5-i;j++) {  //4������ //����ó������
				System.out.print(" "); //������ĭ
			}
			for(int j=1;j<=i*2-1;j++) { //Ȧ���� ���(1,3,5,7,9�� ��� �Ǿ�� �ϴϱ�)
				System.out.print("*");
			}
		System.out.println();
		}		
		System.out.println();

//����(��ĭ�� ��µǴ°� 5,6,7,8,9�� �þ��)
		int s=9;
		for(int i=s/2+1;i<=s;i++) { //�ټ� ���
			for(int j=0;j<i;j++) {  
				System.out.print((s-i)<=j ? "*" : " "); //���׿���� ���
			}
		System.out.println();
		}

	}
}
