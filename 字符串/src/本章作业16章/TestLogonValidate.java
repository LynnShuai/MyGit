package ������ҵ16��;

import java.util.Scanner;

public class TestLogonValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		LogonValidate logon=new LogonValidate();
		boolean con=true;
		do {
			System.out.println("�������û�����");
			String name=input.next();
			System.out.println("���������룺");
			String psw=input.next();
			if(logon.validate(name, psw)==true) {
				System.out.println("��ӭ�㣬��½�ɹ�");
				con=true;
			}else {
				System.out.println("�û������������");
				con=false;
			}
			
			
		}while(!con);
	}

}
