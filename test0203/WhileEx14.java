package test0203;


public class WhileEx14 {
	public static void main(String[] args) {
	 int n,s;
	 n=0;
	 s=1;
	 //1*2*3...*9*10
	 while(n<10) {
		n++;
	 	s*=n;
	 }
	 System.out.println("°á°ú: "+s);
	}
}
