package test0210;
//1~20���� ���� �迭(���켱 �迭 ä���)�� �Ʒ� ������ó�� ä���� ����ϴ� ���α׷�.(5��4��)
/*
  1  6 11 16
  2  7 12 17
  3  8 13 18
  4  9 14 19
  5 10 15 20
*/

public class Array_Array_EXQuiz3 {
	public static void main(String[] args) {
		int [][] a=new int[5][4];   //5��4��
		int n=0;
		
		//�࿭
		for(int i=0;i<a.length-1;i++) {     //4��
		for(int j=0;j<a[i].length+1;j++) {  //5�� 
				a[j][i]=++n;   //i:���̴ϱ� �ڿ� , j:���̴ϱ� �տ�
			}
		}
		//���
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}
}
