package ע���ֻ������֤��Ҫ��;

import java.util.Scanner;

public class TestRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		Register re=new Register();
		System.out.println("�������֤��");
		String name1=input.next();
		boolean find=re.find(name1);
		if(find==true) {
			System.out.println("�Ϸ�");
		}else {
			System.out.println("���Ϸ�");
		}
		System.out.println("��������ֻ���");
		String name2=input.next();
		re.con(name2);
		System.out.println("�������������");
		String name3=input.next();
		re.search(name3);
	}

}
