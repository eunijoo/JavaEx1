package test0207;


public class ArrayEx1 {

	public static void main(String[] args) {


		int []a=new int[5]; //�迭 ����� �޸� �Ҵ�.
		for(int i=0; i<a.length;i++) { //5�� �ݺ�(0,1,2,3,4)
		}
/*
 		//���
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
*/
		//���� for����
		for(int n : a) {	 //for( �ڷ��� ���� : ����(�迭��) )//�迭a�� n�� ����.
			System.out.println(n);			
		}
	}

}
