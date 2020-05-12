package score2_0221;

public class ScoreVO {
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	@Override
	public String toString() {  //toString 호출하면 출력하게
		String s;
		int tot;
		
		if(hak==null || name==null) return null;
		
		tot=kor+eng+mat;
		
		s=hak+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot;
				
		return s;
	}
	
}