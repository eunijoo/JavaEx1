package test0219;

public class InheritanceEx5 {
	public static void main(String[] args) {
		
	Rect rr=new Rect(10,5);
	
	rr.rectArea();
	rr.rectLen();

	rr.write("�簢��");
	
	}
}

class Test5{  //�ƹ��� Ŭ����
	protected double area;
	protected double len;
	
	public void write(String title) {
		System.out.println(title+"���� : "+area+"�ѷ� : "+len);
	}
}
class Circle extends Test5{
	private int r;
	
	public void set(int r) {
		this.r=r;
	}
	
	public void circleArea() {
		area=r*r*Math.PI;
	}
	
	public void circleLen() {
		len=r*2*Math.PI;
	}
}

class Rect extends Test5{  //Test5�� ���
  	private int width;
	private int height;
	
	public Rect() {
		
	}
	
	public Rect(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	public void rectArea() {
		area=width*height;
	}
	
	public void rectLen() {
		len=(width+height)*2;
	}
	
//getter,setter�ҷ���	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}	


