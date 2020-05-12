package user_0220;
//����뵵
public class User {
	private UserVO[] list;  //list �ʱⰪ=> null  //list : �Ѹ� �߰��Ұ� /�ܺ����ٺҰ�
	private int count; //count �ʱⰪ => 0  //count : �ο��� => �����Ͱ� �߰��ɶ��� �þ����.�׷��� �ܺ����ٸ��ϰ���
	
	public User() { //User : ������
	//	list = new UserVO[10];  //�ؿ� �޽���� ��
		allocation(10);
	}

	
	private void allocation(int capacity) { //allocation(10)������ ����
		UserVO[] temp= new UserVO[capacity]; 	//temp�� �� ����
		if(list!=null && count >0) {
			System.arraycopy(list, 0, temp, 0, count);
		}
		list = temp;		
	}
		
	public int getCount() {
		return count; //�ܺο� ����־���� ��
	}
	
//append�� list�� �����͸� �������� ����	
	public int append(UserVO vo) { 
		if(count >= list.length) {
			allocation(list.length+10); //�迭�� �� ���� 10���� �ø���
		}
		list[count++] =vo;
		return count;
	}
	
	public UserVO[] getDataList() {
		return list;
	}
	
//�ش� �ε����� UserVO ��ü ��ȯ (��ü: null)
	public UserVO get(int idx) {
		if(idx>=count || idx <0) {
			return null;
		}
		
		return list[idx]; 
	}
}
