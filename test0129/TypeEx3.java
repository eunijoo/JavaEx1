package test0129;

public class TypeEx3 {
	public static void main(String[] args) {

		char a;
		int b;

		a = '\u0041'; // 10���� 65
		System.out.println(a); // A���

		b = '\013'; // 8����
		System.out.println(b); // 11���

		a = '\105'; // 10����
		System.out.println(a); // E���

		a = 97;
		System.out.println(a); // a���

		System.out.println("\\"); // \���

		int c = '��';
		System.out.println(c);

		a = 'A';
		// a=a+10; //����. +����� �ּ� int

		a = (char) (a + 10);
		System.out.println(a); // K���

		b = 'A';
		b = b + 'C';
		System.out.println(b); // 132���

		float d = 'A';
		System.out.println(d); // 65.0 ���

	}

}
