package test0205;

// 3x+6y==27  

public class ForQuiz202 {
	public static void main(String[] args) {
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(3*x+6*y==27) {
					System.out.println("["+x+","+y+"]");
				}
			}
		}
	}
}
