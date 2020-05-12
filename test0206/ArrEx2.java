package test0206;

public class ArrEx2 {

	public static void main(String[] args) {//String[] : 매개변수
		//배열선언과 동시에 메모리 할당
		int []a=new int[3]; //정수를 저장할수 있는 변수3개 선언 개념.
		a[0]=10; a[2]=20; a[3]=30;
		System.out.println("배열의 요소의 수: "+ a.length);
	//	for(int i=0; i<3; i++) {
		for(int i=0; i<a.length; i++) {  //a.length 는 길이 모를때 쓰는 함수
			System.out.println(a[i]);
 	}
}
}