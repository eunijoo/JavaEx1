package test0205;

public class For_For_gugudan2 {

	public static void main(String[] args) {
		int c;
		
		System.out.println("������");
		for(int a=2;a<=9;a++) {     // 8�� ����
			System.out.println(" >>"+a+"��<<");
			for(int b=1;b<=9;b++) {   //8*9=72�� ����
				c=a*b;
				System.out.printf("%d * %d =%2d\n",a,b,c);
			}
			System.out.println("---------------\n");
		}

	}

}
