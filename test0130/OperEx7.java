package test0130;

public class OperEx7 {
	public static void main(String[] args) {
		int a,b,c;
		a=12; b=6;
		
		// ~ ��Ʈ���� ����
		c=~a; 
		System.out.println(c); //-13
		
		// & ��Ʈ���� ����
		c=a&b; //��Ʈ�������� 1��1�� ��츸 1
			   //    0000 1100 
			   // &  0000 0111
		       //    0000 0100
		System.out.println(c); //4
		
		// | ��Ʈ���� ����
		c=a|b; //��Ʈ�������� 0��0�� ��츸 0
			   //    0000 1100 
			   // |  0000 0110
		       //    0000 1110
		System.out.println(c); //14
		
		// ^ ��Ʈ���� ��Ÿ������
		c=a^b; //��Ʈ�������� ���� ������̸� 1,������ 0
			   //    0000 1100 
			   // ^  0000 0110
		       //    0000 1010
		System.out.println(c); //10

}
}