package test0205;

public class For_For_Ex2 {

	public static void main(String[] args) {
		//다중for문
		for(int i=1;i<=3;i++) { //3번실행
			System.out.println("i"+i); 
			for(int j=1;j<=i;j++) {   //i값에 따라 1번, 2번,3번 실행함.
				System.out.println("i:"+i+","+"j"+j);
			}
			System.out.println("---------------------"); 
		}

	}

}
