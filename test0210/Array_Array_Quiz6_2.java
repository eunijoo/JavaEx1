package test0210;
/*A~Z���� ���ڸ� ������ �̿��� �߻��� ���ڸ�
  4*4 �迭�� 0��0������ ��켱���� �����Ͽ� ����ϴ� ���α׷� �ۼ�..
/*A~Z ������ �����ڸ� ������ �̿��Ͽ� �߻��ϴ� ���(2����)
n=(char)((int)(Math.random()*26)+65); �Ǵ�
n=(char)((Math.random()*26)+'A');
*/
// Array_Array_Quiz6_1�� �ٸ� ������� ���α׷� �ۼ���.
public class Array_Array_Quiz6_2 {
	
	public static void main(String[] args) {
		char [][]a=new char[4][4];
		char n;
		

		for(int i=0;i<4;i++) { //��
			for(int j=0;j<4; j++) {  //��
				n=(char)((Math.random()*26)+'A');
				a[i][j]=n;
				
				//�������ڰ� �ִ��� Ȯ���ϴ� ����.
				gogo:
				for(int x=0; x<=i;x++) {  // x: i(��)�κκ��� Ȯ��
					for(int y=0; y<a[x].length;y++) { //y:j(��)�κκ� ȣ����
						if(x==i&&y>=j) continue gogo;
						if(a[i][j]==a[x][y]) {
							j--;
							break gogo;  //���ǿ� �´°��� ������ break�ϰ�,ùfor������ �ö�/.
						}
					}
				}
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

		
