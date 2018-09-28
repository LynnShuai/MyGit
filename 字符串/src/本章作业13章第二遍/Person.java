package 本章作业13章第二遍;

public class Person {
	
		
		String name;
		int score;
		
		public int person(int choice) {
			switch(choice) {
			case 1:
				System.out.println("你出拳：剪刀");
				break;
			case 2:
				System.out.println("你出拳：石头");
				break;
			case 3:
				System.out.println("你出拳：布");
				break;
			}
			return choice;
		}
}
