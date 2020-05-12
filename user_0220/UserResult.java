package user_0220;

public class UserResult {
	private User user;
	
	public UserResult(User user) {
		this.user=user;
	}
	//private User user=new User();
	
	public void write() {	
		System.out.println("\n������ ���...");
		
		UserVO[] list =user.getDataList(); //����Ʈ �Ѿ��
		
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
		return age>=19?"����":"�̼�����";			
	}
}




