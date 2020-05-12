package test0204;

public class ForEx6 {

	public static void main(String[] args) {	
		int n,s;
		s=0;
		for(n=1;n<=10;n++) {
			s+=n;
			System.out.println("안"+n+","+s); //반복이 어떻게 되는지 볼수 있음.
		}
		System.out.println("밖"+n+","+s);
}
}