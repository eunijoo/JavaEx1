package test0204;

public class ForEx4 {

	public static void main(String[] args) {	
/*	
//1-100���� �ձ��ϱ� 
 
		int s=0;
		
		for(int n=1;n<=100 ; n++) { 
			s+=n; //�ձ��ϱ�
			
		}
		System.out.println("���:"+s); //5050
*/
		
/*
//Ȧ�� �ձ��ϱ�
		int s=0;
		
		for(int n=1;n<=100 ; n+=2) {  //Ȧ�� �ձ��ϱ�(Ȧ���� 2�����̰� ���ϱ�)
			s+=n; //�ձ��ϱ�
			
		}
		System.out.println("Ȧ����:"+s); //2500
*/
/*
//¦���ձ��ϱ�
		int s,n;
		
		for(n=2,s=0;n<=100 ; n+=2) {  //s=0ó�� �ʱ�Ŀ���(,)�� ���� �ʱⰪ�� �� �� �ִ�.
			s+=n; //�ձ��ϱ�
			
		}
		System.out.println("¦����:"+s); //2550
*/
//�ձ��ϱ�
		int s,n;
		
		for(n=1,s=0; n<=100 ; s+=n,n++) {  //�±�� ������ �������� ������.���� ������ �ƴ�.
			;
			
		}
		System.out.println("���:"+s); //5050
}
}