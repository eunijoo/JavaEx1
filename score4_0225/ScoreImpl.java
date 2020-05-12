package score4_0225;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class ScoreImpl implements Score{
	private Scanner sc=new Scanner(System.in);
	//HashMap : 동시성 지원 안함.	
	private Map<String,ScoreVO>map =new HashMap<>();
	
	//HashTable :  동시성 지원(멀티스레드에서 안전).속도 느림.
	//private Map<String,ScoreVO> map=new Hashtable<>();
	
	//TreeMap : 키로 정렬. 단, 키를 나타내는 클래스는 Comparable 인터페이스가 구현되어 있어야함.//동시성 지원한함.
	//private Map<String,ScoreVO> map=new TreeMap<>();
	
	
	@Override
	public void input() {
		System.out.println("\n자료입력..");
		
		String hak;
		System.out.println("학번?");
		hak =sc.next();
		
		if(map.containsKey(hak)) {
			System.out.println("등록한 학번입니다. \n");
			return;
		}
		
		
		try {
			ScoreVO vo=new ScoreVO();
			
			System.out.println("이름?");
			vo.setName(sc.next());
			
			
			System.out.println("국어?");
			vo.setKor(sc.nextInt());
			
			System.out.println("영어?");
			vo.setEng(sc.nextInt());
			
			System.out.println("수학?");
			vo.setMat(sc.nextInt());
			
			map.put(hak, vo); //map에 저장
			System.out.println("수정완료");
			
		} catch (InputMismatchException e) {
			System.out.print(" 점수는 숫자만 가능합니다.\n");
			sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void print() {
		System.out.println("\n자료출력..");
		
		System.out.println("인원수 : "+map.size());
	//	Iterator<String> it = map.keySet().iterator();
		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		
		while(it.hasNext()) {
			String hak=it.next();
			ScoreVO vo=map.get(hak);
			
			System.out.print(hak+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMat()+"\t");
			System.out.print(vo.getTot()+"\n");
		}		
		System.out.println();
	}

	@Override
	public void update() {
		System.out.println("\n자료수정..");
		String hak;
		System.out.println("수정할 학번?");
		hak =sc.next();
		
		ScoreVO vo=map.get(hak);  //Key : 학번 
		
		if(vo==null) {
			System.out.println("등록한 학번입니다. \n");
			return;
		}
		try {		
			System.out.println("이름?");
			vo.setName(sc.next());
				
			System.out.println("국어?");
			vo.setKor(sc.nextInt());
			
			System.out.println("영어?");
			vo.setEng(sc.nextInt());
			
			System.out.println("수학?");
			vo.setMat(sc.nextInt());
			
			System.out.println("수정완료");
			
		} catch (InputMismatchException e) {
			System.out.print(" 점수는 숫자만 가능합니다.\n");
			sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}		

	@Override
	public void delete() {
		System.out.println("\n자료삭제..");
		String hak;
		System.out.println("삭제할 학번?");
		hak =sc.next();
		
		ScoreVO vo=map.remove(hak);
		if(vo==null) {
			System.out.println("등록된 자료가 아닙니다.\n");
			return;
		}
		System.out.println(vo.getName()+"씨 자료가 삭제되었습니다.\n");  //삭제가 되었으면 지운걸 리턴,삭제가 안됐으면 if문 들어감.

	}
	
	@Override
	public void findByHak() {
		System.out.println("\n학번검색..");
	
		String hak;
		System.out.println("검색할 학번?");
		hak =sc.next();
		
		ScoreVO vo=map.get(hak);  //Key : 학번 
		
		if(vo==null) {
			System.out.println("등록하지 않은 학번입니다. \n");
			return;
		}
		System.out.println(hak+"\t");
		System.out.print(vo.getName()+"\t");
		System.out.print(vo.getKor()+"\t");
		System.out.print(vo.getEng()+"\t");
		System.out.print(vo.getMat()+"\t");
		System.out.print(vo.getTot()+"\t");
		System.out.println();
	}
		
		
	

	@Override
	public void findByName() {
		System.out.println("\n이름검색..");
	//이름 어느글자를 쓰던 찾는거	
		String name;
		System.out.println("검색할 이름?");
		name=sc.next();
//전체한바퀴 돌음.		
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()) {
			String hak=it.next();
			ScoreVO vo=map.get(hak);
			
			if(vo.getName().indexOf(name)>=0) { //인덱스는 0부터 시작이니까 0미만은 없음.
				System.out.print(hak+"\t");
				System.out.print(vo.getName()+"\t");
				System.out.print(vo.getKor()+"\t");
				System.out.print(vo.getEng()+"\t");
				System.out.print(vo.getMat()+"\t");
				System.out.print(vo.getTot()+"\t");
	
			}
		}
		System.out.println();
		
		
	}
}
