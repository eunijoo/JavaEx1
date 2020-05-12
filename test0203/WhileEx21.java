package test0203;

public class WhileEx21 {
	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)+...+(1+2+..+10)결과
		//1+3+6+...+55
		int n,s,c;
		
		n=0;
		s=0;
		c=0;
		
		while(n<10) {
			n++;
			s+=n;			
			c+=s;  //c에 s값을 한번 더 더해주면 됨.
		}
		System.out.println(c);
	}	
}
