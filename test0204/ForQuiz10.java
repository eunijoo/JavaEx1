package test0204;

//1~100����  �� �߿� 4�� 6�� ������� ����ϴ� ���α׷�
//������� 4�ǹ���̰�,6�ǹ�� �� ���
public class ForQuiz10 {
	public static void main(String[] args) {

		int n; //��������
		
		for(n=1;n<=100;n++) {	  //1~100���� ;1�� ����
			if(n%4==0 && n%6==0) { // 4�ǹ���̰�,6�� ����� ��� ���
				System.out.print(n+" ");
			}
		}
	}
}
		
	
	

	



