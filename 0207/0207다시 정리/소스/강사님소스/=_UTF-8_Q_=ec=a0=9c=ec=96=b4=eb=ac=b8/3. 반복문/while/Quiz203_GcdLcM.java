import java.util.Scanner;

public class Quiz203_GcdLcM {
	public static void main(String[] args) {
/*		
		�������� �Է� �޾� �Է� ���� ������ �ִ����� �� �ּҰ������ ���ϴ� ���α׷�
*/		
		Scanner sc=new Scanner(System.in);

		int num1, num2, a, b, lcm;
		System.out.print("�μ� ? ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// �������� �̿��� �ִ����� ���ϱ�
		a=num1;
		b=num2;
		int mod = a % b;
	    while(mod > 0) {
	    	a = b;
	    	b = mod;
	        mod = a % b;
	    }
		System.out.println("GCD(�ִ�����) : "+b);
		
/*	
		// a>b�� ��� a=a-b��, a<b�� ��� b=b-a�� a=b�� �ɶ����� �ݺ��ϸ� �� ���� �ִ�����
		a=num1;
		b=num2;
		while(a != b) {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println("GCD(�ִ�����) : "+a);
*/
		
		lcm = (num1*num2)/b;
		System.out.println("LCM(�ּҰ����) : "+lcm);
        
        sc.close();
	}
}
