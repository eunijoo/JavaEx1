package test0203;

public class SwitchEx5 {
	public static void main(String[] args) {
		int a=12;
		
		switch(a%2) {
		case 0: System.out.println("2의배수");
		        switch(a%3) {
		        case 0:System.out.println("3의배수"); break;
		        case 1: case 2:System.out.println("3의배수아님"); break;
		        }
		        break;
		case 1:System.out.println("2의배수아님");
		        switch(a%3) {
		        case 0:System.out.println("3의배수"); break;
		        case 1: case 2:System.out.println("3의배수아님"); break;
		        }
		        break;
		}
	}
}
