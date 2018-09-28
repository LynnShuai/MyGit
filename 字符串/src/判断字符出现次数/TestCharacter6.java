package 判断字符出现次数;

import java.util.Scanner;

public class TestCharacter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner input=new Scanner(System.in);
		Character6 cc=new Character6();
		System.out.println("输入一句话");
		String name=input.next();
		System.out.println("输入你要查找的字");
		char name2=input.next().charAt(0);
		
		int count=cc.find(name, name2);
		System.out.println(name+"中包含"+count+"个字符");
	}

}
