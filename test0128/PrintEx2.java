package test0128;

public class PrintEx2 {
	public static void main(String[] args) {
		System.out.print("A\nB\n");    // \n : 라인넘김
		System.out.print("A\tB\tC\n"); // \t :탭키
		System.out.println("X\tY\nZ");
		
		System.out.println(10+5+"korea"); //15+문자열korea :문자열
		System.out.println("korea"+10+5); //korea+문자열 일공오 :문자열
		System.out.println("korea"+(10+5)); //korea+15 :문자열
		
		System.out.println('A'+10+"korea"); //75+korea :문자열
		System.out.println("A"+10+"korea"); //문자열A+문자열 일공+korea :문자열
		System.out.println("korea"+'A'+10); //korea+문자열A+문자열일공 :문자열
	}
}
