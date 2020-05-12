package test0207;

public class ArrayEx5 {

	public static void main(String[] args) {
		//배열 선언과 동시에 초기화
		int[] a=new int[] {10,20,30};
		//int[] a={10,20,30}; //가능
		
		System.out.println("요소 수:"+a.length);
		for(int n: a) {
			System.out.println(n+" "); //10 20 30 출력
		}
		System.out.println();
	}

}
