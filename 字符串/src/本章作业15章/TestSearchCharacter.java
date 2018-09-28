package 本章作业15章;

import java.util.Scanner;

public class TestSearchCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		SearchCharacter ch=new SearchCharacter();
			System.out.println("输入你的一段字符");
			String name=input.next();
			System.out.println("请输入要查找的字符串");
			String name2=input.next();
			System.out.println(name2+"出现的位置是：");
			//ch.find(name, name2);
			ch.search(name, name2);
	}

}
