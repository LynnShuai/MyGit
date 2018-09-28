package 本章作业13章第二遍;

import java.util.Scanner;

public class Menu {
	
		Person p;
		Computer c;
		int count;
		String exit;
		public void intial() {
			p=new Person();
			c=new Computer();
			count=0;
			 exit="n";
		}
		
		
		public void start() {
			
			
			
			do {
				intial();
				Scanner input=new Scanner(System.in);
				System.out.println("\t\t欢迎进入猜拳游戏\n\n*******猜拳开始*******\n");
				System.out.println("出拳规则：1.剪刀2.石头3.布");
				System.out.println("请选择你的对手：1.曹操2.刘备3.孙权");
				int choice=input.nextInt();
				switch(choice) {
				case 1:
					c.name="曹操";
					break;
				case 2:
					c.name="刘备";
					break;
				case 3:
					c.name="孙权";
					break;
				}
				System.out.println("输入你的姓名：");
				p.name=input.next();
				System.out.println(c.name+"VS"+p.name);
				System.out.println("要开始吗？(y/n)");
				String start=input.next();
				while(start.equals("y")) {
					System.out.println("请出拳：1.剪刀2.石头3.布");
					int num=input.nextInt();
				int pFist=	p.person(num);
				int cFist=c.computer();
				if((pFist<cFist&&pFist-cFist!=-2)||pFist-cFist==2) {
					System.out.println("你输了");
					c.score++;
				}else if(pFist==cFist) {
					System.out.println("你平局");
				}else {
					System.out.println("你赢了");
					p.score++;
				}
				count++;
				System.out.println("要开始下一局吗？(y/n)");
				start=input.next();
				}
				show();
				System.out.println("是否开始下一轮？(y/n)");
				exit=input.next();
				
				
				
				
				
				
				
			}while(exit.equals("y"));
		}
		
		public void show() {
			System.out.println(p.name+"VS"+c.name);
			System.out.println(p.name+"得分："+p.score+"\n"+c.name+"得分："+c.score);
			System.out.println("对战局数："+count);
			if(p.score>c.score) {
				System.out.println("你赢了");
			}else if(p.score==c.score) {
				System.out.println("平局了");
			}else {
				System.out.println("你输了");
			}
		}
}
