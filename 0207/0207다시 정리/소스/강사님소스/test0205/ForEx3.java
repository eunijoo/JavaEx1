package test0205;

public class ForEx3 {

	public static void main(String[] args) {
		int c;
		
		System.out.println("������");
		for(int a=2; a<=9; a++) {
			System.out.println(">>"+a+"�� <<");
			for(int b=1; b<=9; b++) {
				c=a*b;
				System.out.printf("%d*%d=%2d\n",a,b,c);
			}
			System.out.println("--------------\n");
		}

	}

}
