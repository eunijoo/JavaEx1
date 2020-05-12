package test0210;
//이중배열을 다중for문과 향상된 for문을 이용하여 작성. 
public class Array_Array_EXQuiz6 {
	
	public static void main(String[] args) {
		
		int [][]a= {{1,2,3},{4,5,6}};
		
		//기본 for문 사용
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		System.out.println("==============");
		
		//향상된 for문 사용
		for(int[] rows :a) {   //
			for(int n:rows) {
				System.out.printf("%3d",n);
			}
			System.out.println();
		}
	}
}
		
		
