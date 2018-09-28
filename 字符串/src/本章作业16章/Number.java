package ±¾ÕÂ×÷Òµ16ÕÂ;

public class Number {

			
			public void number(String age,int choice) {
				
				switch(choice) {
				case 1:
					
					System.out.println(age+"0"+choice+random());
					
					break;
				case 2:
					System.out.println(age+"0"+choice+random());
					break;
				case 3:
					System.out.println(age+"0"+choice+random());
					break;
					
				
			}
			public int random() {
				int num=(int)(Math.random()*900+100);
				return num;
			}
}
