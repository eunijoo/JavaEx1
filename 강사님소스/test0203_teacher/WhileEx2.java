package test0203;

public class WhileEx2 {

	public static void main(String[] args) {
		int n;
		n=0; // 초기화가 필요
		while(n<10) {
			n+=2;
			System.out.println("안:"+n); // 2 4 6 8 10 
		}
		System.out.println("밖:"+n); // 10
	}
}
