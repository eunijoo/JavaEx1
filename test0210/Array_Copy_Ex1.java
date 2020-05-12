package test0210;

public class Array_Copy_Ex1 {
	public static void main(String[] args) {
		int [] a= new int[] {10,20,30};
		int [] b= new int[a.length];  //new int[3]; �̶� ������
		int [] c= a; //c�� a�� ���� �迭(���� ���� ����)
		
		System.out.println(a==c); //true(�ּҺ�)
		System.out.println(a==b); //false(�ּҺ�)
		
		//b[0]=a[0]; b[0]=a[0]; b[0]=a[0];
		//�����迭, ������ ����������ġ, ��� �迭, �����ų ��ġ, ���簳��
		System.arraycopy(a, 0, b, 0, a.length); 
		
		System.out.println("a�迭");
		for(int n:b) {
			System.out.println(n+" ");
		}
		System.out.println();
		System.out.println("b�迭");
		for(int n:b) {
			System.out.println(n+" ");
		}
		
		a[1]=200;
		System.out.println(a[1]+":"+b[1]+":"+c[1]); //200:20:200
	}

}

