package test0211;

public class Class_Method_Ex7 {  
	public static void main(String[] args) { //Ŭ�������� (static)
		Test7 tt=new Test7();
		int result;
		result=tt.sum(20);
		System.out.println("��� : "+result);
		
		System.out.println("4�� ¦���ΰ�?? "+tt.isEven(4));	
		System.out.println(tt.upper('a'));
		System.out.println(tt.isUpper('A'));
		
		result = tt.sum2(10, 1);
		System.out.println(result);
		
		tt.gugu(15); //void �޼ҵ�� ���� ��ȯ���� �ʴ´�.
		
		double n =tt.grade(50);// return��  int�� ����Ǿ��־ double������ �ٽ� �ش�;
		System.out.println(n);
	}
}

class Test7{
	//1~n���� ���� ���ϴ� �޼ҵ�
	public int sum(int n) {//�Ű�����(�Ķ����)
		//�Ű������� ���������� �����ϰ� ���ø޸� ����Ȯ��
		int s=0;
		for(int i=1;i<=n;i++) {
			s+=i;
		}
		return s;
	}
	
	//�Ű������� ���޵� ������ ¦������ �Ǻ��ϴ� �޼ҵ�
	public boolean isEven(int n) {
		return n%2==0;
	}	
	
	//�Ű������� ���޵� ������ �ҹ��ڸ� �빮�ڷ� ��ȯ�ϴ� �޼ҵ�
	public char upper(char ch) {
/*		
		char c;
		c=ch>='a'&&ch<='z'?(char)(ch-32) :ch;  //������� ������ �����ϱ� char�� ����ȯ
		return c;
*/
		return ch>='a'&&ch<='z' ? (char)(ch-32) : ch;  //���� ������ ���ٷ� �ۼ��Ѱ�.
		
		}
		
	//�Ű������� ���޵� ���ڰ� �빮������ �Ǻ�
	public boolean isUpper(char ch) {
		return ch>='A' && ch<='Z';
	}
	
	//�� ������ �Ű������� ���޹޾� ���������� ū������ ��(�Ű����� 2��)
	public int sum2(int a,int b) { //�Ű�����(=�Ķ����,���μ�)�� �ڷ����� �����ش�. (int a,b)�ȵ�
		int t,s;
		if(a>b) {
			t=a; a=b;b=t;
		}
		s=0;
		for(int i=a;i<=b;i++) {
			s+=i;	
		}
		return s;  //����Ÿ����  void��  �ƴϹǷ� �����Ұ�.
				   //return���� ������ �����Ͽ���
	}
	
	//��¸��ϰ� �ǵ��� �� ���� ����.
	public void gugu(int dan) {
		if(dan<1 || dan>9) {
			System.out.println("**�� �Է� ����**");
			return; //����Ÿ���� void�� ��� ��������.�����Ϸ��� �ڵ��߰�
		}
		System.out.println("**" + dan+ "**");
		for(int i=1; i<=9;i++) {
			System.out.printf("%d*%d=%2d\n",dan,i,dan*i);
		}
		return; //����Ÿ���� void�� ��� ��������.�����Ϸ��� �ڵ��߰�
				//����Ÿ���� void�� �޼ҵ带 ����  �� ȣ���� ������ ���� �Ѱ��ٰ��� ���� ��� �ۼ��Ѵ�.
	}
	
	//�Ķ���ͷ� ���޹��� ������ �̿��Ͽ� �������
	//95~100 : 4.5, 90~94:4.0, ... ,60~64:1.0,59~0: 0.0
	//�޼ҵ�� : grade(int s)
	public double grade(double s) {		
		double n;
		
		if(s>=95) {
			n=4.5;
		}else if(s>=90){
			n=4.0;	
		}else if(s>=85){
			n=3.5;	
		}else if(s>=80){
			n=3.0;	
		}else if(s>=75){
			n=2.5;
		}else if(s>=70){
			n=2.0;
		}else if(s>=65){
			n=1.5;
		}else if(s>=60){
			n=1.0;
		}else{
			n=0.0;
		}	
		return n;
	}
}
