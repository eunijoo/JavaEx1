package test0204;
import java.util.Scanner;
public class HapEx {
//���ϴ� ��ȣ�� �Է¹޾� �� ���
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num,s;
		int ch;
		int start,offset;
		
		while(true) { //���ѷ����Ϸ��� ���ǿ� true�� ��.
			do {
				System.out.println("1.��ü ��  2.Ȧ����  3.¦����  4.���� =>");
				ch=sc.nextInt();
			}while(ch<1||ch>4);
			
			if(ch==4)break; // 4�� �Ǹ� while(true) ���� ��������.
			
			System.out.println("���ϴ� ��?");
			num=sc.nextInt();
			
			switch(ch) {
			case 1: start=1; offset=1; break; //�ڿ�����
			case 2: start=1; offset=2; break; //Ȧ����
			default: start=2; offset=2; break; //¦����
			}
			
			s=0;
			for(int i=start; i<=num;i+=offset) {  //�ձ��ϴ� ��
				s+=i;
			}
			/*�ձ��ϴ±����� �����ϰ� �ϱ����� ���ϴ� ���� �ٲ�� �κи� ������ �༭ ���� ���Ҽ� �ְ� ����.
			  (���� switch������ �������� ��)
			  	s=0;
				for(int i=1; i<=num;i+=1) {  //�ڿ��� ��ü��
					s+=i;
				}
				for(int i=1; i<=num;i+=2) {  //Ȧ����
					s+=i;
				}
				for(int i=2; i<=num;i+=2) {  //¦����
					s+=i;
				}
			 */
			System.out.println("��� : "+s);
		}	
		sc.close();
	}
}


