package test0204;

public class ForQuiz8 {
//두개의 주사위를 던져 두 주사위의 눈의 합이 9가 되는 경우를 모두 출력하는 프로그램
	public static void main(String[] args) {

		int num1,num2; //num1,num2 :두 주사위 변수
	
		for(num1=1;num1<=6;num1++) { 		 //num1은 주사위로 1-6까지만 가능 ;1씩증가
			for(num2=1;num2<=6;num2++) { 	//num2은 주사위로 1-6까지가능 ; 1씩증가
				if(num1+num2==9) {    		// 두 주사위 합이 9가 되는 경우에 출력
					System.out.println("[ "+num1+","+num2+" ]"); //출력
				}			
			}	
		}
	}
}


