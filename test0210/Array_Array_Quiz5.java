package test0210;
//5��5���� �迭�� 1~25������ ���� ���� ���ó�� ä�� ����ϴ� ���α׷� �ۼ�
/*
   1   2   4   7  11
   3   5   8  12  16
   6   9  13  17  20
  10  14  18  21  23
  15  19  22  24  25
 */
public class Array_Array_Quiz5 {
	
	public static void main(String[] args) {
		int [][]a=new int[5][5];
		int n=0,k;
		
		for(int i=0;i<9;i++) {   //��
			for(int j=0;j<5; j++) {  //��  //�밢���� 9���̶� �ݺ�Ƚ��:9��
				k=i-j;
				if(k<0||k>4) continue;
				n++;
				a[j][k]=n;
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

		
