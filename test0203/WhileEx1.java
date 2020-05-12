package test0203;


public class WhileEx1 {
	public static void main(String[] args) {
	 int n;
	 
	 n=0; //초기화가 필요
	 while(n<10) { //while(조건) { // 조건:true 또는 false
		 n++;
		 System.out.println("안:"+n); //n<10일때까지 계속 반복.
	 }								//1 2 3 4 5 6 7 8 9 10
	System.out.println("밖:"+n); //10
	}
}
