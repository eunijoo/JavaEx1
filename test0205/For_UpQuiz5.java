package test0205;

public class For_UpQuiz5 {
//1-100까지 수 중 소수를 한줄에 10개씩 출력하고,
//마지막에 소수의 개수를 출력하는 프로그램
public static void main(String[] args) {
		boolean b;  
		int cnt=0; //숫자세주는 변수
		for(int i=2;i<=100;i++) { 	//2부터 100까지 소수인지 아닌지
			b=false;   				 // 소수일때
			for(int j=2;j<i;j++) {	// 1은 모든수에 포함이 되어서 2부터 
				if(i%j==0) {  		 //0으로 나눠지면 
					b=true; 		//소수가 아닐때
					break; 			//반복횟수를 줄여줌. 출력시간이 더 빨라짐.
				}
			}
			if(!b) {				//소수일때
				System.out.print(i+"\t");
				cnt++; 				//숫자 세줌
				if(cnt%10==0) { 	//10개마다 엔터출력
					System.out.println();
				}
			}
		}
			System.out.println("\n소수의 개수 : "+cnt);
	}
}


