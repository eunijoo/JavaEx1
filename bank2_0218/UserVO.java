package bank2_0218;

public class UserVO {  //고객들의 정보를 입력하는 클래스
/*
 *전화번호
 *계좌번호
 *잔액
 */
	private String name;
	private String tel;
	private String account;
	private int money;
	
//겟터셋터로 불러옴
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	public String toString() {
		return "UserVO [name=" + name + ", tel=" + tel + ", account=" + account + ", money=" + money + "]";
	}
}
