package test0210;
//4행5열의 배열에 1~20까지의 수를 실행 결과처럼 채워 출력하는 프로그램 작성
/*
   1   2   3   4   5
       6   7   8   9
          10  11  12
              13  14
                  15
 */
public class Array_Array_Quiz4 {
	
	public static void main(String[] args) {
		int [][]a=new int[5][5];
		int n=0;
		
		for(int i=0;i<5;i++) {  //행
			for(int j=i;j<5; j++) { //열
				n++;
				a[i][j]=n;
			}
		}
		
		//출력
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]!=0) {					
				System.out.printf("%4d",a[i][j]);
				}else { 
					System.out.print("    ");
				}
			}
			System.out.println();
		}	
	}
}

		
