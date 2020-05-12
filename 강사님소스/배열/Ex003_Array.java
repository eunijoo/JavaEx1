
public class Ex003_Array {
	public static void main(String[] args) {
/*
 		배열은 크기를 변경 할 수 없다.
*/
		int []arr=new int[3];
		arr[0]=10; arr[1]=20; arr[2]=30;
		
		System.out.println("배열의 크기를 3개로 선언하고 값을 할당 후...");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+"  ");
		System.out.println();
		
		System.out.println("\n배열의 크기를 5개로 변경 후...");
		arr=new int[5]; // 이전배열은 가비지 컬렉터(garbage collector)의 대상이 된다.
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+"  ");
		System.out.println();
	}
}
