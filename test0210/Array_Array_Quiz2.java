package test0210;
//5�� 5���� �迭�� A~Y������ �����ڸ� ������ó�� ä�� ����ϴ� ���α׷� �ۼ�
/*
   E   J   O   T   Y
   D   I   N   S   X
   C   H   M   R   W
   B   G   L   Q   V
   A   F   K   P   U
 */
public class Array_Array_Quiz2 {
	
	public static void main(String[] args) {
		char [][]a=new char[5][5];
		char n='A';
		
		for(int i=0;i<5;i++) {  //��
			for(int j=4;j>=0; j--) { //�� (����� �Ʒ���������.)
				a[j][i]=n++;				
			}
		}
		
		//���
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%4c",a[i][j]);
			}
			System.out.println();
		}
	}
}
		
