package test0210;

public class Array_Array_Ex3 {
	public static void main(String[] args) {
		//배열초기화방법 :아래 2개 똑같은말.
		//int[][] a= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		//int[][] a=new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		int[][] a= {{1,2,3,4},{5,6,7},{8,9,10,11,12}};
		for(int i=0;i<a.length;i++) {   //행
			for(int j=0;j<a[i].length;j++) {   //열
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}
}
