package test0205;
//���� �Ƕ�̵� ������α׷� 
//for���� while������ �����ض�.
public class For_For_piramide_ExQuiz15 {

	public static void main(String[] args) {

	//for_for �� 
		for(int i=1;i<=10;i++) { //10�� ����
			for(int j=i;j<=i+9;j++) { //10�� ����
				System.out.printf("%3d",j);
			}
			System.out.println();
		}
        System.out.println("===============================");
  
   //for -> while��       
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


