package test0210;
/*A~Z���� ���ڸ� ������ �̿��� �߻��� ���ڸ�
  4*4 �迭�� 0��0������ ��켱���� �����Ͽ� ����ϴ� ���α׷� �ۼ�.
/*A~Z ������ �����ڸ� ������ �̿��Ͽ� �߻��ϴ� ���(2����)
n=(char)((int)(Math.random()*26)+65); �Ǵ�
n=(char)((Math.random()*26)+'A');
*/
public class Array_Array_Quiz6_1 {
	
	public static void main(String[] args) {
		char []c=new char[16];
		char [][]a=new char[4][4];
		char n;
		
		for(int i=0;i<c.length;i++) {
			n=(char)((Math.random()*26)+'A');
			c[i]=n;
			
			for(int j=0;j<i;j++) {
				if(c[i]==c[j]) {
					i--;
					break;
				}
			}
		}
		int idx=0;
		for(int i=0;i<4;i++) { 
			for(int j=0;j<4; j++) { 
				a[i][j]=c[idx++];
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

		
