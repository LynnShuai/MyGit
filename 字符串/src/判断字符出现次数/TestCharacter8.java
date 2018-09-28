package 判断字符出现次数;

import java.util.Scanner;

public class TestCharacter8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Character8 cc=new Character8();
		System.out.println("输入一句话");
		String name=input.next();
		System.out.println("输入你要查找的字");
		String name2=input.next();
		cc.find(name, name2);
	}

}
