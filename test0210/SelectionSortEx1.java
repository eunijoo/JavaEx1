package test0210;
//�������� : ���� ���� ���� �� ������ �������� ���Ĺ��
//		     ������� ���ڸ� �ϳ��ϳ� ��
public class SelectionSortEx1 {

	public static void main(String[] args) {
		int []num = new int[] {35,40,23,50,15};
		int temp;
		
		System.out.println("source data : ");  //�������ĵǱ� �� �迭�� ��� 
		for(int n : num) {  //���� for��
			System.out.print(n+" ");
		}
		System.out.println();
/*		
1ȸ��(0)=>0:1,0:2,0:3,0:4
2ȸ��(1)=>1:2,1:3,1:4
3ȸ��(2)=>2:3,2:4
4ȸ��(3)=>3:4
*/
		for(int i=0;i<num.length-1; i++) { //(ȸ��)�����Ͱ� 5���� 4�� �ݺ�  //���� i:���ϴ� ����(�ռ���)
			for(int j=i+1;j<num.length;j++) {//j����:�񱳴��ϴ� ����(�޼���)
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("source data : "); //�������� �� �迭�� ���
		for(int n : num) {
			System.out.print(n+" ");
		}	
	}

}
