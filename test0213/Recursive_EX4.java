package test0213;

public class Recursive_EX4 {
	public static void main(String[] args) {
		double s;
		
		s=Test4.pow(2,10);  //
		System.out.println(s);
		//x제곱근
		s=Test4.pow(2, -2);
		System.out.println(s);
		System.out.println(Math.pow(2, -2)); 
		
		//최대공약수
		System.out.println(Test4.gcd(120, 68));
		
		//2진수
		System.out.println(Test4.binary(14));
		
		//피보나치수열
		for(int i=1;i<10;i++) {
			System.out.print(Test4.fibo(i)+"  ");
		}
		System.out.println();
	}
}

class Test4{
	
//y가 음수일때 x의 제곱구해라
	public static double pow(int x, int y) {
		if(y>=0) { //0일때는 1
			return y==0 ? 1 : x*pow(x,y-1);
		}else {
			return (1.0/x) * pow(x,y+1);
		}
	}
	
//최대공약수 구하는 방법
	public static int gcd(int a,int b) {
		return b==0 ? a:gcd(b,a%b);
	}
	
//2진수 구하는 방법 //단, 양수만가능
	public static String binary(int n) {
		//return n<2 ? ""+n : binary(n/2)+(n%2);
		return n<2 ? Integer.toString(n): binary(n/2)+(n%2); //위와 같은 방법
	}
	
//피보나치수열 구하는 방법
	public static int fibo(int n) {
		return n<2 ? n : fibo(n-1)+fibo(n-2);
	}
	
	
}

	
	

