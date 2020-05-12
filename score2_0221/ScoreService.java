package score2_0221;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScoreService {
	private Scanner sc=new Scanner(System.in);
	private Score score=new ScoreImp1(); //��ĳ����
	
	public void input() {
		System.out.println("�Է�...");
		
		try {
			String s;
			int n;
			ScoreVO vo=new ScoreVO();
			
			System.out.println("�й�?");
			vo.setHak(sc.next());
			System.out.println("�̸�?");
			s=inputName();
			vo.setName(s);
			
			System.out.println("����?");
			n=inputScore();
			vo.setKor(n);
			
			System.out.println("����?");
			n=inputScore();
			vo.setEng(n);
			
			System.out.println("����?");
			n=inputScore();
			vo.setMat(n);
			
			if(score.append(vo)>0) {
				System.out.println(" �߰�����");
			}else {
				System.out.println("�����ʰ��� �߰�����.");
			}
		} catch (InputMismatchException e) {
			System.out.println("������ ���ڸ� �Է°����մϴ�.");
		} catch(ScoreValidException e) {
			System.out.println(e.getMessage());
		} catch(KoreanValidException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("-----------------\n");
	}
	
	public void print() {
		System.out.println("\n���...");
		
		for(int i=0;i<score.getCount();i++) {
			ScoreVO vo=score.getListData()[i];
			System.out.println(vo);
		}
		System.out.println("---------------------\n");
	}
	
	private String inputName() throws KoreanValidException{
		String s=null;
		String regex="^[��-�R]+$";  //^ : ����, $ : �� , \uac00(�� �ڵ尪) - \ud7a3(�R �ڵ尪) 
		s=sc.next();
		if(! Pattern.matches(regex, s)) { //��Ī�ȵƳ�?
			throw new KoreanValidException("�̸��� �ѱ۸� �����մϴ�.");
		}
		return s;
	}
	
	private int inputScore() throws ScoreValidException {
		int s=0;
		
		try {
			s=sc.nextInt();
			if(s<0 || s>100) {
				throw new ScoreValidException("������ 0~100�� �����մϴ�.");
			}
		} catch (InputMismatchException e) {
			sc.nextLine(); //������.
			throw e; //���ܸ� �ٽ� ����.
			
		}		
		return s;
	}
}
