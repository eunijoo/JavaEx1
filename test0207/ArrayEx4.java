package test0207;

public class ArrayEx4 {

	public static void main(String[] args) {
		int []a=new int[3]; //�迭 ����� �޸� �Ҵ�.
		a[0]=10;a[1]=20;a[2]=30;
		
		System.out.println("�迭����");
		for(int n:a) {
			System.out.println(n+" "); //10 20 30
		}
		System.out.println();
		
		//�迭�� ũ�⺯��
		//�迭�� ũ�⸦ �����ϸ� ������ �迭�� ��ġ�� �����Ҽ� ����
		//	�������÷���(garbage collector)�� ����̵Ǹ� , ���ο� �迭�� �����.
		a=new int[5];  //�ٸ����� ��ٽ� ���� //�ּҰ� ���ο�迭�� �ּҷ� �ٲ�Ե�.
		a[3]=40;a[4]=50;  // ũ�⸦ �߰��Ѱ� �ƴϰ�, ���� �����.
		
		System.out.println("�迭 ũ�� ���� ��");
		for(int n:a) {
			System.out.println(n+" ");  //0 0 0 40 50 (�������� �� �����)
		}
		System.out.println();
	}

}
