package test0205;

public class ForExQuiz13 {
//����for�� �̿��ؼ� 2-9�ܱ��� ���(�Ʒ��������γ�����)
public static void main(String[] args) {
		int i,j; //i: ������� ���� , j:1-9���� ���ؾ��ϴ� ������ ����
		
		for(i=2;i<=9;i++) {  //2��-9�ܱ��� ;1�� ����
			System.out.println(" >>"+i+"��"+"<<");
			for(j=1;j<=9;j++) {  //1-9���� ��������
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
	}
}


