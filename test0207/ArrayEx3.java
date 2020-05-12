package test0207;

public class ArrayEx3 {

	public static void main(String[] args) {
		int []a= new int[3]; //new 한번만쓰면 방1개만 생김
		int []b=a;  //배열은 참조형임.
					//a와 b 참조변수가 하나의 배열을 공유.(방은 1개에 이름은 2개)
		 			//a방에 있던 값은 버려지고, b값이 저장됨.
		a[0]=10;a[1]=20;a[2]=30;
		b[1]=200;
		
		System.out.println("a배열 내용..");
		for(int n : a) {
			System.out.println(n+"  "); //10 200 30
		}
		System.out.println();
		
		System.out.println("b배열 내용..");
		for(int n : b) {
			System.out.println(n+"  "); //10 200 30
		}
		System.out.println();
	}

}
