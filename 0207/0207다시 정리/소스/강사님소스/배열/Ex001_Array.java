public class Ex001_Array {
	public static void main(String[] args) {
/*	
		�迭 ���� �� �� �Ҵ�
*/
		int []num; // �迭 ����
		num= new int[5]; // �޸� �Ҵ�(5���� ���� �� �� �ִ� ������ �迭)
		
		// int []num = new int[5]; // �迭 ���� �� �޸� �Ҵ�
		
		// System.out.println(num[0]); // 0
		num[0]=1; num[1]=3; num[2]=5; num[3]=7; num[4]=9;
		// num[5]=11; // ��Ÿ�� ����. ArrayIndexOutOfBoundsException
		
		int s=0;
		for(int i=0; i<num.length; i++) { // length : �迭 ����� ����
			s+=num[i];
		}
		
		System.out.println("��� : " + s);
	}
}
