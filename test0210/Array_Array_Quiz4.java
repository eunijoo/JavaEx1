package test0210;
//4��5���� �迭�� 1~20������ ���� ���� ���ó�� ä�� ����ϴ� ���α׷� �ۼ�
/*
   1   2   3   4   5
       6   7   8   9
          10  11  12
              13  14
                  15
 */
public class Array_Array_Quiz4 {
	
	public static void main(String[] args) {
		int [][]a=new int[5][5];
		int n=0;
		
		for(int i=0;i<5;i++) {  //��
			for(int j=i;j<5; j++) { //��
				n++;
				a[i][j]=n;
			}
		}
		
		//���
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]!=0) {					
				System.out.printf("%4d",a[i][j]);
				}else { 
					System.out.print("    ");
				}
			}
			System.out.println();
		}	
	}
}

		
