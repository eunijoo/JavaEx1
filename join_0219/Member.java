package join_0219;

public class Member {
	private MemberVO[] list; //10명 받을수 있는 방
	private int count;
	
	public Member(){
		list = new MemberVO[10];
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	public MemberVO[] getListData() {
		return list; 
	}
	
	public int append(MemberVO vo) {
		if(count>=list.length)
			return -1;
		
		list[count++] = vo;
		return count;
	}
	
//id검색
	public MemberVO get(String id) {  //id검색
		for(int i=0; i<count;i++) {
			if(list[i].getId().equals(id)) {  //id확인구문
				return list[i];
			}
		}
		return null;
	}
	
}
