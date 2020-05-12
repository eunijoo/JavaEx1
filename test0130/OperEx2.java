package test0130;

public class OperEx2 {
	public static void main(String[] args) {
		int a,b;
		
		a=10;
		b=a++ + a++ +1; // b=10+11+1
		System.out.println(a+","+b); //12 22
		
		a=10;
		b=++a + ++a +1;  //b=11+12+1
		System.out.println(a+","+b); //12 24
//----------------------------------------------------------------		
		
		a=10;
		b=a++ + ++a + ++a + a++ + a++; //b=10+12+13+13+14
		System.out.println(a+","+b); //15,62
				
		a=0;
		b=a---a; //a-- - a와 동일(값이 고정되어있어서 가능)
		System.out.println(a+","+b); //-1,1
	}

}
