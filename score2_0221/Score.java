package score2_0221;

//인터페이스 부분으로 계획짬
public interface Score {
	public int getCount();
	public int append(ScoreVO vo);
	public ScoreVO[] getListData();
	public ScoreVO get(String hak);
}

