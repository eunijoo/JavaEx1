package test0206;

public class ArrEx2 {

	public static void main(String[] args) {//String[] : �Ű�����
		//�迭����� ���ÿ� �޸� �Ҵ�
		int []a=new int[3]; //������ �����Ҽ� �ִ� ����3�� ���� ����.
		a[0]=10; a[2]=20; a[3]=30;
		System.out.println("�迭�� ����� ��: "+ a.length);
	//	for(int i=0; i<3; i++) {
		for(int i=0; i<a.length; i++) {  //a.length �� ���� �𸦶� ���� �Լ�
			System.out.println(a[i]);
 	}
}
}