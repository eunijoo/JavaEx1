package test0203;


public class WhileEx3 {
	public static void main(String[] args) {
	 int n;
	 
	 n=1; 
	 while(n<10) { 
		 n+=2;
		 System.out.println("안:"+n); //3 5 7 9 11
		 					//9까지는 n으로 들어와서 11이 나올 수 있음.
	 }
	System.out.println("밖:"+n);//11
	}
}
