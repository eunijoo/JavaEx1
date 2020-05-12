package test0207;


public class ArrayEx1 {

	public static void main(String[] args) {


		int []a=new int[5]; //배열 선언과 메모리 할당.
		for(int i=0; i<a.length;i++) { //5번 반복(0,1,2,3,4)
		}
/*
 		//출력
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
*/
		//향상된 for문장
		for(int n : a) {	 //for( 자료형 변수 : 집합(배열명) )//배열a가 n에 저장.
			System.out.println(n);			
		}
	}

}
