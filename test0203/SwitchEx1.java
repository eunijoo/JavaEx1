package test0203;

public class SwitchEx1 {

	public static void main(String[] args) {
		
		int a=3;
		
		switch (a) {  //변수,연산식
		case 3:System.out.print("*"); //a=3이냐? //3이 맞으면 아래전부 출력
		case 2:System.out.print("#"); 
		case 1:System.out.println("$");
		}
		
		int b=2;
	
		switch (b) {
		case 3:System.out.print("*"); //b=2여서 3은 통과하고 2부터 출력됨.
		case 2:System.out.print("#"); 
		case 1:System.out.print("$");
		}

	}
}