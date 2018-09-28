package 本章作业13章;

public class Computer {
	String name2;
	int random;
			public String random() {
				random=(int)(Math.random()*3+1);
				switch(random) {
				case 1:
					name2="剪刀";
					break;
				case 2:
					name2="石头";
					break;
				case 3:
					name2="布";
					break;
				}
				return name2;
			}
			
			
}
