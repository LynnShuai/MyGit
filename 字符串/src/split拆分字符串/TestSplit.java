package split����ַ���;

import java.util.Scanner;

public class TestSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Split ss=new Split();
		System.out.println("������һ�λ�");
		String name=input.next();
		//name=name.trim();
		ss.split(name);
	}

}
