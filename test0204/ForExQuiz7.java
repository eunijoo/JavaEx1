package test0204;

public class ForExQuiz7 {
//1~100���� �� �� Ȧ���� ���� ����Ͽ� ����ϴ� ���α׷�
	public static void main(String[] args) {
		int n,s; //n:�������� , s:�հ躯��
		s=0; //���� 0���� �����ؾ��ϴϱ� 0���� �ʱ�ȭ
		
		for(n=1;n<100;n++) { //Ȧ���ϱ� n=1���� �ʱ�ȭ; 100����;1������
			s+=n;//s�� n�� Ȧ������ ���� �����
			//System.out.println(n); //Ȧ���� �������°� �´��� Ȯ�����
			n++; //n+=1; �� ������ ���ε� n++�� �� ���̾�.
		}
		
		System.out.println("Ȧ���� ��: "+s);
	}
}


