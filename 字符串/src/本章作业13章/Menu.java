package 本章作业13章;

import java.util.Scanner;

public class Menu {
	String computer;
	String userName;
			public void menu() {
				Scanner input=new Scanner(System.in);
				boolean con=true;
				do {
				System.out.println("\t\t***************\n\t\t**  猜拳，开始    **   \n\t\t****************\n\n");
				System.out.println("出拳规则：1.剪刀2.石头3.布");
				System.out.println("请选择对方角色(1.刘备2.孙权3.曹操)：");
				int choice=input.nextInt();
				switch(choice) {
				case 1:
					System.out.println("你选择了刘备对战!");
					computer="刘备";
					break;
				case 2:
					System.out.println("你选择了孙权对战!");
					computer="孙权";
					break;
				case 3:
					System.out.println("你选择了曹操对战!");
					computer="曹操";
					break;
					default:
						System.out.println("请输入1-3");
						con=false;
				}
				System.out.println("请输入你的姓名");
				userName=input.next();
				System.out.println(computer+"VS"+userName+"对战\n");
				System.out.println("要开始吗？(y/n)\n");
				String begin=input.next();
				if(begin.equals("n")) {
					menu();
					con=false;
					
				}else {
					con=true;;
				}
				}while(!con);
			}
}
