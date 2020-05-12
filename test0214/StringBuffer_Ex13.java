package test0214;
/*
 StringBuffer,StringBuilder
 	:�������� ���ڿ��� ó���ϴ°�� String ���� ����
 	StringBuilder:
 	StringBuffer:����ȭ ����.��Ƽ�����忡�� ����
 
 */
public class StringBuffer_Ex13{
	public static void main(String[] ss) {
		StringBuffer sb1=new StringBuffer("korea");
		StringBuffer sb2=new StringBuffer("korea");
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println(sb1==sb2); //false. �ּҺ�
		System.out.println(sb1.equals(sb2)); 
				//false. �ּҺ�. String(����)���� �ٸ�
				//���ڿ��� ���ϱ����ؼ��� String���� ��ȯ
		
	//���ڿ��� ��ȯ
		String s=sb1.toString();
		System.out.println(s);
		
	//���ڿ� ��
		System.out.println(sb1.toString().equals(sb2.toString()));//true
		
	//���ڿ� ����
		System.out.println("���� : "+sb1.length()); //korea 5����
		
	//�ʱ����ũ��
		StringBuffer sb3=new StringBuffer();
		System.out.println("�ʱ����ũ�� : "+sb3.capacity()); 
		
	//�ڿ� ���ڿ��߰�
		sb3.append("seoul");
		sb3.append("korea");
		sb3.append("���ѹα�");
		sb3.append("�츮����");
		sb3.append("�ڹ�");
		sb3.append("������");
		System.out.println("���� ũ�� : "+sb3.capacity());//����ũ��:34, ���۰� �����ϸ� �ڵ����� �ø�.
		
		System.out.println(sb3);
		
		System.out.println(sb3.indexOf("�ڹ�"));
		
	//�ҹ��ڸ� �빮�ڷ� ���� 
		String s2=sb3.toString();
		System.out.println(s2.toUpperCase());
	
	//����տ� �ѱ��� �ְ����.
		sb3.insert(0, "�ѱ�"); //ó���� �ѱ��� ����
		System.out.println(sb3);
	
	//�ڸ��� �ڿ� ����� �ְ����
		sb3.insert(sb3.indexOf("korea")+"korea".length(),"���"); //�ڸ��� ���̸� Ȯ���ϰ� ���� Ȯ��.
		System.out.println(sb3);
		
	//���ѹα��� ��������
	//delete(s,e) : s�ε������� e-1 �ε������� ����
		sb3.delete(sb3.indexOf("���ѹα�"),sb3.indexOf("���ѹα�")+"���ѹα�".length() );
		System.out.println(sb3);
	
	//����������
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println("���� : "+sb3.length()+",����ũ��"+sb3.capacity());
		
	//������ ũ�⸦ ���ڿ����̷�
		sb3.trimToSize();
		System.out.println("���� : "+sb3.length()+",����ũ��"+sb3.capacity());
	
		System.out.println("sb1= "+sb1);
		
	//��� ���ڿ� �����
		sb1.delete(0, sb1.length());
		System.out.println("���ڿ� : "+sb1);
	
	//��� ���ڿ� �����
		System.out.println("sb2= "+sb2);	
		sb2=new StringBuffer();
		System.out.println("�ٽ� new �� ��� : "+sb2);
	}
}
