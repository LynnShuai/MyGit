package ������ҵ13�µڶ���;

public class Person {
	
		
		String name;
		int score;
		
		public int person(int choice) {
			switch(choice) {
			case 1:
				System.out.println("���ȭ������");
				break;
			case 2:
				System.out.println("���ȭ��ʯͷ");
				break;
			case 3:
				System.out.println("���ȭ����");
				break;
			}
			return choice;
		}
}
