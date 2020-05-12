package score1_0212;

import java.util.Scanner;

public class ScoreService {
	private Scanner sc=new Scanner(System.in); //�ν��Ͻ���������//�� Ŭ���������� ���ſ��� private
	private ScoreVO[] list =new ScoreVO[50]; //������ 50�� ����. //�迭�� �ּҰ� ���� null
	private int cnt; //������ ���ڴϱ� 0���� �ʱ�ȭ
	private Score score=new Score();
	
//�������Է�
	public void input() {
		if(cnt>=2) {
			System.out.println("�Է� �ʰ�...");
			return;
		}
		
		System.out.println("������ �Է�...");
		String[] subject = {"����?", "����?","����?"};
		
		ScoreVO vo=new ScoreVO();   //�ʵ忡�� �����ϸ� �ȵ� (�ʵ忡�� �����ϸ� �ѹ��ۿ��� ����ȵ�)
		//list[cnt]=new ScoreVO();  //���� ������ ����.
		//������������ input������ �ּҰ� ������µ� �Ʒ��� list[cnt]=vo; ������ vo�� list�� �����ϰ�,������ٰ� �ٽ� ������.  
				
		System.out.println("�й�? ");
		vo.hak=sc.next();
		
		System.out.println("�̸�? ");
		vo.name=sc.next();
				
		for(int i=0; i<vo.score.length;i++) {//vo.score.length : 3 
			System.out.println(subject[i]);
			vo.score[i]=sc.nextInt();
		}	
		
		vo.tot=score.getTot(vo.score);
		list[cnt]=vo;//�������� vo�� list�� �����߱� ������ vo�ε������� ���� �����.
		cnt++;//���� if������ �Է�Ƚ������ ����.
	}
	
//���������
	public void print() {
		System.out.println("������ ���...");
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���\t����");
		for(int i=0;i<cnt;i++) {
			System.out.print(list[i].hak+"\t");
			System.out.print(list[i].name+"\t");
			
			for(int j=0; j<list[i].score.length;j++) {
				System.out.print(list[i].score[j]+"\t");				
			}
			
			System.out.print(list[i].tot+"\t");
			//System.out.print((list[i].tot/3)+"\t");
			System.out.print(score.getAve(list[i].score)+"\t");
			System.out.print(list[i].rank+"\n");		
		}
		System.out.println();
	}
	
//�̸� �˻�	
	public void findByName() {
		System.out.println("�̸� �˻�..."); 
		System.out.println("�˻��� �̸�? ");
		String name = sc.next();
		
		for(int i=0; i<cnt;i++) {
			//if(name.equals(list[i].name)) {
			if(list[i].name.startsWith(name)) { //�̸��� �պκи� �˻�
				System.out.print(list[i].hak+"\t");
				System.out.print(list[i].name+"\t");
				System.out.print(list[i].tot+"\n");
			}
		}
		System.out.println();
	}
	
//�����ͻ���
	public void delete() {
		System.out.println("������ ����");
		
		boolean b= false;
		System.out.println("������ �й�?");
		String hak =sc.next();
		
		for(int i=0;i<cnt;i++) {
			if(hak.contentEquals(list[i].hak)) {  //�˻�
				for(int j=i;j<cnt;j++) {
					list[j]=list[j+1];  //�ε������� ������ ��ĭ�� ���ܿ�
				}
				list[--cnt]=null; //��ĭ�� ������ ���ܼ� �ǵڿ� �ε����� null���� �༭ �ο����� ����.(1�����)
				b=true; //�������� true
				break;
			}
		}
		if(!b) {  //b�� false�϶�
			System.out.println("��ϵ� �ڷᰡ �ƴմϴ�.");
		}else {
			System.out.println("�����Ǿ����ϴ�.\n");
		}
	}
}
