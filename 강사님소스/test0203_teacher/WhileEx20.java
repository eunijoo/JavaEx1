package test0203;

public class WhileEx20 {
	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+...+(1+2+...+10) 결과
		// 1+3+6+...+55
		int n,s,ss;
		
		n=s=ss=0;
		while(n<10) {
			n++;
			s+=n;
			ss+=s;
		}
		System.out.println("결과:"+ss);
	}
}
