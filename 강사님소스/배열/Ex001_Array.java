public class Ex001_Array {
	public static void main(String[] args) {
/*	
		배열 선언 및 값 할당
*/
		int []num; // 배열 선언
		num= new int[5]; // 메모리 할당(5개를 저장 할 수 있는 정수형 배열)
		
		// int []num = new int[5]; // 배열 선언 및 메모리 할당
		
		// System.out.println(num[0]); // 0
		num[0]=1; num[1]=3; num[2]=5; num[3]=7; num[4]=9;
		// num[5]=11; // 런타임 오류. ArrayIndexOutOfBoundsException
		
		int s=0;
		for(int i=0; i<num.length; i++) { // length : 배열 요소의 개수
			s+=num[i];
		}
		
		System.out.println("결과 : " + s);
	}
}
