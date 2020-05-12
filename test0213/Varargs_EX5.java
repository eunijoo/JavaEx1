package test0213;

public class Varargs_EX5 {
	public static void main(String[] args) {
		int s;
		
		Test5 ob=new Test5();
		
		
		s=ob.sum(1,2,3,4,5);
		System.out.println(s);
		
		s=ob.sum(2,4,6,8,10,12,14,16,18,20);
		System.out.println(s);
	}
}

class Test5{
	public int sum(int ...n) {  //비정형인자 (괄호 속에있는 인자가 가변)  (...):생략기호
		int s=0;
		for(int i:n) {
			s+=i;
		}
		
/*	비정형인자는 내부적으로 배열이기때문에 배열로 처리할수있다. => 배열의갯수가 다를때 사용하기 좋다.
		for(int i=0;i<n.length;i++) {
			s+=n[i];
		}
*/	
		return s;
	}
}

	
	

