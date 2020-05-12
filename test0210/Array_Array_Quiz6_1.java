package test0210;
/*A~Z까지 문자를 난수를 이용해 발생된 문자를
  4*4 배열에 0행0열부터 행우선으로 대입하여 출력하는 프로그램 작성.
/*A~Z 까지의 영문자를 난수를 이용하여 발생하는 방법(2가지)
n=(char)((int)(Math.random()*26)+65); 또는
n=(char)((Math.random()*26)+'A');
*/
public class Array_Array_Quiz6_1 {
	
	public static void main(String[] args) {
		char []c=new char[16];
		char [][]a=new char[4][4];
		char n;
		
		for(int i=0;i<c.length;i++) {
			n=(char)((Math.random()*26)+'A');
			c[i]=n;
			
			for(int j=0;j<i;j++) {
				if(c[i]==c[j]) {
					i--;
					break;
				}
			}
		}
		int idx=0;
		for(int i=0;i<4;i++) { 
			for(int j=0;j<4; j++) { 
				a[i][j]=c[idx++];
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

		
