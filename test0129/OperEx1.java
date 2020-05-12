package test0129;

public class OperEx1 {
	public static void main(String[] args) {
		short a=10, b=5 ,c;
		//c=a+b; //+결과는 int, int는 short에 대입할 수 없으므로 컴파일오류
		
		//c=(short)a+b; //+때문에 오류 
		c=(short)(a+b); 
		
		System.out.println(c);
		
		int x,y; //x와 y는 값이 없는 상태
	//	x=y+'A'; //컴파일오류,y가 초기화 되지 않았으므로.
		
		y=10;
		x=y+'A';
		System.out.println(x);
		
	}

}
