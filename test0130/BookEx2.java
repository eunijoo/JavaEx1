package test0130;

public class BookEx2 {

	public static void main(String[] args) {
		char c1 ='a'; //�� �ڵ尪97�� ������ �Ǵ��� �����ڽ��ϴ�... char�� �������̿��� �׷��ǰ���?
		char c2 =c1;  //c1���� c2�� ����
		char c3 =' '; //c3�� �������� �ʱ�ȭ�Ѵ�.
		
		int i = c1 +1; //97+1 //98
		
		c3= (char)(c1+1); //c1+1 ����� int�̹Ƿ� char�� c3�� �����ϱ� ���ؼ��� char�� ����ȯ �ʿ�.
		c2++;  //����++ //97 
		c2++;  //����++ //98
		
		System.out.println("book103p"); //å���� 103p
		System.out.println("i="+i); //i=98 
		System.out.println("c2="+c2); //c2=c //99=c�� �ڵ尪
		System.out.println("c3="+c3); //c3=b //98=b�� �ڵ尪

	}

}
