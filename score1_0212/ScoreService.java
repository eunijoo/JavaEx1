package score1_0212;

import java.util.Scanner;

public class ScoreService {
	private Scanner sc=new Scanner(System.in); //인스턴스변수선언//이 클래스에서만 쓸거여서 private
	private ScoreVO[] list =new ScoreVO[50]; //변수만 50개 선언. //배열은 주소가 들어가서 null
	private int cnt; //정수는 숫자니깐 0으로 초기화
	private Score score=new Score();
	
//데이터입력
	public void input() {
		if(cnt>=2) {
			System.out.println("입력 초과...");
			return;
		}
		
		System.out.println("데이터 입력...");
		String[] subject = {"국어?", "영어?","수학?"};
		
		ScoreVO vo=new ScoreVO();   //필드에서 선언하면 안됨 (필드에서 선언하면 한번밖에서 선언안됨)
		//list[cnt]=new ScoreVO();  //위와 구문이 같음.
		//지역변수여서 input나가면 주소가 사라지는데 아래에 list[cnt]=vo; 때문에 vo가 list에 저장하고,사라졌다가 다시 생성됨.  
				
		System.out.println("학번? ");
		vo.hak=sc.next();
		
		System.out.println("이름? ");
		vo.name=sc.next();
				
		for(int i=0; i<vo.score.length;i++) {//vo.score.length : 3 
			System.out.println(subject[i]);
			vo.score[i]=sc.nextInt();
		}	
		
		vo.tot=score.getTot(vo.score);
		list[cnt]=vo;//지역변수 vo를 list에 저장했기 때문에 vo인덱스마다 값이 저장됨.
		cnt++;//위의 if문에서 입력횟수세는 구문.
	}
	
//데이터출력
	public void print() {
		System.out.println("데이터 출력...");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
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
	
//이름 검색	
	public void findByName() {
		System.out.println("이름 검색..."); 
		System.out.println("검색할 이름? ");
		String name = sc.next();
		
		for(int i=0; i<cnt;i++) {
			//if(name.equals(list[i].name)) {
			if(list[i].name.startsWith(name)) { //이름의 앞부분만 검색
				System.out.print(list[i].hak+"\t");
				System.out.print(list[i].name+"\t");
				System.out.print(list[i].tot+"\n");
			}
		}
		System.out.println();
	}
	
//데이터삭제
	public void delete() {
		System.out.println("데이터 삭제");
		
		boolean b= false;
		System.out.println("삭제할 학번?");
		String hak =sc.next();
		
		for(int i=0;i<cnt;i++) {
			if(hak.contentEquals(list[i].hak)) {  //검색
				for(int j=i;j<cnt;j++) {
					list[j]=list[j+1];  //인덱스에서 값들을 한칸씩 땡겨옴
				}
				list[--cnt]=null; //한칸씩 앞으로 땡겨서 맨뒤에 인덱스에 null값을 줘서 인원수를 줄임.(1명삭제)
				b=true; //지웠으면 true
				break;
			}
		}
		if(!b) {  //b가 false일때
			System.out.println("등록된 자료가 아닙니다.");
		}else {
			System.out.println("삭제되었습니다.\n");
		}
	}
}
