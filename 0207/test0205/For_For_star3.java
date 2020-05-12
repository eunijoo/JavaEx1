package test0205;

public class For_For_star3 {

	public static void main(String[] args) {
		//int i,j; //i변수: 줄수를 계산해주는 변수, j: 출력값(*," ")을 계산해주는 변수,
//for문 6번써서 마름모
		//5줄에 5번실행.
		for(int i=1;i<=5;i++) { //5번실행 // 줄수 출력구문 //한줄이 생길때마다 별 늘림
			for(int j=1;j<=5-i;j++) {  //4번실행 //공백처리구문
				System.out.print(" "); //공백한칸
			}
			for(int j=1;j<=i*2-1;j++) { //홀수로 계산(1,3,5,7,9가 출력 되어야 하니깐)
				System.out.print("*");
			}
		System.out.println();
		}	
		//4줄 5번실행.
		for(int i=4;i>=1;i--) { //4번실행 // 줄수 출력구문//한줄이 생길때마다 별 줄임
			  for(int j=1;j<=5-i;j++) {  //4번실행 //공백처리구문
				System.out.print(" "); //공백한칸
			}
			for(int j=1;j<=i*2-1;j++) { //홀수로 계산(1,3,5,7,9가 출력 되어야 하니깐)
				System.out.print("*");
			}
		System.out.println();
		} 	
		System.out.println();	
		
//for문 2번만 사용하여 마름모		
		int s=5; //홀수만 가능 //별 총갯수
		int n;
		
		n=s/2; 
		for(int i=0; i<s ;i++) {
			for(int j=0; j<s-n;j++) {  //홀수로 계산
				System.out.print(j>=n ? "*" : " ");
			}
			n=i<(s/2) ? n-1 : n+1; //공백이 줄어들게 만들었다가. 다시 늘어나게 하는 구문
			System.out.println();
		}
	}
}
