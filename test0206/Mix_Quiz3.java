package test0206;
public class Mix_Quiz3 {
//1~100까지 수 중 3,6,9가 들어있는 수는 [*]로 출력.
//나머지 숫자는 자신의 수를 출력, 한줄에 10개씩 출력하는 프로그램.
	public static void main(String[] args) {
		
		for(int n=1; n<=100; n++) {  //1-100까지 출력
			if(n%10==3 || n%10==6 || n%10==9||n/10==3 || n/10==6 || n/10==9) { 
	   //1의자리가  3, 6, 9 인 경우(나머지값으로 계산) //10의 자리가 3,6,9일 경우(몫으로 계산)
		//	if(n/10>=3 && (n/10)%3==0 || n%10>=0 && (n%10)%3==0) {
				System.out.print("*\t");
			}else{
				System.out.print(n+"\t");
			}
			
			if(n%10==0) {   //10개마다 엔터출력
				System.out.println();
			}
		}
		
	}
}