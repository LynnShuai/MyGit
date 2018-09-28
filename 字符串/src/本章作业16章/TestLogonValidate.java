package 本章作业16章;

import java.util.Scanner;

public class TestLogonValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		LogonValidate logon=new LogonValidate();
		boolean con=true;
		do {
			System.out.println("请输入用户名：");
			String name=input.next();
			System.out.println("请输入密码：");
			String psw=input.next();
			if(logon.validate(name, psw)==true) {
				System.out.println("欢迎你，登陆成功");
				con=true;
			}else {
				System.out.println("用户名或密码错误");
				con=false;
			}
			
			
		}while(!con);
	}

}
