import java.util.Scanner;

public class Ex005_Deviation {
	public static void main(String[] args) {
/*		
		5���� �̸��� ������ �Է� �޾� ����(��-���)�� ����Ͽ� ����ϰ�,
		�������� ���հ� ����� ����ϴ� ���α׷�
*/
		Scanner sc=new Scanner(System.in);
		String[] name=new String[5];
		int []score=new int[5];
		int tot=0;
		double ave, s;

		for(int i=0; i<name.length; i++) {
			System.out.print((i+1)+"��° �̸� ? ");
			name[i] = sc.nextLine();
			System.out.print("      ���� ? ");
			score[i] = sc.nextInt();
			sc.nextLine();
			
			tot+=score[i];
		}
		
		ave = (double)tot/score.length;
		System.out.println("\n�̸�\t����\t����");
		System.out.println("--------------------");
		for(int i=0; i<name.length; i++) {
			s=score[i] - ave;
			System.out.println(name[i]+"\t"+score[i]+"\t"+s);
		}
		System.out.println("--------------------");
		System.out.println("���� : "+tot);
		System.out.println("--------------------");
		System.out.println("��� : "+ave);
		
		sc.close();
	}
}
