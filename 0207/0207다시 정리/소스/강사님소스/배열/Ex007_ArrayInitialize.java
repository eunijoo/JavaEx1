public class Ex007_ArrayInitialize {
	public static void main(String[] args) {
/*		
		1차원 배열 초기화
*/
		int []num=new int[] {2, 4, 6, 8, 10};
		// int []num= {2, 4, 6, 8, 10};
		
		int tot=0;
		for(int n : num) {
			tot+=n;
			System.out.print(n+" ");
		}
		System.out.println("\n합 : "+ tot);
	}
}
