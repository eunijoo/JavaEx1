package test0204;

//1~100���� �� �� 3�Ǵ� 5�� ��� �հ� ����� ���ϴ� ���α׷� �ۼ�.
public class WhileQuize4 {

	public static void main(String[] args) {
		
		int n,s,cnt;
		
		n=s=cnt=0;
		
		while(n<100) {  //1-100���� �ݺ�
			n++; //�ʱⰪ 0���� ����
			if(n%3==0 || n%5==0) {  //3�Ǵ� 5 �� ��� if������ ����.
				//System.out.println(n+" ");  //3,5��������µ�
				s+=n; //�� ���ϱ�
				cnt++; // 3,5�� �ش�Ǵ� ���� ����		
			}
		}
		System.out.println("��:"+s);
		System.out.println("���:"+(s/cnt)); 
	}
}


