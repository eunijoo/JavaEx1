package test0205;

public class For_UpQuiz3 {
//a+b+c=25�� �����ϴ� �� �ڸ� �ڿ��� a,b,c�� ��� ���ϴ� ���α׷�
public static void main(String[] args) {
		
		int a,b,c;
		for(a=1;a<10;a++) {   		 //a�� 1-9����; 1������
			for(b=1;b<10;b++) {		 //b�� 1-9����; 1������
				for(c=1;c<10;c++) {  //c�� 1-9����; 1������
					if((a+b+c)%25==0) {  //a+b+c�� ���Ѱ��� 25�� �������� 0�̸� ���
						System.out.println(a+"+"+b+"+"+c+"="+"25");
					}
				}
	 		}
		}
	}
}


