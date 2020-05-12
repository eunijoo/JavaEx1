package test0205;

public class For_For_Ex1 {

	public static void main(String[] args) {
		//다중for문
		for(int i=1;i<=3;i++) {
			System.out.println("i"+i); //3번실행
			for(int j=1;j<=2;j++) {  //3*2=6번실행
				System.out.println("i:"+i+","+"j"+j);
			}
			System.out.println("---------------------"); //3번 실행(for문안에 들어가있음.
		}

	}

}
