package score2_0221;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScoreService {
	private Scanner sc=new Scanner(System.in);
	private Score score=new ScoreImp1(); //¾÷Ä³½ºÆÃ
	
	public void input() {
		System.out.println("ÀÔ·Â...");
		
		try {
			String s;
			int n;
			ScoreVO vo=new ScoreVO();
			
			System.out.println("ÇÐ¹ø?");
			vo.setHak(sc.next());
			System.out.println("ÀÌ¸§?");
			s=inputName();
			vo.setName(s);
			
			System.out.println("±¹¾î?");
			n=inputScore();
			vo.setKor(n);
			
			System.out.println("¿µ¾î?");
			n=inputScore();
			vo.setEng(n);
			
			System.out.println("¼öÇÐ?");
			n=inputScore();
			vo.setMat(n);
			
			if(score.append(vo)>0) {
				System.out.println(" Ãß°¡¼º°ø");
			}else {
				System.out.println("Á¤¿øÃÊ°ú·Î Ãß°¡½ÇÆÐ.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Á¡¼ö´Â ¼ýÀÚ¸¸ ÀÔ·Â°¡´ÉÇÕ´Ï´Ù.");
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
		System.out.println("\nÃâ·Â...");
		
		for(int i=0;i<score.getCount();i++) {
			ScoreVO vo=score.getListData()[i];
			System.out.println(vo);
		}
		System.out.println("---------------------\n");
	}
	
	private String inputName() throws KoreanValidException{
		String s=null;
		String regex="^[°¡-ÆR]+$";  //^ : ½ÃÀÛ, $ : ³¡ , \uac00(°¡ ÄÚµå°ª) - \ud7a3(ÆR ÄÚµå°ª) 
		s=sc.next();
		if(! Pattern.matches(regex, s)) { //¸ÅÄª¾ÈµÆ³ª?
			throw new KoreanValidException("ÀÌ¸§Àº ÇÑ±Û¸¸ °¡´ÉÇÕ´Ï´Ù.");
		}
		return s;
	}
	
	private int inputScore() throws ScoreValidException {
		int s=0;
		
		try {
			s=sc.nextInt();
			if(s<0 || s>100) {
				throw new ScoreValidException("Á¡¼ö´Â 0~100¸¸ °¡´ÉÇÕ´Ï´Ù.");
			}
		} catch (InputMismatchException e) {
			sc.nextLine(); //¹ö¸°´Ù.
			throw e; //¿¹¿Ü¸¦ ´Ù½Ã ´øÁü.
			
		}		
		return s;
	}
}
