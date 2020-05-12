package test0205;

public class For_For_Star1 {

	public static void main(String[] args) {
		//int i,j; //i변수: 줄수를 계산해주는 변수, j: 출력값(*," ")을 계산해주는 변수,
//왼쪽벽에 붙은 반세모	
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
//왼쪽에 붙은 반역세모	
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
//오른쪽에 붙은 반세모		
		for(int i=1;i<=5;i++) { //5번실행
			for(int j=1;j<=5-i;j++) {  //4번실행 //공백처리구문
				System.out.print(" "); //공백한칸
			}
			for(int j=1;j<=i;j++) { //별출력
				System.out.print("*");
			}
			System.out.println();
		}		
		System.out.println();
//for문 2번써서 오른쪽에 반세모
		for(int i=0;i<5;i++) { //줄 수를 나타내는 구문 //5줄
			for(int j=5;j>0;j--) {  //한줄에 5개 출력해라. //5개
				System.out.print(j<=i+1?"*":" "); //삼항연산자 사용
			}
			System.out.println();
		}
		System.out.println();	
	}
}
