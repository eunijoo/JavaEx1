package test0205;

public class For_For_star3 {

	public static void main(String[] args) {
		//int i,j; //i����: �ټ��� ������ִ� ����, j: ��°�(*," ")�� ������ִ� ����,
//for�� 6���Ἥ ������
		//5�ٿ� 5������.
		for(int i=1;i<=5;i++) { //5������ // �ټ� ��±��� //������ ���涧���� �� �ø�
			for(int j=1;j<=5-i;j++) {  //4������ //����ó������
				System.out.print(" "); //������ĭ
			}
			for(int j=1;j<=i*2-1;j++) { //Ȧ���� ���(1,3,5,7,9�� ��� �Ǿ�� �ϴϱ�)
				System.out.print("*");
			}
		System.out.println();
		}	
		//4�� 5������.
		for(int i=4;i>=1;i--) { //4������ // �ټ� ��±���//������ ���涧���� �� ����
			  for(int j=1;j<=5-i;j++) {  //4������ //����ó������
				System.out.print(" "); //������ĭ
			}
			for(int j=1;j<=i*2-1;j++) { //Ȧ���� ���(1,3,5,7,9�� ��� �Ǿ�� �ϴϱ�)
				System.out.print("*");
			}
		System.out.println();
		} 	
		System.out.println();	
		
//for�� 2���� ����Ͽ� ������		
		int s=5; //Ȧ���� ���� //�� �Ѱ���
		int n;
		
		n=s/2; 
		for(int i=0; i<s ;i++) {
			for(int j=0; j<s-n;j++) {  //Ȧ���� ���
				System.out.print(j>=n ? "*" : " ");
			}
			n=i<(s/2) ? n-1 : n+1; //������ �پ��� ������ٰ�. �ٽ� �þ�� �ϴ� ����
			System.out.println();
		}
	}
}
