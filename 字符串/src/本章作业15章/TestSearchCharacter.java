package ������ҵ15��;

import java.util.Scanner;

public class TestSearchCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		SearchCharacter ch=new SearchCharacter();
			System.out.println("�������һ���ַ�");
			String name=input.next();
			System.out.println("������Ҫ���ҵ��ַ���");
			String name2=input.next();
			System.out.println(name2+"���ֵ�λ���ǣ�");
			//ch.find(name, name2);
			ch.search(name, name2);
	}

}
