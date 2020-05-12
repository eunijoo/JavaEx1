package test0210;
//5행 5열의 배열에 1~25까지의 수를 실행결과처럼 ㄹ자 모양으로 채워 출력하는 프로그램작성.
/*
   1   2   3   4   5
  10   9   8   7   6
  11  12  13  14  15
  20  19  18  17  16
  21  22  23  24  25
 */
public class Array_Array_Quiz1 {
	
	public static void main(String[] args) {
		int [][]a=new int[5][5];
		int n=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5; j++) {
				n++;
				if(i%2==0) {  //짝수행은 순서대로 증가
				a[i][j]=n;
				}else {  //홀수행의 열은 배열번호로 43210으로 바껴야하니깐 4-j를 해주면 배열방번호가 바뀜.
					a[i][4-j]=n;
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

		
		
