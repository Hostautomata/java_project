package com.ict03.class06;
enum Type2{
	//������ ��Ű��.
	//1.�� ����
	WALK("��ŷȭ",270),
	RUN("����ȭ",275),
	TRACK("Ʈ��ŷȭ",265),
	HIK("����ŷȭ",260);
	
	//2.��������
	final private String name;
	final private int size;

	//3.������
	Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}
	//4.getter
	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
	
	
}
public class Ex03 {
	public static void main(String[] args) {
		Type2[] arr = Type2.values();
		for(int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i].getName()+", ");
			System.out.println(arr[i].getSize()+" ");
		}
		//������ for�� // foreach��==forin+�÷��ǿ��� �ַ� ���
		//':'�� �ǹ̰� �迭�� �������ִ� ó������ �迭 ������ ������ ���Խ�Ų��.
		//���ο��� ����� ������ �����Ű�� ����
		//for������ ���� ió�� �ϳ��ϳ��� �����Ҽ��� ����.
		//for (�ڷ��� ���ο��� ����� ���� : �迭) {}
		String[] msg = {"java","jsp","spring","android"};
		for (String k : msg) {
			System.out.println(k);
		}
		
		for (Type2 k : arr) {
			
			System.out.println(k.getName());
			System.out.println(k.getSize());
		
			
		}	
		
	}
}

