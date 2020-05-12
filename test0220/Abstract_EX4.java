package test0220;

public class Abstract_EX4 {
	public static void main(String[] args) {
		int[] nn= {25,10,5,89,70,55};
		
//		SortInt ss= new BubbleSort();  //����
//		SortInt aa=new SortInt; //�Ŀ���. �߻�Ŭ������ ��ü���� �Ұ�
		SortInt ss=new SelectionSort();
		System.out.println("source data : ");
		for(int n:nn) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		ss.sort(nn);
		
		System.out.println("sort data : ");
		for(int n:nn) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
}

//�߻�Ŭ����(class�� �տ� abstract�� ���̸� �߻�Ŭ������ �ȴ�)
abstract class SortInt{	//�߻�޼ҵ������ SortInt���Ұ�
	private int[] value;
	protected abstract void sorting(); //�߻�޼ҵ� //{ }�� ����. �������� �ʾҴ�. ����ٸ���.������ ����.
										//( )�� �־ �޼ҵ尡 �ȴ�. { }�� ������ �ڽ��� ����������.
	public void sort(int[] value) {
		this.value = value;
		sorting();
	}
	
	protected int length() {
		return value == null ? -1 : value.length;
	}
	
	protected final int compare(int i,int j) {
		return value[i] - value[j];
	}
	
	protected void swap(int i, int j) {
		int t=value[i];
		value[i]=value[j];
		value[j]=t;
	}
}
//�߻�Ŭ������ ��ӹ��� Ŭ������ �߻�Ŭ������ �ƴϸ� �ݵ�� ��� �߻�޼ҵ带 �������ؾ��Ѵ�.(�ڽ��� ������ ���ϸ� �ȵȴ�)

//��������
class SelectionSort extends SortInt{

	@Override
	protected void sorting() { //������(overriding)��
	//�߻��� ���� �ƴ°� �� �߿��ϴ�
		for(int i=0; i<length()-1;i++) {
			for(int j=i+1; j<length(); j++) {
				if(compare(i,j)>0) {
					swap(i,j);
				}
			}
		}
		
	}
	
}
//��������
class BubbleSort extends SortInt{

	@Override
	protected void sorting() {  //������(overriding)��
		int pass=1;
		boolean flag;
		
		do {
			flag =false;
			for(int i=0;i<length()-pass;i++) {
				if(compare(i, i+1)>0) {
					swap(i,i+1);
					flag=true;
				}
			}
			pass++;
		}while(flag);
		
	}
	
	
}