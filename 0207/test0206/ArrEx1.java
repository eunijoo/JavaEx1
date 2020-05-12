package test0206;

public class ArrEx1 {

	public static void main(String[] args) {//String[] : 매개변수
/*	
		int [] a; //배열선언
	
		int b;//메모리를 확보하고  할당을 받아야 사용 가능
		b++;
*/	
		int []a; 	//배열선언 //정수를 저장할 수 있는 방.
		a=new int[5]; 	//메모리할당  //new : 연산자   // 배열명[첨자]
						//정수값을 5개 저장할수 있는 정수형 배열
						//메모리를 할당하면서 5개의 정수배열 요소는 0으로 초기화됨.
						//정수형 변수 5개를 선언한 경우와 유사.
		//int n; 
		//System.out.println(n); //에러. 초기화가 되지 않음
		
		//배열은 메모리를 할당하면 값을 초기화 하지 않아도 사용 가능.
		System.out.println(a[0]); //0
								// 배열에서 0번째 위치의 값을 출력
								//배열의 첨자는 0부터 길이 -1까지 사용 가능.
		//배열요소 사용
		a[0]=10; a[1]=20; a[2]=30; a[3]=40; a[4]=50;
		//a[5]=60; //런타임오류. 배열의 사용범위를 벗어남.
				 //런타임오류는 java.lang.ArrayIndexOutOfBoundsException 이유를 알려줌
				 //->인덱스를 벗어낫다.예외가 생겼다는 뜻.프로그램이 죽음.
				 //a=new int[5]=>a[0]~a[4]까지 사용 가능.
		System.out.println(a[0]);
 	}
}
