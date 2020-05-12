package bank2_0218;

public class User {	//고객정보를 관리하는 데이터베이스
	
	//배열로 10명 저장할거임
	private UserVO[] list; 	//고객정보보호로 private
							//선언안하면 값은 null(주소값을 가지고 있지 않음) //list : 주소값을 담음
	private int count; 		//배열이 얼마나 채워져있는지
	
	
	public int getCount() {
		return count;
	}
	
	public User(){		 //생성과 동시에 초기화가됨
		list =new UserVO[10];
		count=0;

	}

	public UserVO[] getList() {
		return list;
	}
	
//UserVO객체를 배열에 추가하는 메서드	
	public void append(UserVO vo) { //(UserVO vo) : 매개변수로 호출해오는
		//10명 벗어나면안되니깐
		if(count>=10) {
			System.out.println("고객정보 초과");
		}
		list[count]=vo;	 // 인원수
		count++;
	}
	
	
	
}