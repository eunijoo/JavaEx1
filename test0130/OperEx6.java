package test0130;

public class OperEx6 {
	public static void main(String[] args) {
		int a,b;
		boolean c;
		
		// &&����
		a=20; b=20;
		c=++a>20 && b++>20; //true && false = false
		System.out.println(a+","+b+","+c); //21,21,false
		
		a=20; b=20;
		c=++a>20 && ++b>20; //true && true = true
		System.out.println(a+","+b+","+c); //21,21,true
		
		a=20; b=20;
		c=a++>20 && ++b>20; //false && true = false 
		// &&�� �ϳ���  false�̸� false
		// �º��� false�̸� &&�� �캯�� �������� �ʴ´�.
		System.out.println(a+","+b+","+c); //21,20,false
		
		// ||����
		a=20; b=20;
		c=a++>20 || ++b>20; //false || true = true 
		System.out.println(a+","+b+","+c); //21,21,true
		// ||����
		a=20; b=20;
		c=++a>20 || ++b>20; //true || true = true 
		// ||�� �ϳ���  true �̸� true
		// �º��� true�̸� ||�� �캯�� �������� �ʴ´�.
		System.out.println(a+","+b+","+c); //21,20,true	
		
		
	}

}
