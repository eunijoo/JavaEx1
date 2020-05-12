package test0130;

public class OperEx7 {
	public static void main(String[] args) {
		int a,b,c;
		a=12; b=6;
		
		// ~ 비트단위 부정
		c=~a; 
		System.out.println(c); //-13
		
		// & 비트단위 논리곱
		c=a&b; //비트단위에서 1과1인 경우만 1
			   //    0000 1100 
			   // &  0000 0111
		       //    0000 0100
		System.out.println(c); //4
		
		// | 비트단위 논리합
		c=a|b; //비트단위에서 0과0인 경우만 0
			   //    0000 1100 
			   // |  0000 0110
		       //    0000 1110
		System.out.println(c); //14
		
		// ^ 비트단위 배타적논리합
		c=a^b; //비트단위에서 서로 상대적이면 1,같으면 0
			   //    0000 1100 
			   // ^  0000 0110
		       //    0000 1010
		System.out.println(c); //10

}
}