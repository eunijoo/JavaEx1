package score2_0221;

//�������̽� �κ����� ��ȹ«
public interface Score {
	public int getCount();
	public int append(ScoreVO vo);
	public ScoreVO[] getListData();
	public ScoreVO get(String hak);
}

