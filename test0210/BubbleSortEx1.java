package test0210;
//�������� : ���� ū ���� �ǵڷ� ����
//		   ���ڰ� �̵��ϸ鼭 ����.
public class BubbleSortEx1 {

	public static void main(String[] args) {
		int []num = new int[] {35,40,23,50,15};
		int temp;
		
		System.out.println("source data : ");  //�������ĵǱ� �� �迭�� ��� 
		for(int n : num) {  //���� for��
			System.out.print(n+" ");
		}
		System.out.println();
/*		
1ȸ��(0)=>0:1,1:2,2:3,3:4
2ȸ��(1)=>0:1,1:2,2:3
3ȸ��(2)=>0:1,1:2
4ȸ��(3)=>0:1
*/
		for(int i=1; i<num.length;i++) {     //(ȸ��)�����Ͱ� 5���� 4�� �ݺ�  //���� i:ȸ�� Ƚ��
			for(int j=0;j<num.length-1;j++) {  //j���� : ���ؾ��ϴ� ����
				if(num[j]>num[j+1]) {
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.out.println("source data : "); //�������� �� �迭�� ���
		for(int n : num) {
			System.out.print(n+" ");
		}	
	}
}

