package test0210;

public class Array_Array_Ex1 {
	public static void main(String[] args) {
		int[][] a=new int[3][4];
		
		System.out.println("행수 : "+a.length);
		System.out.println("0행의 열수 : "+a[0].length);
		System.out.println("배열의 참조 위치(주소) :"+a);
		System.out.println("0행의 참조위치(주소):"+a[0]);
		System.out.println("1행2열의 값 : "+a[1][2]);
	}

}
