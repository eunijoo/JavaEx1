package test0205;

public class For_UpQuiz4 {
//[ 1-2+3-4+5-...+9-10 = ��� ]������α׷�
public static void main(String[] args) {
		int s=0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				s+=i;  //Ȧ���� +
				System.out.print(i+"-");
			}else {
				s-=i;//�������� +
				System.out.print(i+(i==10? " = " : "+")); //�������� �� +������ �� ������ ���׽� ���
			}
		}
		System.out.println(s);
	}
}


