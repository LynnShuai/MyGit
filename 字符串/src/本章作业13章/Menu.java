package ������ҵ13��;

import java.util.Scanner;

public class Menu {
	String computer;
	String userName;
			public void menu() {
				Scanner input=new Scanner(System.in);
				boolean con=true;
				do {
				System.out.println("\t\t***************\n\t\t**  ��ȭ����ʼ    **   \n\t\t****************\n\n");
				System.out.println("��ȭ����1.����2.ʯͷ3.��");
				System.out.println("��ѡ��Է���ɫ(1.����2.��Ȩ3.�ܲ�)��");
				int choice=input.nextInt();
				switch(choice) {
				case 1:
					System.out.println("��ѡ����������ս!");
					computer="����";
					break;
				case 2:
					System.out.println("��ѡ������Ȩ��ս!");
					computer="��Ȩ";
					break;
				case 3:
					System.out.println("��ѡ���˲ܲٶ�ս!");
					computer="�ܲ�";
					break;
					default:
						System.out.println("������1-3");
						con=false;
				}
				System.out.println("�������������");
				userName=input.next();
				System.out.println(computer+"VS"+userName+"��ս\n");
				System.out.println("Ҫ��ʼ��(y/n)\n");
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
