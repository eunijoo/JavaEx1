package test0205;

public class ForExQuiz12 {
/* �̴�� ����ض�.
    i:1
	i:1 , j:1
	--------
	i:2
	i:2 , j:1
	i:2 , j:2
	--------
	i:3
	i:3 , j:1
	i:3 , j:2
	i:3 , j:3
	--------
*/public static void main(String[] args) {
		int i,j;
		for(i=1;i<=3;i++) {  //i�� 1-3���� ; 1�� ����
			System.out.println("i:"+i); //ĭ���� i�ϳ��� ���
			for(j=1;j<=i;j++) {   //1-i�� ���� ; 1�� ���� //i�� ����� j��°����� ����
				System.out.println("i:"+i+" , "+"j:"+j); //i�� j �Ѵ� ���
			}
			System.out.println("--------");
		}
	}
}


