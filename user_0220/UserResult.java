package user_0220;

public class UserResult {
	private User user;
	
	public UserResult(User user) {
		this.user=user;
	}
	//private User user=new User();
	
	public void write() {	
		System.out.println("\n데이터 출력...");
		
		UserVO[] list =user.getDataList(); //리스트 넘어옴
		
		int cnt =user.getCount();
		
		for(int i=0;i<cnt;i++) {
			UserVO vo=list[i];
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAge()+"\t");
			System.out.print(adult(vo.getAge())+"\n");
		}
		System.out.println();
	}
	
	public String adult(int age) {
		return age>=19?"성인":"미성년자";			
	}
}




