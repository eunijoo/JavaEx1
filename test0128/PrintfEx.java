package test0128;

public class PrintfEx {
	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=25;
		c=a+b;
		
		System.out.println("합:"+c);
		System.out.println(a+"+"+b+"="+c);
		
		System.out.printf("%d + %d = %d\n",a, b, c); //printf는 라인이 넘어가지 않는다.
													 //%d는 정수,정수입력갯수=선언값입력갯수
		System.out.format("%d + %d = %d\n",a, b, c); //printf와 같다.
		System.out.println("==================");
		
		
		
		
}
}
