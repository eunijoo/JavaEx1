package test0207;

public class ArrayEx4 {

	public static void main(String[] args) {
		int []a=new int[3]; //배열 선언과 메모리 할당.
		a[0]=10;a[1]=20;a[2]=30;
		
		System.out.println("배열내용");
		for(int n:a) {
			System.out.println(n+" "); //10 20 30
		}
		System.out.println();
		
		//배열의 크기변경
		//배열의 크기를 변경하면 이전의 배열은 위치를 참조할수 없어
		//	가비지컬렉터(garbage collector)의 대상이되며 , 새로운 배열을 만든다.
		a=new int[5];  //다른곳에 방다시 잡음 //주소가 새로운배열의 주소로 바뀌게됨.
		a[3]=40;a[4]=50;  // 크기를 추가한게 아니고, 새로 만든것.
		
		System.out.println("배열 크기 변경 후");
		for(int n:a) {
			System.out.println(n+" ");  //0 0 0 40 50 (이전값은 다 사라짐)
		}
		System.out.println();
	}

}
