package test0210;
//1~20���� ���� �迭(��켱 �迭ä���)�� ������ó�� ä���� ����ϴ� ���α׷��ۼ�.
/*
  1  2  3  4
  5  6  7  8
  9 10 11 12
 13 14 15 16
 17 18 19 20
 */
public class Array_Array_EXQuiz2 {
	public static void main(String[] args) {
		int [][] a=new int[5][4];   //5��4��
		int n=0;
		
		for(int i=0;i<a.length;i++) {   //a.length : ��
			for(int j=0;j<a[i].length;j++) {  //��
				a[i][j]=++n;  //0��0������ ���� �����ϸ鼭 �־���.
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		
	}

}
