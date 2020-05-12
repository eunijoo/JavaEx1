package test0131;

public class IfEx1 {

	public static void main(String[] args) {
		//정수에 대한 절대값 구하기
		int n;
		//n=10; //if조건에 맞음.
		n=10; // 조건식에 안맞으니 if를 통과한다.
		if(n<0) //if(조건식)
			n=-n;
		System.out.println("절대값:"+n);
	}

}
