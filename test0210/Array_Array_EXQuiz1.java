package test0210;
//이중배열 선언 방법과 행 및 열의 수를 구하는 프로그램.
public class Array_Array_EXQuiz1 {
	public static void main(String[] args) {
		int [][] arr1=new int[2][4];
		int[][] arr2=new int[3][];//행값만 주고,열값을 안줌.
		
		arr2[0]=new int[4];//열값을 다르게줌
		arr2[1]=new int[3];//열값을 다르게줌
		arr2[2]=new int[5];//열값을 다르게줌
		
		System.out.println("arr1.length : "+arr1.length);
		System.out.println("arr1[0].length : "+arr1[0].length);
		System.out.println("arr1[1].length : "+arr1[1].length);
		System.out.println("======================");
		System.out.println("배열행수arr2.length:"+arr2.length);
		System.out.println("0행 열수arr2[0].length : "+arr2[0].length);
		System.out.println("1행 열수arr2[1].length : "+arr2[1].length);
		System.out.println("2행 열수arr2[2].length : "+arr2[2].length);
		
		
	}

}
