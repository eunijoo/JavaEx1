package tset0207;

public class Quiz05 {
	public static void main(String[] args) {
	
	// 12870원을 5000원, 1000원,500원,100원,50원,10원짜리로 지불하기 위해
	// 필요한 동전의 개수
		
	int s = 12870;
	int []a = new int[] {5000,1000,500,100,50,10};
	
	System.out.println("금액 :"+s);
	
	int x;
	for(int n : a) {
		x=s/n;
		System.out.println(n+":"+x);
		s%=n;
   } 
}
}