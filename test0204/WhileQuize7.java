package test0204;

//x�� 100���� �����ؼ� 1�ʸ��� 2�� ����.
//y�� 0���� �����ؼ� 1�ʸ��� 5�� ����.
//�� �� �Ŀ� y�� x�� ����������� ��������� �� x,y���� ���ϴ� ���α׷�.
public class WhileQuize7 {

	public static void main(String[] args) {
		int x,y,s;
		
		x=100; y=0; s=0;
		
		while(x>=y) { //y�� x���� Ŀ�����ϴµ� y�� x�� ����ġ�� ������ �־ (>=)�� �����.
			s++;  //1�ʾ� ����
			x+=2; //x�� 2�� ����
			y+=5; //y�� 5�� ����
		}
		System.out.println(s+","+x+","+y);
	}
}


