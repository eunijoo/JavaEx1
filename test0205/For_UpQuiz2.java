package test0205;

public class For_UpQuiz2 {
//������  3x+6y=27�� ����ظ� ���ϴ� ���α׷�
//��,x�� y�� ����, ������ ������ 0<=x<=10 , 0<=y<=10 
public static void main(String[] args) {
		for(int x=0; x<=10; x++) { //11�� �ݺ�
			for(int y=0; y<=10; y++) { //11�� �ݺ� 
				if(3*x+6*y==27) {  //3x+6y�� ���� �ȵȴ�. ������ �Ⱥٿ��ָ� �����ν� ����
					System.out.println("["+x+","+y+"]");
				}
			}
		}
	}
}


