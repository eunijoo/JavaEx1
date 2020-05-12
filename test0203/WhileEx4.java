package test0203;


public class WhileEx4 {
	public static void main(String[] args) {
	 int n;
	 
	 n=1; 
	 while(n<10) { 
		 System.out.println("안:"+n); //1 3 5 7 9	 				
		 n+=2; //11인 상태에서 while문 빠져나옴. //3 5 7 9 11
	 }
	System.out.println("밖:"+n);//11
	}
}
