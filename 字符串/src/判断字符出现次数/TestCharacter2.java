package �ж��ַ����ִ���;

import java.util.Scanner;

public class TestCharacter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Character2 c=new Character2();
		System.out.println("�������һ�仰");
		String name=input.next();
		System.out.println("������Ҫ���ҵ��ַ�");
		String name2=input.next();
	int count=	c.find(name, name2);
	System.out.println(name+"�а���"+count+"���ַ�");
	}

}
