package test0130;

public class BookEx1 {
	public static void main(String[] args) {
		String name = "JA"+"VA"; //����� ���ÿ� ���� ��
		String str = name +8.0; //strig�̶� 8.0�� ���ڷ� �����?
		
		System.out.println("book35p"); //å35p ����
		System.out.println(name);    //JAVA  //name�� ���
		System.out.println(str);     //JAVA8.0  //str�� ���
		System.out.println(7+'A');   //72  //����+���� �� ��� ���ڰ� ������ ���ȴ� ? 7+65(ASCII)=72�� ��
		System.out.println('A');     //A   //���ڱ״�� ��� 
		System.out.println('A'+7);   //72  //����+����
		System.out.println("A"+7);   //A7  //���ڿ�+����=���ڿ�
		System.out.println(7+7+'A'); //79  //(����+����)+����
		System.out.println('A'+7+7); //79  //(����+����)+����
		System.out.println("haha"+7+7); //haha77 //(���ڿ�+����)+���� ?
		System.out.println(7+7+"haha"); //14haha //(����+����)+���ڿ�  	
	}
}
	