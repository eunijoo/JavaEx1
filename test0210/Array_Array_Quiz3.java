package test0210;
//4��5���� �迭�� 1~20������ ���� ���� ���ó�� ä�� ����ϴ� ���α׷� �ۼ�
/*
   1   8   9  16  17
   2   7  10  15  18
   3   6  11  14  19
   4   5  12  13  20
 */
public class Array_Array_Quiz3 {
	
	public static void main(String[] args) {
		int [][]a=new int[4][5];
		int n=0;
		
		for(int i=0;i<5;i++) {  //��
			for(int j=0;j<4; j++) { //��
				n++;

				if(i%2==0) {  //¦������ ������� ����
				a[j][i]=n;
				}else {  //Ȧ������ ���� �迭��ȣ�� 3210���� �ٲ����ϴϱ� 3-j�� ���ָ� �迭���ȣ�� �ٲ�.
					a[3-j][i]=n;
				}
			}
		}
		
		//���
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println();
		}
	}
}
		
