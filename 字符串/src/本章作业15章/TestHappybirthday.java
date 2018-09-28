package 本章作业15章;

import java.util.Scanner;

public class TestHappybirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			Hppybirthday hy=new Hppybirthday();
				System.out.println("请输入你的身份证号码：");
				String name=input.next();
				hy.search(name);
	}

}
