package test0205;

public class For_UpQuiz5 {
//1-100���� �� �� �Ҽ��� ���ٿ� 10���� ����ϰ�,
//�������� �Ҽ��� ������ ����ϴ� ���α׷�
public static void main(String[] args) {
		boolean b;  
		int cnt=0; //���ڼ��ִ� ����
		for(int i=2;i<=100;i++) { 	//2���� 100���� �Ҽ����� �ƴ���
			b=false;   				 // �Ҽ��϶�
			for(int j=2;j<i;j++) {	// 1�� ������ ������ �Ǿ 2���� 
				if(i%j==0) {  		 //0���� �������� 
					b=true; 		//�Ҽ��� �ƴҶ�
					break; 			//�ݺ�Ƚ���� �ٿ���. ��½ð��� �� ������.
				}
			}
			if(!b) {				//�Ҽ��϶�
				System.out.print(i+"\t");
				cnt++; 				//���� ����
				if(cnt%10==0) { 	//10������ �������
					System.out.println();
				}
			}
		}
			System.out.println("\n�Ҽ��� ���� : "+cnt);
	}
}


