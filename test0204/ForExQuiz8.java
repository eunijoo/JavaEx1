package test0204;

public class ForExQuiz8 {
//1~100���� �� �� 3�ǹ���� �� �ٿ� 10���� ���
//�������� 3�� ��� �� �� ����� ����ϴ� ���α׷�
	public static void main(String[] args) {
		int n,s; //n:�������� , s:�հ躯��
		int ave; //��պ���
		int cnt; //���ڼ��ִ� ����
		
		s=0; //�հ�� 0���� �ϱ� 0���� �ʱ�ȭ
		cnt=0; //���ڼ��°� 0���ʹϰ� 0���� �ʱ�ȭ
		
		for(n=1;n<=100;n++){ //1���� ;100���� ;1�� ���� (�ݺ�)
			//cnt++;
			if(n%3==0) { //������ 3���� ������ ���� 0�� �ȴٸ� if������ ����.
				s+=n; //n�� �հ踦 ���ϴ� ��
				System.out.print(n+"\t");
				
				++cnt; //���� ���� ��
				if(cnt%10==0) { //10���� �����ϴ� ��
				System.out.println(); //10������ �������
				}	
			}
		}	
		ave=(int)(s/cnt); //��ձ��ϴ� ��
		System.out.println();
		System.out.println("��:"+s);
		System.out.println("���:"+ave);
	}
}


