package join_0219;

//id�� �����ϸ� ����������� ���

public class MemberVO {

	private String id;
	private String pwd;
	private String name;
	private String birth;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
//overriding		
	@Override
	public String toString() {
		String s;
		if(id==null) {
			return null;
		}
		s=id+"\t"+name+"\t"+birth;
		return s;
	}
	
	
	
	
	
	
	
}


