package score3_0224;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;

//인터페이스 구현(implements)
public class ScoreImpl implements Score {
	private List<ScoreVO> list = new ArrayList<>();	//List는 제네릭이여서 <>안에 저장을하겠다해서 ScoreVO사용.
													//ArrayList는 다 쓸수있지만 ScoreVO를 저장해줘서 ScoreVO 밖에 못씀.
	
//	ScoreVO vo=new ScoreVO(); //필드에하면 주소는 동일하고 값만 계속 바뀌어서 동일한 값이 나온다.
	private Scanner sc = new Scanner(System.in);
	
//데이터 입력
	@Override
	public void input() {
		System.out.println("\n데이터 입력...");

		try {
			ScoreVO vo=new ScoreVO();

			System.out.println("학번? ");
			vo.setHak(sc.next());

			if (readScore(vo.getHak()) != null) {
				System.out.println("등록된 학번입니다.");
				return;
			}
			System.out.println("이름 ? ");
			vo.setName(sc.next());
			System.out.println("국어 ? ");
			vo.setKor(sc.nextInt());
			System.out.println("영어? ");
			vo.setEng(sc.nextInt());
			System.out.println("수학? ");
			vo.setMat(sc.nextInt());

			list.add(vo);//add: 주소를 가지고 들어가라.

			System.out.println("등록완료,,,\n");
		} catch (InputMismatchException e) {
			System.out.println("점수는 숫자만 입력가능...\n");
			sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
//데이터 출력
	@Override
	public void print() {
		System.out.println("\n데이터 출력...");
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
//학번검색
	@Override
	public void findByHak() {
		System.out.println("\n학번검색...");
		String hak;
		System.out.println("검색할 학번?");
		hak=sc.next();
		
		ScoreVO vo=readScore(hak);
		
		if(vo==null) {
			System.out.println("등록된학번이 아닙니다.\n");
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

//이름검색	
	@Override
	public void findByName() {
		System.out.println("\n이름 검색...");
		String name;
		int tot;
		
		System.out.println("검색할 이름?");
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
//데이터 수정
	@Override
	public void updata() {
		System.out.println("\n데이터 수정...");
		String hak;
		System.out.println("수정할 학번");
		hak = sc.next();
	//저장되어있는 그 주소에가서 값을 불러와 값을 변경.(아래 readScore에 가서 학번비교)	
		ScoreVO vo=readScore(hak);  //readScore에서 일치하는 학번의 주소를 가지고 돌아옴.
		if(vo==null) {				//vo는 주소를 가지고 옴.
			System.out.print("등록된 학번이 아닙니다.\n");
			return;
		}
		
		try {
			System.out.print("이름?");
			vo.setName(sc.next()); 	//가져온 주소에 다시 이름 입력해서 저장.
			
			System.out.print("국어");
			vo.setKor(sc.nextInt());	//가져온 주소에 다시 국어 점수 입력해서 저장.
			
			System.out.print("영어");
			vo.setEng(sc.nextInt());
			
			System.out.print("수학");
			vo.setMat(sc.nextInt());
			
			System.out.print("데이터 수정 완료...\n");
			
		} catch (InputMismatchException e) {
			System.out.print(" 점수는 숫자만 가능합니다.\n");
			sc.nextLine();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
//데이터 삭제
	@Override
	public void remove() {
		System.out.println("\n데이터 삭제...");

		String hak;
		System.out.println("삭제할 학번");
		hak = sc.next();
		
		ScoreVO vo=readScore(hak); 
		if(vo==null){
			System.out.println("등록된 학번이 아닙니다.\n");
			return;
		}
		list.remove(vo);
		System.out.println("데이터삭제 완료...");

	}

//데이터 검색	
	private ScoreVO readScore(String hak) {
		ScoreVO vo = null;
		for (ScoreVO v : list) { //vo:주소값 //  주소값을 가져와서 학번 비교.
			if (v.getHak().equals(hak)) {
				return v;  
			}
		}
		return vo;  //학번 비교해서 일치하는 주소를 호출한 곳으로 다시 돌려보냄
	}

}
