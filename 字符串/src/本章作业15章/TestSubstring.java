package 本章作业15章;

import java.util.Scanner;

public class TestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		NameSubstring ss=new NameSubstring();
			System.out.println("输入你的名字");
			String name=input.next();
			ss.substring(name);
	}

}
