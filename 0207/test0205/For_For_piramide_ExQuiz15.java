package test0205;
//숫자 피라미드 출력프로그램 
//for문을 while문으로 수정해라.
public class For_For_piramide_ExQuiz15 {

	public static void main(String[] args) {

	//for_for 문 
		for(int i=1;i<=10;i++) { //10번 실행
			for(int j=i;j<=i+9;j++) { //10번 실행
				System.out.printf("%3d",j);
			}
			System.out.println();
		}
        System.out.println("===============================");
  
   //for -> while문       
          int i,j;
          i=1; j=i;
          
          while(i<=10) {
        	  j=i;
        	  while(j<=i+9) {
        		  System.out.printf("%3d",j);
        		  j++;
        	  }
        	  System.out.println();
        	  i++;	  
          }
	}
}


