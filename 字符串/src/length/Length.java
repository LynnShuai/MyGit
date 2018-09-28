package length;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			String name,password;
			boolean con=true;
			do {
			System.out.println("输入你的用户名");
			name=input.next();
			System.out.println("请输入你的密码");
			password=input.next();
			if(password.length()>7) {
				System.out.println("注册成功");
				con=true;
			}else {
				System.out.println("密码过短，请重新输入");
				con=false;
			}
			
			}while(!con);
			String logonName,logonPassword;
		System.out.println("输入你的登陆账号");
		logonName=input.next();
		System.out.println("输入你的登陆密码");
		logonPassword=input.next();
		
		if((logonName.toUpperCase()).equals(name.toUpperCase())&&logonPassword.equals(password)) {
			System.out.println("登陆成功");
		}else {
			System.out.println("登录失败");
		}
	}

}
