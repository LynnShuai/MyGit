package stringbuffer;

import java.util.Scanner;

public class TestGoods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input=new Scanner(System.in);
	Goods good=new Goods();
/*	boolean con=true;
	do {
		
	System.out.println("��������û�����");
	String name=input.next();
	System.out.println("���������룺");
	String psw=input.next();
	con=good.logon(name, psw);
	
	
	}while(con==false);*/
	good.showIofo();
	System.out.println("������ѡ��ı�ţ�");
	int choice=input.nextInt();
	System.out.println("�����������");
	int count=input.nextInt();
	String character=good.goods(choice, count).toString();
	System.out.println("���踶�"+character);
	}

}
