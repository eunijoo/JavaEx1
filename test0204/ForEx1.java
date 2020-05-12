package test0204;

public class ForEx1 {

	public static void main(String[] args) {
		int n;
/*		
		for(n=1; n<=10 ; n++) {  // for(초기;조건;증감식)
			System.out.println("안:"+n); //123...910
		}
		System.out.println("밖:"+n); //11
*/
		n=1;
		for( ; n<=10 ;) {
			System.out.println("안:"+n); //123...910
			n++;  //결과는 동일하나 for문에서는 이렇게 안씀.
		}
		System.out.println("밖:"+n); //11
		}
	}


