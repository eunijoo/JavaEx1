package test0210;
//5*4  ��Ŀ� 1~100������ ������ �߻��Ͽ� ���� �� ����ϰ�,
//5*4����� 4*5��ķ� ��ȯ�Ͽ� ����ϴ� ���α׷�
public class Array_Array_EXQuiz4 {
	public static void main(String[] args) {
		int [][] a=new int[5][4];   //5��4��
		int [][] b=new int[4][5];   //4��5��
	
		//5*4
		for(int i=0;i<a.length;i++) {     //4��
		for(int j=0;j<a[i].length;j++) {  //5�� 
				a[i][j]=(int)(Math.random()*100)+1;   //i:���̴ϱ� �ڿ� , j:���̴ϱ� �տ�
			}
		}
		
		//4*5
		for(int i=0;i<b.length;i++) {     //5��
			for(int j=0;j<b[i].length;j++) {  //4�� 
					b[i][j]=a[j][i];  //b����� a�� ����� �������� ��ȯ�ض�.
			}
		}
		
		//a���
		System.out.println("a�迭 ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%5d",a[i][j]);			
			}
			System.out.println();
		}
		
		//b���
		System.out.println("b�迭 ");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.printf("%5d",b[i][j]);			
			}
			System.out.println();
		}
	}
}
		
		
