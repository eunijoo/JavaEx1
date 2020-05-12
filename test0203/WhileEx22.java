package test0203;

public class WhileEx22 {
	public static void main(String[] args) {
		// 1/2 + 2/3 +...+ 9/10 결과
		
		int n;
		double s; //int로 하면 전부 0이되서 실수로 잡아줘야함.
		
		n=0;
		s=0;
		
		while(n<9) {
			n++;
			s +=(double)n/(n+1);
		}
		System.out.println("결과:"+s);
		//System.out.printf("결과: %.2f\n",s); //소수점 2번째자리까지
	}		
}
