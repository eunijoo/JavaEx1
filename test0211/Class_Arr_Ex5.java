package test0211;

public class Class_Arr_Ex5 {  
	public static void main(String[] args) { //Ŭ�������� (static)
		//��ü �迭 
		Test5[] tt=new Test5[5];
		//Test5 t1,t2,t3,t4,t5;�� ���� //Test5��ü�� �����Ҽ��ִ� 5�� �����϶�� ��.
		//tt[2].print();//��Ÿ�ӿ���
		
		//System.out.println("end...");
		//��ü�� �޸� �Ҵ�
		for(int i=0;i<tt.length;i++) {
			tt[i]=new Test5(); //�����ڸ� �ҷ��� ��ü�� ������.
		}
		tt[0].b=200; 
		tt[0].print(); //10:200
		tt[2].print(); //10:5
	}
}

class Test5{
	int a=10;
	int b=5;
	
	public void print() {
		System.out.println(a+":"+b);
	}
}