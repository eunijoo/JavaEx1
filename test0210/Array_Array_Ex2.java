package test0210;

public class Array_Array_Ex2 {
	public static void main(String[] args) {
		
		int[][] a=new int[3][];//행값만 주고,열값을 안줌.
		a[0]=new int[4];//열값을 다르게줌
		a[1]=new int[3];//열값을 다르게줌
		a[2]=new int[5];//열값을 다르게줌
		
		System.out.println("배열행수:"+a.length);
		System.out.println("0행 열수"+a[0].length);
		System.out.println("1행 열수"+a[1].length);
		System.out.println("2행 열수"+a[2].length);
	}

}
