package join_0219;

public class MemberResult {
	
	private Member member;  //���ο� �����ü�� ������
	
	public MemberResult(Member member) {
		this.member=member;
	}
	
	public void write() {
		MemberVO[] list=member.getListData();
		for(int i=0;i<member.getCount();i++) {
			MemberVO vo=list[i];
			//MemberVO vo=member.getListData()[i];
			System.out.println(vo);
		}
		System.out.println();		
	}
}