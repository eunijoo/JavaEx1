package test0210;
//�迭����
public class Array_Copy_Ex2 {
	public static void main(String[] args) {
		String []s1= {"java","oracle","web"};
		String []s2= new String[s1.length+3]; //s1.length =>3 +3 [6]
		//�迭���� ��ü�� null�� �ʱ�ȭ
				
		System.arraycopy(s1, 0, s2, 1,s1.length-1);
		
		System.out.println("s1�迭..");
		for(String s:s1) {
			System.out.print(s+" ");  
		}
		System.out.println();
		
		System.out.println("s2�迭..");
		for(String s:s2) {
			System.out.print(s+" ");
		}
		System.out.println();
	}

}

