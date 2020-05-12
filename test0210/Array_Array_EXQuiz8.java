package test0210;
//행렬의 합과 곱을 계산하는프로그램 작성
public class Array_Array_EXQuiz8 {
	
	public static void main(String[] args) {
		int[][] a= {{1,5},{2,4}};
		int[][] b= {{7,1},{3,4}};
		int[][] c= new int[2][2];
		int[][] d= new int[2][2];
		
		//합
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j]=a[i][j] +b[i][j];
			}
		}
		
		//곱
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
				//d[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0]
				d[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		
		//c출력
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.printf("%4d",c[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		//d출력
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				System.out.printf("%4d",d[i][j]);
			}
			System.out.println();
		} 
	}
}

		
		
