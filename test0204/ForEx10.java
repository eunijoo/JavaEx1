package test0204;

public class ForEx10 {

	public static void main(String[] args) {	
		int count=0;
		int s=2000000000;//20��
/*
 float a=2000000000,b=2000000050;  //float������ 2000000050�� 2000000000�� ���� ���ڷ� �ν�(50�� ©��)
 System.out.println(a==b);  //true
 */
		for(float f=s; f<s+50;f++) { //float���� �ݺ��������� ���� �ʴ´�.���е��� ���Ƽ� ���� ���Ҽ� �ִ�.
			count++;				//�Ǽ��� �������Ŀ� ���� �ʴ´�. ��Ȯ�Ѱ��ȳ���.
		}
		System.out.println(count); //0
 }
}