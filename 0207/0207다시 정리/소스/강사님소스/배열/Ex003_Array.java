
public class Ex003_Array {
	public static void main(String[] args) {
/*
 		�迭�� ũ�⸦ ���� �� �� ����.
*/
		int []arr=new int[3];
		arr[0]=10; arr[1]=20; arr[2]=30;
		
		System.out.println("�迭�� ũ�⸦ 3���� �����ϰ� ���� �Ҵ� ��...");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+"  ");
		System.out.println();
		
		System.out.println("\n�迭�� ũ�⸦ 5���� ���� ��...");
		arr=new int[5]; // �����迭�� ������ �÷���(garbage collector)�� ����� �ȴ�.
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+"  ");
		System.out.println();
	}
}
