package test0204;

//피보나치수열 1+1+2+3+5+8+13+21합을 구하는 프로그램.
//피보나치수열=앞에 두 수를 더해 자기자신의 수를 만드는것  ex)(1+1)=2 (1+2)=3 (2+3)=5
public class WhileQuize9 {

	public static void main(String[] args) {
		int a=1, b=1,c;
		int s,n;
		
		n=2;
		s=2;
		while(n<8) {
		//System.out.println("원래값"+a+","+"위의 두수 더한값"+b); //어떻게 동작하는지 출력.
			c=a+b;
			s+=c;
			a=b;
			b=c;
			n++;
		}
		System.out.println("결과:"+s);
	}
}


