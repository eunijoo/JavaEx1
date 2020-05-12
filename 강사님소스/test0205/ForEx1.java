package test0205;

public class ForEx1 {

	public static void main(String[] args) {
		// 다중 for
		for(int i=1; i<=3; i++) {
			System.out.println("i:"+i); // 3번
			for(int j=1; j<=2; j++) {
				System.out.println("i:"+i+", j:"+j); // 3*2=6번
			}			
			System.out.println("-------------"); // 3번
		}

	}

}
