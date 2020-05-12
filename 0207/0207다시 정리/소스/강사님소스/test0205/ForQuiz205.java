package test0205;

public class ForQuiz205 {
	public static void main(String[] args) {

		boolean b;
		int cnt=0;
		
		for(int i=2; i<=100; i++) {
			b=false;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					b=true;
					break;
				}
			}
			
			if(! b) {
				System.out.print(i+" ");
				cnt++;
				if(cnt%10==0) System.out.println();
			}
		}
		System.out.println("\n°³¼ö:"+cnt);
	}
}
