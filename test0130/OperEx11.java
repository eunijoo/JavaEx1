package test0130;

public class OperEx11 {

	public static void main(String[] args) {
		int x,y,z;
		boolean t;
		
		x=y=z=1;
		t= ((++x != 0) || (++y != 0) || (++z != 0)); // ||�����ڴ� ��������  true������ ������ ������ ����.(y,z����)
		System.out.println(x+","+y+","+z+","+t); //2,1,1,true

		x=y=z=1;
		t= ((++x != 0) | (++y != 0) | (++z != 0));//��Ʈ�������� boolean�̿��� x,y,z ��� ���� ��
		System.out.println(x+","+y+","+z+","+t); //2,2,2,true
		
		x=y=z=-1;
		t= ((++x != 0) && (++y != 0) && (++z != 0));// &&�����ڴ� �������� false������ ������ ������ ����.(y,z����)
		System.out.println(x+","+y+","+z+","+t); //0,-1,-1,false

		x=y=z=-1;
		t= ((x++ != 0) && (++y != 0) && (++z != 0));// &&�����ڴ� ��������  false������ ������ ������ ����.(y,z����)
		System.out.println(x+","+y+","+z+","+t); //0,0,-1,false
		
		x=y=z=-1;
		t= ((++x != 0) & (++y != 0) & (++z != 0));//��Ʈ�������� boolean�̿��� x,y,z ��� ���� ��
		System.out.println(x+","+y+","+z+","+t); //0,0,0,false
	}

}
