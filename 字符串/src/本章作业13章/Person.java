package ������ҵ13��;

public class Person {
			String name;
			public String person(int choice) {
				boolean con=true;
				do {
				switch(choice) {
				case 1:
					name="����";
					break;
				case 2:
					name="ʯͷ";
					break;
				case 3:
					name="��";
					break;
					default:
						System.out.println("����������1-3");
						con=false;
				}
				}while(!con);
				return name;
			}
}
