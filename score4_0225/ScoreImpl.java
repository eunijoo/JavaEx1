package score4_0225;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class ScoreImpl implements Score{
	private Scanner sc=new Scanner(System.in);
	//HashMap : ���ü� ���� ����.	
	private Map<String,ScoreVO>map =new HashMap<>();
	
	//HashTable :  ���ü� ����(��Ƽ�����忡�� ����).�ӵ� ����.
	//private Map<String,ScoreVO> map=new Hashtable<>();
	
	//TreeMap : Ű�� ����. ��, Ű�� ��Ÿ���� Ŭ������ Comparable �������̽��� �����Ǿ� �־����.//���ü� ��������.
	//private Map<String,ScoreVO> map=new TreeMap<>();
	
	
	@Override
	public void input() {
		System.out.println("\n�ڷ��Է�..");
		
		String hak;
		System.out.println("�й�?");
		hak =sc.next();
		
		if(map.containsKey(hak)) {
			System.out.println("����� �й��Դϴ�. \n");
			return;
		}
		
		
		try {
			ScoreVO vo=new ScoreVO();
			
			System.out.println("�̸�?");
			vo.setName(sc.next());
			
			
			System.out.println("����?");
			vo.setKor(sc.nextInt());
			
			System.out.println("����?");
			vo.setEng(sc.nextInt());
			
			System.out.println("����?");
			vo.setMat(sc.nextInt());
			
			map.put(hak, vo); //map�� ����
			System.out.println("�����Ϸ�");
			
		} catch (InputMismatchException e) {
			System.out.print(" ������ ���ڸ� �����մϴ�.\n");
			sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void print() {
		System.out.println("\n�ڷ����..");
		
		System.out.println("�ο��� : "+map.size());
	//	Iterator<String> it = map.keySet().iterator();
		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		
		while(it.hasNext()) {
			String hak=it.next();
			ScoreVO vo=map.get(hak);
			
			System.out.print(hak+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMat()+"\t");
			System.out.print(vo.getTot()+"\n");
		}		
		System.out.println();
	}

	@Override
	public void update() {
		System.out.println("\n�ڷ����..");
		String hak;
		System.out.println("������ �й�?");
		hak =sc.next();
		
		ScoreVO vo=map.get(hak);  //Key : �й� 
		
		if(vo==null) {
			System.out.println("����� �й��Դϴ�. \n");
			return;
		}
		try {		
			System.out.println("�̸�?");
			vo.setName(sc.next());
				
			System.out.println("����?");
			vo.setKor(sc.nextInt());
			
			System.out.println("����?");
			vo.setEng(sc.nextInt());
			
			System.out.println("����?");
			vo.setMat(sc.nextInt());
			
			System.out.println("�����Ϸ�");
			
		} catch (InputMismatchException e) {
			System.out.print(" ������ ���ڸ� �����մϴ�.\n");
			sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}		

	@Override
	public void delete() {
		System.out.println("\n�ڷ����..");
		String hak;
		System.out.println("������ �й�?");
		hak =sc.next();
		
		ScoreVO vo=map.remove(hak);
		if(vo==null) {
			System.out.println("��ϵ� �ڷᰡ �ƴմϴ�.\n");
			return;
		}
		System.out.println(vo.getName()+"�� �ڷᰡ �����Ǿ����ϴ�.\n");  //������ �Ǿ����� ����� ����,������ �ȵ����� if�� ��.

	}
	
	@Override
	public void findByHak() {
		System.out.println("\n�й��˻�..");
	
		String hak;
		System.out.println("�˻��� �й�?");
		hak =sc.next();
		
		ScoreVO vo=map.get(hak);  //Key : �й� 
		
		if(vo==null) {
			System.out.println("������� ���� �й��Դϴ�. \n");
			return;
		}
		System.out.println(hak+"\t");
		System.out.print(vo.getName()+"\t");
		System.out.print(vo.getKor()+"\t");
		System.out.print(vo.getEng()+"\t");
		System.out.print(vo.getMat()+"\t");
		System.out.print(vo.getTot()+"\t");
		System.out.println();
	}
		
		
	

	@Override
	public void findByName() {
		System.out.println("\n�̸��˻�..");
	//�̸� ������ڸ� ���� ã�°�	
		String name;
		System.out.println("�˻��� �̸�?");
		name=sc.next();
//��ü�ѹ��� ����.		
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()) {
			String hak=it.next();
			ScoreVO vo=map.get(hak);
			
			if(vo.getName().indexOf(name)>=0) { //�ε����� 0���� �����̴ϱ� 0�̸��� ����.
				System.out.print(hak+"\t");
				System.out.print(vo.getName()+"\t");
				System.out.print(vo.getKor()+"\t");
				System.out.print(vo.getEng()+"\t");
				System.out.print(vo.getMat()+"\t");
				System.out.print(vo.getTot()+"\t");
	
			}
		}
		System.out.println();
		
		
	}
}
