package test0204;

//1+2+3+...+n까지의 합이 100을 넘는 최소의 n과 그때의 합은 얼마인지 출력.
public class WhileQuize5 {

	public static void main(String[] args) {
		
		int n,s;
		n=s=0;
		
		while(s<=100) {  //100이 최소이기때문에 (<=)를 써야함.
			n++;
			s+=n;
		//	System.out.println(n+","+s); //합이 어떻게 되는지 출력됨.
		}
		System.out.println(n+","+s);
	}
}


