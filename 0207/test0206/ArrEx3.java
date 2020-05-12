package test0206;

public class ArrEx3 {

	public static void main(String[] args) { //String[] : 매개변수
		int []score=new int[5];// score: 배열변수(정수형변수x) //new:메모리잡는 연산자
		int tot,ave;  //tot : 정수형 변수  //첨자([]안에 들어가는 것)선언은 long형은 사용못함.
		//배열에 접근하기 위한 첨자([]안에 들어가는 것)는 int형을 사용(char,byte,short도 가능.)
		//시작 주소 하나만 알고있으면 됨,
		//System.out.println(score); //배열주소(해쉬코드)
		score[0]=60;score[1]=60;score[2]=60;//[0][1][2][3]이런걸 첨자라고 함.
		score[3]=60;score[4]=60; //첨자안에 음수는 쓰면 안됨(런타임오류)
		
		tot=0;
		for(int i=0;i<score.length;i++) {
			tot += score[i];
		
		ave=tot/score.length;
		
		System.out.println("합:"+tot);
		System.out.println("평균:"+ave);		
	}

	}
} 

