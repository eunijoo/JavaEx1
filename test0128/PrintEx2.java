package test0128;

public class PrintEx2 {
	public static void main(String[] args) {
		System.out.print("A\nB\n");    // \n : ���γѱ�
		System.out.print("A\tB\tC\n"); // \t :��Ű
		System.out.println("X\tY\nZ");
		
		System.out.println(10+5+"korea"); //15+���ڿ�korea :���ڿ�
		System.out.println("korea"+10+5); //korea+���ڿ� �ϰ��� :���ڿ�
		System.out.println("korea"+(10+5)); //korea+15 :���ڿ�
		
		System.out.println('A'+10+"korea"); //75+korea :���ڿ�
		System.out.println("A"+10+"korea"); //���ڿ�A+���ڿ� �ϰ�+korea :���ڿ�
		System.out.println("korea"+'A'+10); //korea+���ڿ�A+���ڿ��ϰ� :���ڿ�
	}
}
