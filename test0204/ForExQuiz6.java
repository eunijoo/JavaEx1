package test0204;

public class ForExQuiz6 {
//1~100���� �� �� ¦���� ���� ����Ͽ� ����ϴ� ���α׷�
	public static void main(String[] args) {
		int n,s; //n:�������� , s:�հ躯��
		s=0; //���� 0���� �����ؾ��ϴϱ� 0���� �ʱ�ȭ
		
		for(n=0;n<=100;n++) { //¦���ϱ� n=0���� �ʱ�ȭ; 100����;1������
			s+=n;//s�� n�� ¦������ ���� �����
			//System.out.println(n); //¦���� �������°� �´��� Ȯ�����
			n++; //n+=1; �� ������ ���ε� n++�� �� ���̾�.
		}
		
		System.out.println("¦���� ��: "+s);
	}
}


