package �ж��ַ����ִ���;

import java.util.Scanner;

public class TestCharacter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner input=new Scanner(System.in);
		Character6 cc=new Character6();
		System.out.println("����һ�仰");
		String name=input.next();
		System.out.println("������Ҫ���ҵ���");
		char name2=input.next().charAt(0);
		
		int count=cc.find(name, name2);
		System.out.println(name+"�а���"+count+"���ַ�");
	}

}
