package test0130;

public class BookEx3 {

	public static void main(String[] args) {
		
	//��ü������ ���ذ� �� �Ȱ�..(��ħ�� ����)	
		int hex=0xABCD;//int ����
		int mask =0xF; //16���� 
		
		System.out.println("book128p"); //å���� 128p
		
		System.out.printf("hex=%X\n",hex);
		System.out.printf("%X\n",hex&mask);//D
		
		hex=hex>>4;
		System.out.printf("%X\n",hex&mask);//C
		
		hex=hex>>4;
		System.out.printf("%X\n",hex&mask);//B
		
		hex=hex>>4;
		System.out.printf("%X\n",hex&mask);//A

	}

}
