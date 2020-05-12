package test0129;

public class TypeEx3 {
	public static void main(String[] args) {

		char a;
		int b;

		a = '\u0041'; // 10진수 65
		System.out.println(a); // A출력

		b = '\013'; // 8진수
		System.out.println(b); // 11출력

		a = '\105'; // 10진수
		System.out.println(a); // E출력

		a = 97;
		System.out.println(a); // a출력

		System.out.println("\\"); // \출력

		int c = '대';
		System.out.println(c);

		a = 'A';
		// a=a+10; //에러. +결과는 최소 int

		a = (char) (a + 10);
		System.out.println(a); // K출력

		b = 'A';
		b = b + 'C';
		System.out.println(b); // 132출력

		float d = 'A';
		System.out.println(d); // 65.0 출력

	}

}
