package test0210;
//5�� 5���� �迭�� 1~25������ ���� ���� ���ó�� ������ ������� ä�� ����ϴ� ���α׷� �ۼ�.
//2���� ������(2���� for, if~else if��)
//9�� ȸ���ؾ���
public class Array_Array_Quiz7 {
	
	public static void main(String[] args) {

		int num=5;   //
		int arr[][] = new int[num][num];
		int n=0, r=0, c=-1;

		for(int i = 1; i <= num*2-1; i++) {  //ȸ���� �� 9�� ȸ���̵�.
			for(int j = 0; j < num-(i/2); j++) {
				n++;
				if(i%4==1) // ��->��
					arr[r][++c]=n;  //��ǥ�� ������ (r,c) => ��->���϶��� r������, c�� ����
				else if(i%4==2) // ��->�Ʒ�
					arr[++r][c]=n;  //��ǥ�� ������ (r,c) => ��->�Ʒ��϶��� r�� ����,c������
				else if(i%4==3) // ��->��
					arr[r][--c]=n;  //��ǥ�� ������ (r,c) => ��->���϶��� r������,c�� ����
				else // �Ʒ�->��
					arr[--r][c]=n;  //��ǥ�� ������ (r,c) => �Ʒ�->���϶��� r������,c������
			}
		}
		
		//���
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}	
	}
}

