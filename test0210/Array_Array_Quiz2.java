package test0210;
//5행 5열의 배열에 A~Y까지의 영문자를 실행경과처럼 채워 출력하는 프로그램 작성
/*
   E   J   O   T   Y
   D   I   N   S   X
   C   H   M   R   W
   B   G   L   Q   V
   A   F   K   P   U
 */
public class Array_Array_Quiz2 {
	
	public static void main(String[] args) {
		char [][]a=new char[5][5];
		char n='A';
		
		for(int i=0;i<5;i++) {  //열
			for(int j=4;j>=0; j--) { //행 (출력을 아래부터해줌.)
				a[j][i]=n++;				
			}
		}
		
		//출력
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%4c",a[i][j]);
			}
			System.out.println();
		}
	}
}
		
