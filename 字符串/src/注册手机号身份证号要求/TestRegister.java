package 注册手机号身份证号要求;

import java.util.Scanner;

public class TestRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		Register re=new Register();
		System.out.println("输入身份证号");
		String name1=input.next();
		boolean find=re.find(name1);
		if(find==true) {
			System.out.println("合法");
		}else {
			System.out.println("不合法");
		}
		System.out.println("输入你的手机号");
		String name2=input.next();
		re.con(name2);
		System.out.println("输入你的座机号");
		String name3=input.next();
		re.search(name3);
	}

}
