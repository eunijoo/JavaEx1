package test0204;

public class ForQuiz8 {
//�ΰ��� �ֻ����� ���� �� �ֻ����� ���� ���� 9�� �Ǵ� ��츦 ��� ����ϴ� ���α׷�
	public static void main(String[] args) {

		int num1,num2; //num1,num2 :�� �ֻ��� ����
	
		for(num1=1;num1<=6;num1++) { 		 //num1�� �ֻ����� 1-6������ ���� ;1������
			for(num2=1;num2<=6;num2++) { 	//num2�� �ֻ����� 1-6�������� ; 1������
				if(num1+num2==9) {    		// �� �ֻ��� ���� 9�� �Ǵ� ��쿡 ���
					System.out.println("[ "+num1+","+num2+" ]"); //���
				}			
			}	
		}
	}
}


