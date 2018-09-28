package 本章作业13章第二遍;

public class Computer {
	
		String name;
		int score;
		
		public int computer() {
			int choice=(int)(Math.random()*3+1);
			switch(choice) {
			case 1:
				System.out.println(name+"出拳：剪刀");
				break;
			case 2:
				System.out.println(name+"出拳：石头");
			break;
			case 3:
				System.out.println(name+"出拳：布");
				break;
			}
			return choice;
		}
}
