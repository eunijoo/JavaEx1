package test0204;

public class ForEx8 {
//1~100���� �� �� 3�Ǵ� 5�� ����� ���ٿ� 5���� ����ϰ�,
//�������� �հ� ���
	public static void main(String[] args) {	
		int n; //1-100������ ����
		int cnt=0; //���� ���� �����ִ� ����
		int s=0; //�� ����
		
		for(n=1;n<=100;n++) {//1����100���� �ݺ�
			if(n%3==0 || n%5==0) { //3�Ǵ� 5�϶� if�� �ȿ� ��
				
			  //System.out.print(n+"\t");
				System.out.printf("%5d",n); //�� �İ� ����� ��. ���ڻ��� ���ݳ�����.
				s+=n; //3,5�� ��� �� ����
				
				cnt++; //��°��� �����ִ� ��
				if(cnt%5==0) { //5������ if���� ��
				System.out.println();
				}				
			}			
		}
		int ave=s/cnt; //��ձ��ϴ½�
		System.out.println();
		System.out.println("��:"+s);
		System.out.println("���: "+ave);
			

 }
}