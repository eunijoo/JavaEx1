package test0204;

public class ForEx7 {
//A~Z출력 //단 한줄에 5개씩
	public static void main(String[] args) {	
		char ch;
		int cnt=0;
		
		for(ch='A'; ch<='Z';ch++) {
			System.out.print(ch+" ");
			//cnt++;
			if(++cnt%5==0) {  //++cnt랑 조건식을 합침
				System.out.println();
			}
		}
 }
}