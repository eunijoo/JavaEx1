package test0210;

public class ArgEx {
	public static void main(String[] args) { 
		System.out.println("����� �μ� ����:" +args.length);
		
		System.out.println("����� �μ���...");
		for(String s:args) {
			System.out.print(s);	
/*
 		for(int i=0; i<args.length;i++){
 			System.out.println(args[i]);
 		}
 */
		}		
	}
}

