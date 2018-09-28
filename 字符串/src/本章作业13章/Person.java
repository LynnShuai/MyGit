package 本章作业13章;

public class Person {
			String name;
			public String person(int choice) {
				boolean con=true;
				do {
				switch(choice) {
				case 1:
					name="剪刀";
					break;
				case 2:
					name="石头";
					break;
				case 3:
					name="布";
					break;
					default:
						System.out.println("请输入数字1-3");
						con=false;
				}
				}while(!con);
				return name;
			}
}
