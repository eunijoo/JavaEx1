package test0130;

public class OperEx3 {
	public static void main(String[] args) {
		char a='A',b;
		
	//	b=a+1; //컴오류.문자+정수=정수 / char+int => int+int=>int
	//	b=(char)(a+1); //'B'
		
	//++,-- : byte,short,char에서 연산시 int로 형변환이 일어나지 않는다.
		
		b=++a; //형변환이 일어나지 않음. // 위에 코드보다 속도가 빠르다.
		System.out.println(a+","+b); //'B' , 'B'
	
		a='A';
		b= a++;
		System.out.println(a+","+b); //'B' , 'A'	
	}
}
