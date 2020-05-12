package score3_0224;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;

//�������̽� ����(implements)
public class ScoreImpl implements Score {
	private List<ScoreVO> list = new ArrayList<>();	//List�� ���׸��̿��� <>�ȿ� �������ϰڴ��ؼ� ScoreVO���.
													//ArrayList�� �� ���������� ScoreVO�� �������༭ ScoreVO �ۿ� ����.
	
//	ScoreVO vo=new ScoreVO(); //�ʵ忡�ϸ� �ּҴ� �����ϰ� ���� ��� �ٲ� ������ ���� ���´�.
	private Scanner sc = new Scanner(System.in);
	
//������ �Է�
	@Override
	public void input() {
		System.out.println("\n������ �Է�...");

		try {
			ScoreVO vo=new ScoreVO();

			System.out.println("�й�? ");
			vo.setHak(sc.next());

			if (readScore(vo.getHak()) != null) {
				System.out.println("��ϵ� �й��Դϴ�.");
				return;
			}
			System.out.println("�̸� ? ");
			vo.setName(sc.next());
			System.out.println("���� ? ");
			vo.setKor(sc.nextInt());
			System.out.println("����? ");
			vo.setEng(sc.nextInt());
			System.out.println("����? ");
			vo.setMat(sc.nextInt());

			list.add(vo);//add: �ּҸ� ������ ����.

			System.out.println("��ϿϷ�,,,\n");
		} catch (InputMismatchException e) {
			System.out.println("������ ���ڸ� �Է°���...\n");
			sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
//������ ���
	@Override
	public void print() {
		System.out.println("\n������ ���...");
		int tot;

		for (ScoreVO vo : list) {
			tot = vo.getKor() + vo.getEng() + vo.getMat();

			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() +"\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.println(tot);

		}
		System.out.println();

	}
//�й��˻�
	@Override
	public void findByHak() {
		System.out.println("\n�й��˻�...");
		String hak;
		System.out.println("�˻��� �й�?");
		hak=sc.next();
		
		ScoreVO vo=readScore(hak);
		
		if(vo==null) {
			System.out.println("��ϵ��й��� �ƴմϴ�.\n");
			return;
		}
		int tot = vo.getKor() + vo.getEng() + vo.getMat();
		System.out.print(vo.getHak() + "\t");
		System.out.print(vo.getName() +"\t");
		System.out.print(vo.getKor() + "\t");
		System.out.print(vo.getEng() + "\t");
		System.out.print(vo.getMat() + "\t");
		System.out.println(tot);
		
		System.out.println();
		}

//�̸��˻�	
	@Override
	public void findByName() {
		System.out.println("\n�̸� �˻�...");
		String name;
		int tot;
		
		System.out.println("�˻��� �̸�?");
		name=sc.next();
		
		for (ScoreVO vo : list) {
			if(vo.getName().startsWith(name)) {
			tot = vo.getKor() + vo.getEng() + vo.getMat();

			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() +"\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.println(tot);
			}
		}
		System.out.println();		
	}
//������ ����
	@Override
	public void updata() {
		System.out.println("\n������ ����...");
		String hak;
		System.out.println("������ �й�");
		hak = sc.next();
	//����Ǿ��ִ� �� �ּҿ����� ���� �ҷ��� ���� ����.(�Ʒ� readScore�� ���� �й���)	
		ScoreVO vo=readScore(hak);  //readScore���� ��ġ�ϴ� �й��� �ּҸ� ������ ���ƿ�.
		if(vo==null) {				//vo�� �ּҸ� ������ ��.
			System.out.print("��ϵ� �й��� �ƴմϴ�.\n");
			return;
		}
		
		try {
			System.out.print("�̸�?");
			vo.setName(sc.next()); 	//������ �ּҿ� �ٽ� �̸� �Է��ؼ� ����.
			
			System.out.print("����");
			vo.setKor(sc.nextInt());	//������ �ּҿ� �ٽ� ���� ���� �Է��ؼ� ����.
			
			System.out.print("����");
			vo.setEng(sc.nextInt());
			
			System.out.print("����");
			vo.setMat(sc.nextInt());
			
			System.out.print("������ ���� �Ϸ�...\n");
			
		} catch (InputMismatchException e) {
			System.out.print(" ������ ���ڸ� �����մϴ�.\n");
			sc.nextLine();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
//������ ����
	@Override
	public void remove() {
		System.out.println("\n������ ����...");

		String hak;
		System.out.println("������ �й�");
		hak = sc.next();
		
		ScoreVO vo=readScore(hak); 
		if(vo==null){
			System.out.println("��ϵ� �й��� �ƴմϴ�.\n");
			return;
		}
		list.remove(vo);
		System.out.println("�����ͻ��� �Ϸ�...");

	}

//������ �˻�	
	private ScoreVO readScore(String hak) {
		ScoreVO vo = null;
		for (ScoreVO v : list) { //vo:�ּҰ� //  �ּҰ��� �����ͼ� �й� ��.
			if (v.getHak().equals(hak)) {
				return v;  
			}
		}
		return vo;  //�й� ���ؼ� ��ġ�ϴ� �ּҸ� ȣ���� ������ �ٽ� ��������
	}

}
