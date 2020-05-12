package test0204;

//A~Z까지의 영문자를 한줄에 5개씩 출력하는 프로그램 작성
public class WhileQuize3 {

	public static void main(String[] args) {
		
		char a;
		int cnt=0;
		
		a='A';
		
		while(a<='Z') {  //출력이 a++보다 위에 있어서'Z'까지 찍으려면 (<=)식을 사용해야한다.
			System.out.print(a+" ");	
			cnt++; //출력 갯수
			if(cnt%5==0) { //출력 갯수가 5개가 될때마다 구문에 들어가져서 엔터가 출력됨
				System.out.println();
			}
			a++;   //형변환 안일어난다.
		}
	}
}


