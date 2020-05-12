package user_0220;
//저장용도
public class User {
	private UserVO[] list;  //list 초기값=> null  //list : 한명씩 추가할거 /외부접근불가
	private int count; //count 초기값 => 0  //count : 인원수 => 데이터가 추가될때만 늘어나야함.그래서 외부접근못하게함
	
	public User() { //User : 생성자
	//	list = new UserVO[10];  //밑에 메스드로 뺌
		allocation(10);
	}

	
	private void allocation(int capacity) { //allocation(10)가지고 들어옴
		UserVO[] temp= new UserVO[capacity]; 	//temp에 방 생성
		if(list!=null && count >0) {
			System.arraycopy(list, 0, temp, 0, count);
		}
		list = temp;		
	}
		
	public int getCount() {
		return count; //외부에 몇명있어요라는 뜻
	}
	
//append는 list에 데이터를 담으려고 만듬	
	public int append(UserVO vo) { 
		if(count >= list.length) {
			allocation(list.length+10); //배열이 다 차면 10개씩 늘리기
		}
		list[count++] =vo;
		return count;
	}
	
	public UserVO[] getDataList() {
		return list;
	}
	
//해당 인덱스의 UserVO 객체 변환 (객체: null)
	public UserVO get(int idx) {
		if(idx>=count || idx <0) {
			return null;
		}
		
		return list[idx]; 
	}
}
