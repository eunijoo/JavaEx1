package test0217;

public class Lang_Math_Class_EX14 {
	public static void main(String[] args) {
		double a;

	// PI값
		System.out.println(Math.PI);
	
	//sin30도 계산
		a = Math.sin(30.0/180*Math.PI); //
		System.out.println(a);
		
	//2의 제곱근구하기
		a= Math.sqrt(2); //sqrt : 제곱근
		System.out.println(a);
		
	//소수점이하 절삭하기.	
		a=Math.floor(12.77); // floor : 소수점이하 절삭(반올림안함)
		System.out.println(a); //12.0
		
	//2의 10승구하기
		a=Math.pow(2,10);
		System.out.println(a);
		
	//가까운 정수구하기
		a=Math.ceil(12.77);
		System.out.println(a); //ceil : 크거나 같은 정수
	
	
	}
}
