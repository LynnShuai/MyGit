package �ж��ַ����ִ���;

import java.util.Scanner;

public class TestCharacter8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Character8 cc=new Character8();
		System.out.println("����һ�仰");
		String name=input.next();
		System.out.println("������Ҫ���ҵ���");
		String name2=input.next();
		cc.find(name, name2);
	}

}
