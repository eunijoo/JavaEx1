package test0210;
//���߹迭�� ����for���� ���� for���� �̿��Ͽ� �ۼ�. 
public class Array_Array_EXQuiz6 {
	
	public static void main(String[] args) {
		
		int [][]a= {{1,2,3},{4,5,6}};
		
		//�⺻ for�� ���
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		System.out.println("==============");
		
		//���� for�� ���
		for(int[] rows :a) {   //
			for(int n:rows) {
				System.out.printf("%3d",n);
			}
			System.out.println();
		}
	}
}
		
		
