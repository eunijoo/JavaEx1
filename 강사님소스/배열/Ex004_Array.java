
public class Ex004_Array {
	public static void main(String[] args) {
/*
 		배열은 참조형이다.
*/
		int []a=new int[3];
		a[0]=10; a[1]=20; a[2]=30;

		System.out.println("초기 a 배열...");
		for(int n : a)
			System.out.print(n+"  ");
		System.out.println();
		
		int []b = a;
		b[1]=200; b[2]=300;

		System.out.println("\na 배열...");
		for(int n : a)
			System.out.print(n+"  ");
		System.out.println();

		System.out.println("\nb 배열...");
		for(int n : b)
			System.out.print(n+"  ");
		System.out.println();
	}
}
