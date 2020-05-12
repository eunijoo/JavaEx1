package test0210;
//1~20까지 수를 배열(열우선 배열 채우기)에 아래 실행결과처럼 채워서 출력하는 프로그램.(5행4열)
/*
  1  6 11 16
  2  7 12 17
  3  8 13 18
  4  9 14 19
  5 10 15 20
*/

public class Array_Array_EXQuiz3 {
	public static void main(String[] args) {
		int [][] a=new int[5][4];   //5행4열
		int n=0;
		
		//행열
		for(int i=0;i<a.length-1;i++) {     //4열
		for(int j=0;j<a[i].length+1;j++) {  //5행 
				a[j][i]=++n;   //i:열이니깐 뒤에 , j:행이니까 앞에
			}
		}
		//출력
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}
}
