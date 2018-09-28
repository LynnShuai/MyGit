package stringbuffer;

import java.util.Scanner;

public class TestGoods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input=new Scanner(System.in);
	Goods good=new Goods();
/*	boolean con=true;
	do {
		
	System.out.println("输入你的用户名：");
	String name=input.next();
	System.out.println("请输入密码：");
	String psw=input.next();
	con=good.logon(name, psw);
	
	
	}while(con==false);*/
	good.showIofo();
	System.out.println("输入你选择的编号：");
	int choice=input.nextInt();
	System.out.println("输入你的数量");
	int count=input.nextInt();
	String character=good.goods(choice, count).toString();
	System.out.println("您需付款："+character);
	}

}
