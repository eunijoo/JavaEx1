package test0204;

//A~Z������ �����ڸ� ���ٿ� 5���� ����ϴ� ���α׷� �ۼ�
public class WhileQuize3 {

	public static void main(String[] args) {
		
		char a;
		int cnt=0;
		
		a='A';
		
		while(a<='Z') {  //����� a++���� ���� �־'Z'���� �������� (<=)���� ����ؾ��Ѵ�.
			System.out.print(a+" ");	
			cnt++; //��� ����
			if(cnt%5==0) { //��� ������ 5���� �ɶ����� ������ ������ ���Ͱ� ��µ�
				System.out.println();
			}
			a++;   //����ȯ ���Ͼ��.
		}
	}
}


