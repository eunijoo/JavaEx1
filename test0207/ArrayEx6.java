package test0207;

public class ArrayEx6 {
//4380원을 500원,100원,50원,10원짜리로 지불하기 위해서 필요한 동전개수?
//배열이용
	public static void main(String[] args) {
		int m=4380;
		int []u=new int[] {500,100,50,10};
		
		System.out.println(" 금액: "+m);
		
		//4380/500 => 8
		//4380/%500 =>380
		int x; //계산된 값 변수
		for(int n : u) {
			x=m/n;  //몫이 500원이 필요한 개수
			System.out.println(n+":"+x);
			
			m%=n; //나머지
		}
				
	}

}
