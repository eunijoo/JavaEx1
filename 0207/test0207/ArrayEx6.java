package test0207;

public class ArrayEx6 {
//4380���� 500��,100��,50��,10��¥���� �����ϱ� ���ؼ� �ʿ��� ��������?
//�迭�̿�
	public static void main(String[] args) {
		int m=4380;
		int []u=new int[] {500,100,50,10};
		
		System.out.println(" �ݾ�: "+m);
		
		//4380/500 => 8
		//4380/%500 =>380
		int x; //���� �� ����
		for(int n : u) {
			x=m/n;  //���� 500���� �ʿ��� ����
			System.out.println(n+":"+x);
			
			m%=n; //������
		}
				
	}

}
