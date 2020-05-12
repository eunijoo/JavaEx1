package test0130;

public class OperEx6 {
	public static void main(String[] args) {
		int a,b;
		boolean c;
		
		// &&논리곱
		a=20; b=20;
		c=++a>20 && b++>20; //true && false = false
		System.out.println(a+","+b+","+c); //21,21,false
		
		a=20; b=20;
		c=++a>20 && ++b>20; //true && true = true
		System.out.println(a+","+b+","+c); //21,21,true
		
		a=20; b=20;
		c=a++>20 && ++b>20; //false && true = false 
		// &&은 하나만  false이면 false
		// 좌변이 false이면 &&은 우변은 연산하지 않는다.
		System.out.println(a+","+b+","+c); //21,20,false
		
		// ||논리합
		a=20; b=20;
		c=a++>20 || ++b>20; //false || true = true 
		System.out.println(a+","+b+","+c); //21,21,true
		// ||논리합
		a=20; b=20;
		c=++a>20 || ++b>20; //true || true = true 
		// ||는 하나만  true 이면 true
		// 좌변이 true이면 ||는 우변을 연산하지 않는다.
		System.out.println(a+","+b+","+c); //21,20,true	
		
		
	}

}
