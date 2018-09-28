package 判断字符出现次数;

import java.util.Scanner;

public class TestCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Character char1=new Character();
		System.out.println("输入一句话");
		String name=input.next();
		System.out.println("输入你要查找的字符");
		String name2=input.next();
		int count=char1.time(name, name2);
		System.out.println(name+"中包含"+count+"个字符");
	}

}
