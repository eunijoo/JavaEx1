package test0210;
//1~20까지 수를 배열(행우선 배열채우기)에 실행결과처럼 채워서 출력하는 프로그램작성.
/*
  1  2  3  4
  5  6  7  8
  9 10 11 12
 13 14 15 16
 17 18 19 20
 */
public class Array_Array_EXQuiz2 {
	public static void main(String[] args) {
		int [][] a=new int[5][4];   //5행4열
		int n=0;
		
		for(int i=0;i<a.length;i++) {   //a.length : 행
			for(int j=0;j<a[i].length;j++) {  //열
				a[i][j]=++n;  //0행0열부터 숫자 증가하면서 넣어줌.
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		
	}

}
