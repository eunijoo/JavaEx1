package test0210;
//5�� 5���� �迭�� 1~25������ ���� ������ó�� ���� ������� ä�� ����ϴ� ���α׷��ۼ�.
/*
   1   2   3   4   5
  10   9   8   7   6
  11  12  13  14  15
  20  19  18  17  16
  21  22  23  24  25
 */
public class Array_Array_Quiz1 {
	
	public static void main(String[] args) {
		int [][]a=new int[5][5];
		int n=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5; j++) {
				n++;
				if(i%2==0) {  //¦������ ������� ����
				a[i][j]=n;
				}else {  //Ȧ������ ���� �迭��ȣ�� 43210���� �ٲ����ϴϱ� 4-j�� ���ָ� �迭���ȣ�� �ٲ�.
					a[i][4-j]=n;
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

		
		
