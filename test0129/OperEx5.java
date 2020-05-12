package test0129;

public class OperEx5 {

	public static void main(String[] args) {
		char a,b;
		a=65; //a='A';
		
		//b=a+10; // 컴파일오류, char+char => int+int =>int
		b=(char)(a+10);
		System.out.println(b); //k
	}
		
}
