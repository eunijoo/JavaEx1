
public class Ex002_Array {
	public static void main(String[] args) {
/*
		�迭 : ���� for ����
*/
		int []score = new int[5];
		score[0]=85; score[1]=60; score[2]=70; score[3]=90; score[4]=60;
		
		int tot=0, ave;
		for(int n : score) {
			tot+=n;
		}
		ave = tot/score.length;
		
		System.out.println("�� : " + tot);
		System.out.println("��� : " + ave);
	}
}
