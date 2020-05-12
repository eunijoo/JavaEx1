package test0210;
//4행5열의 배열에 1~20까지의 수를 실행 결과처럼 채워 출력하는 프로그램 작성
/*
   1   8   9  16  17
   2   7  10  15  18
   3   6  11  14  19
   4   5  12  13  20
 */
public class Array_Array_Quiz3 {
	
	public static void main(String[] args) {
		int [][]a=new int[4][5];
		int n=0;
		
		for(int i=0;i<5;i++) {  //열
			for(int j=0;j<4; j++) { //행
				n++;

				if(i%2==0) {  //짝수열은 순서대로 증가
				a[j][i]=n;
				}else {  //홀수열의 행은 배열번호로 3210으로 바껴야하니깐 3-j를 해주면 배열방번호가 바뀜.
					a[3-j][i]=n;
				}
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
		
