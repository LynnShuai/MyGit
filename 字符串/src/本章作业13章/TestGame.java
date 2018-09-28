package 本章作业13章;

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
			
		
		System.out.println("请出拳：1.剪刀2.石头3.布(输入相应数字)");
		int choice=input.nextInt();
	System.out.println("你出拳："+people.person(choice));	
	System.out.println(menu.computer+"出拳"+com.random());	
	      if((choice<com.random&&choice-com.random!=-2)||choice-com.random==2) {
	    	  System.out.println("你输了");
	    	  count2++;
	      }else if(choice==com.random) {
	    	  System.out.println("平局");
	      }else { //if((choice>com.random&&choice-com.random!=2)||choice-com.random==2){
	    	  System.out.println("你赢了");
	    	  count++;
	      }
	time++;
		System.out.println("是否开始下一轮？(y/n)");
		isbegin=input.next();
		}while(isbegin.equals("y"));
		
		System.out.println(menu.computer+"VS"+menu.userName);
		System.out.println("对战次数："+time+"\n");
		System.out.println("姓名\t得分\n"+menu.userName+"\t"+count+"\n"+menu.computer+"\t"+count2+"\n");
	if(count>count2) {
		System.out.println("结果：你赢了，真棒棒哦");
	}else if(count==count2) {
		System.out.println("结果：平局了呢");
	}else {
		System.out.println("结果：你输了");
	}
	}

}
