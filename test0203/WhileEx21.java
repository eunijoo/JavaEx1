package test0203;

public class WhileEx21 {
	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)+...+(1+2+..+10)���
		//1+3+6+...+55
		int n,s,c;
		
		n=0;
		s=0;
		c=0;
		
		while(n<10) {
			n++;
			s+=n;			
			c+=s;  //c�� s���� �ѹ� �� �����ָ� ��.
		}
		System.out.println(c);
	}	
}
