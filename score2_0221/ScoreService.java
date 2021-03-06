package score2_0221;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScoreService {
	private Scanner sc=new Scanner(System.in);
	private Score score=new ScoreImp1(); //업캐스팅
	
	public void input() {
		System.out.println("입력...");
		
		try {
			String s;
			int n;
			ScoreVO vo=new ScoreVO();
			
			System.out.println("학번?");
			vo.setHak(sc.next());
			System.out.println("이름?");
			s=inputName();
			vo.setName(s);
			
			System.out.println("국어?");
			n=inputScore();
			vo.setKor(n);
			
			System.out.println("영어?");
			n=inputScore();
			vo.setEng(n);
			
			System.out.println("수학?");
			n=inputScore();
			vo.setMat(n);
			
			if(score.append(vo)>0) {
				System.out.println(" 추가성공");
			}else {
				System.out.println("정원초과로 추가실패.");
			}
		} catch (InputMismatchException e) {
			System.out.println("점수는 숫자만 입력가능합니다.");
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
		System.out.println("\n출력...");
		
		for(int i=0;i<score.getCount();i++) {
			ScoreVO vo=score.getListData()[i];
			System.out.println(vo);
		}
		System.out.println("---------------------\n");
	}
	
	private String inputName() throws KoreanValidException{
		String s=null;
		String regex="^[가-힣]+$";  //^ : 시작, $ : 끝 , \uac00(가 코드값) - \ud7a3(힣 코드값) 
		s=sc.next();
		if(! Pattern.matches(regex, s)) { //매칭안됐나?
			throw new KoreanValidException("이름은 한글만 가능합니다.");
		}
		return s;
	}
	
	private int inputScore() throws ScoreValidException {
		int s=0;
		
		try {
			s=sc.nextInt();
			if(s<0 || s>100) {
				throw new ScoreValidException("점수는 0~100만 가능합니다.");
			}
		} catch (InputMismatchException e) {
			sc.nextLine(); //버린다.
			throw e; //예외를 다시 던짐.
			
		}		
		return s;
	}
}
