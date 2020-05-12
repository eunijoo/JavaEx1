package test0203;

public class SwitchEx2 {

	public static void main(String[] args) {
		
	int a=13;
	//a%3  => 0,1,2
	
	switch(a%3) { //변수,연산식,수식 가능
	case 0:System.out.println(a+": 3의 배수");
	break; //case문에서 빠져나감
	case 1:
	case 2:System.out.println(a+": 3의 배수아님");
	break;
	}

	}
}