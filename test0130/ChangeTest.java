package test0130;

public class ChangeTest {

	public static void main(String[] args) {
		//두 변수의 값을 바꾸기
		int a=10, b=5;
		/*		
		int c;
		c=a; //c <- 10, c <-10 
		a=b; //a <- 5, a <-5
		b=c;//b <- 10
		System.out.println(a+","+b); // 5,10
		*/
		
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println(a+","+b); // 5,10
		
	}

}
