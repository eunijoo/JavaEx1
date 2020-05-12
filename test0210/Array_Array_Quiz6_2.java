package test0210;
/*A~Z까지 문자를 난수를 이용해 발생된 문자를
  4*4 배열에 0행0열부터 행우선으로 대입하여 출력하는 프로그램 작성..
/*A~Z 까지의 영문자를 난수를 이용하여 발생하는 방법(2가지)
n=(char)((int)(Math.random()*26)+65); 또는
n=(char)((Math.random()*26)+'A');
*/
// Array_Array_Quiz6_1과 다른 방법으로 프로그램 작성함.
public class Array_Array_Quiz6_2 {
	
	public static void main(String[] args) {
		char [][]a=new char[4][4];
		char n;
		

		for(int i=0;i<4;i++) { //행
			for(int j=0;j<4; j++) {  //열
				n=(char)((Math.random()*26)+'A');
				a[i][j]=n;
				
				//같은문자가 있는지 확인하는 구문.
				gogo:
				for(int x=0; x<=i;x++) {  // x: i(행)인부분을 확인
					for(int y=0; y<a[x].length;y++) { //y:j(열)인부분 호가인
						if(x==i&&y>=j) continue gogo;
						if(a[i][j]==a[x][y]) {
							j--;
							break gogo;  //조건에 맞는것이 있으면 break하고,첫for문으로 올라감/.
						}
					}
				}
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

		
