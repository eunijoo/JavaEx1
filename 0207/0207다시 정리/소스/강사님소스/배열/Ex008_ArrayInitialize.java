public class Ex008_ArrayInitialize {
	public static void main(String[] args) {
/*		
		1차원 배열 초기화
		4380원을 지불하기 위해 필요한 500원, 100원, 50원, 10원짜리의 동전의 개수를 구하는 프로그램
*/
		int []unit;
		unit = new int[] {500, 100, 50, 10};
		
		int money=4380;
		
		System.out.println("금액 : " + money);
		System.out.println("동전\t개수");
		for(int n : unit) {
			System.out.println(n+"원\t"+(money/n));
			money %= n;
		}
	}
}
