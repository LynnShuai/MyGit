package ������ҵ13�µڶ���;

public class Computer {
	
		String name;
		int score;
		
		public int computer() {
			int choice=(int)(Math.random()*3+1);
			switch(choice) {
			case 1:
				System.out.println(name+"��ȭ������");
				break;
			case 2:
				System.out.println(name+"��ȭ��ʯͷ");
			break;
			case 3:
				System.out.println(name+"��ȭ����");
				break;
			}
			return choice;
		}
}
