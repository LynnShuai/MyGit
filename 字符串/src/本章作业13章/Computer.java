package ������ҵ13��;

public class Computer {
	String name2;
	int random;
			public String random() {
				random=(int)(Math.random()*3+1);
				switch(random) {
				case 1:
					name2="����";
					break;
				case 2:
					name2="ʯͷ";
					break;
				case 3:
					name2="��";
					break;
				}
				return name2;
			}
			
			
}
