package ������ҵ16��;

import java.util.Scanner;

public class TestDateSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DateSubstring date=new DateSubstring();
		boolean con=false;
		do {
		System.out.println("������һ������(��/��/��)");
		String name=input.next();
		con=date.judge(name);
		if(con==false) {
			System.out.println("���ڸ�ʽ�������������룺");
		}
		}while(con==false);
	}

}
