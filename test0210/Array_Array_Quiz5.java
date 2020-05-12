package test0210;
//5행5열의 배열에 1~25까지의 수를 실행 결과처럼 채워 출력하는 프로그램 작성
/*
   1   2   4   7  11
   3   5   8  12  16
   6   9  13  17  20
  10  14  18  21  23
  15  19  22  24  25
 */
public class Array_Array_Quiz5 {
	
	public static void main(String[] args) {
		int [][]a=new int[5][5];
		int n=0,k;
		
		for(int i=0;i<9;i++) {   //열
			for(int j=0;j<5; j++) {  //행  //대각선이 9번이라 반복횟수:9번
				k=i-j;
				if(k<0||k>4) continue;
				n++;
				a[j][k]=n;
			}
		}
		
		//출력
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {			
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println();
		}	
	}
}

		
