package ������ҵ13�µڶ���;

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
				System.out.println("\t\t��ӭ�����ȭ��Ϸ\n\n*******��ȭ��ʼ*******\n");
				System.out.println("��ȭ����1.����2.ʯͷ3.��");
				System.out.println("��ѡ����Ķ��֣�1.�ܲ�2.����3.��Ȩ");
				int choice=input.nextInt();
				switch(choice) {
				case 1:
					c.name="�ܲ�";
					break;
				case 2:
					c.name="����";
					break;
				case 3:
					c.name="��Ȩ";
					break;
				}
				System.out.println("�������������");
				p.name=input.next();
				System.out.println(c.name+"VS"+p.name);
				System.out.println("Ҫ��ʼ��(y/n)");
				String start=input.next();
				while(start.equals("y")) {
					System.out.println("���ȭ��1.����2.ʯͷ3.��");
					int num=input.nextInt();
				int pFist=	p.person(num);
				int cFist=c.computer();
				if((pFist<cFist&&pFist-cFist!=-2)||pFist-cFist==2) {
					System.out.println("������");
					c.score++;
				}else if(pFist==cFist) {
					System.out.println("��ƽ��");
				}else {
					System.out.println("��Ӯ��");
					p.score++;
				}
				count++;
				System.out.println("Ҫ��ʼ��һ����(y/n)");
				start=input.next();
				}
				show();
				System.out.println("�Ƿ�ʼ��һ�֣�(y/n)");
				exit=input.next();
				
				
				
				
				
				
				
			}while(exit.equals("y"));
		}
		
		public void show() {
			System.out.println(p.name+"VS"+c.name);
			System.out.println(p.name+"�÷֣�"+p.score+"\n"+c.name+"�÷֣�"+c.score);
			System.out.println("��ս������"+count);
			if(p.score>c.score) {
				System.out.println("��Ӯ��");
			}else if(p.score==c.score) {
				System.out.println("ƽ����");
			}else {
				System.out.println("������");
			}
		}
}
