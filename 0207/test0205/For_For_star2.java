package test0205;

public class For_For_star2 {

	public static void main(String[] args) {
		//int i,j; //i변수: 줄수를 계산해주는 변수, j: 출력값(*," ")을 계산해주는 변수,
//세모(공백은 그대로, 별수만 추가함)
		for(int i=1;i<=5;i++) { //5번실행 // 줄수 출력구문
			for(int j=1;j<=5-i;j++) {  //4번실행 //공백처리구문
				System.out.print(" "); //공백한칸
			}
			for(int j=1;j<=i*2-1;j++) { //홀수로 계산(1,3,5,7,9가 출력 되어야 하니깐)
				System.out.print("*");
			}
		System.out.println();
		}		
		System.out.println();

//세모(한칸에 출력되는게 5,6,7,8,9로 늘어나게)
		int s=9;
		for(int i=s/2+1;i<=s;i++) { //줄수 출력
			for(int j=0;j<i;j++) {  
				System.out.print((s-i)<=j ? "*" : " "); //삼항연산식 사용
			}
		System.out.println();
		}

	}
}
