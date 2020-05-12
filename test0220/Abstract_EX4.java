package test0220;

public class Abstract_EX4 {
	public static void main(String[] args) {
		int[] nn= {25,10,5,89,70,55};
		
//		SortInt ss= new BubbleSort();  //가능
//		SortInt aa=new SortInt; //컴오류. 추상클래스는 객체생성 불가
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

//추상클래스(class명 앞에 abstract를 붙이면 추상클래스가 된다)
abstract class SortInt{	//추상메소드없으면 SortInt사용불가
	private int[] value;
	protected abstract void sorting(); //추상메소드 //{ }가 없다. 정의하지 않았다. 만들다말음.공간만 제공.
										//( )만 있어도 메소드가 된다. { }가 있으면 자식을 가질수없다.
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
//추상클래스를 상속받은 클래스가 추상클래스가 아니면 반드시 모든 추상메소드를 재정의해야한다.(자식은 재정의 안하면 안된다)

//선택정렬
class SelectionSort extends SortInt{

	@Override
	protected void sorting() { //재정의(overriding)함
	//추상이 뭔지 아는게 더 중요하다
		for(int i=0; i<length()-1;i++) {
			for(int j=i+1; j<length(); j++) {
				if(compare(i,j)>0) {
					swap(i,j);
				}
			}
		}
		
	}
	
}
//버블정렬
class BubbleSort extends SortInt{

	@Override
	protected void sorting() {  //재정의(overriding)함
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