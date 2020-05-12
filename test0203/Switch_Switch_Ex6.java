package test0203;

public class Switch_Switch_Ex6 {
	public static void main(String[] args) {
		int a = 12;

		switch (a % 2) {
		case 0:
			System.out.println("2의 배수"); // break를 쓰면 아래 switch를 아예 필요가 없어져서 오류.
			switch (a % 3) {
			case 0:
				System.out.println("3의배수");
				break;
			case 1:
			case 2:
				System.out.println("3의 배수아님");
				break; // switch구문의 마지막문장이여서 마지막 break는 의미없음.
			}
			break;
		case 1:
			System.out.println("2의배수아님");
			switch (a % 3) {
			case 0:
				System.out.println("3의배수");
				break;
			case 1:
			case 2:
				System.out.println("3의 배수아님");
				break;// 안의 switch문을 빠져나옴
			}
			break;// 밖 switch구문을 빠져나옴.
		}

	}
}