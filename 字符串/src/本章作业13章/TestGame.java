package ������ҵ13��;

import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String isbegin="";
		int time=0;
		int count=0;
		int count2=0;
		Scanner input=new Scanner(System.in);
		Menu menu=new Menu();
		Person people=new Person();
		Computer com=new Computer();
		menu.menu();
		do {
			
		
		System.out.println("���ȭ��1.����2.ʯͷ3.��(������Ӧ����)");
		int choice=input.nextInt();
	System.out.println("���ȭ��"+people.person(choice));	
	System.out.println(menu.computer+"��ȭ"+com.random());	
	      if((choice<com.random&&choice-com.random!=-2)||choice-com.random==2) {
	    	  System.out.println("������");
	    	  count2++;
	      }else if(choice==com.random) {
	    	  System.out.println("ƽ��");
	      }else { //if((choice>com.random&&choice-com.random!=2)||choice-com.random==2){
	    	  System.out.println("��Ӯ��");
	    	  count++;
	      }
	time++;
		System.out.println("�Ƿ�ʼ��һ�֣�(y/n)");
		isbegin=input.next();
		}while(isbegin.equals("y"));
		
		System.out.println(menu.computer+"VS"+menu.userName);
		System.out.println("��ս������"+time+"\n");
		System.out.println("����\t�÷�\n"+menu.userName+"\t"+count+"\n"+menu.computer+"\t"+count2+"\n");
	if(count>count2) {
		System.out.println("�������Ӯ�ˣ������Ŷ");
	}else if(count==count2) {
		System.out.println("�����ƽ������");
	}else {
		System.out.println("�����������");
	}
	}

}
