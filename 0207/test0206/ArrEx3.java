package test0206;

public class ArrEx3 {

	public static void main(String[] args) { //String[] : �Ű�����
		int []score=new int[5];// score: �迭����(����������x) //new:�޸���� ������
		int tot,ave;  //tot : ������ ����  //÷��([]�ȿ� ���� ��)������ long���� ������.
		//�迭�� �����ϱ� ���� ÷��([]�ȿ� ���� ��)�� int���� ���(char,byte,short�� ����.)
		//���� �ּ� �ϳ��� �˰������� ��,
		//System.out.println(score); //�迭�ּ�(�ؽ��ڵ�)
		score[0]=60;score[1]=60;score[2]=60;//[0][1][2][3]�̷��� ÷�ڶ�� ��.
		score[3]=60;score[4]=60; //÷�ھȿ� ������ ���� �ȵ�(��Ÿ�ӿ���)
		
		tot=0;
		for(int i=0;i<score.length;i++) {
			tot += score[i];
		
		ave=tot/score.length;
		
		System.out.println("��:"+tot);
		System.out.println("���:"+ave);		
	}

	}
} 

