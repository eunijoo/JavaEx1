package score2_0221;
//이러한 메소드들을 만들거다.
public class ScoreImp1 implements Score{
	private int count;
	private ScoreVO[] list=new ScoreVO[10];

	@Override
	public int getCount() {
		
		return count;
	}

	@Override
	public int append(ScoreVO vo) { //데이터 추가하려는 부분
		if(count>=10)
			return -1;
		
		list[count++] =vo;
		
		return count;
	}

	@Override
	public ScoreVO[] getListData() {
		
		return list;
	}

	@Override
	public ScoreVO get(String hak) {
		for(int i=0;i<count;i++) {
			//학번검색
			if(list[i].getHak().equals(hak)) {
				return list[i];
			}
		}
		return null;
	}
}
