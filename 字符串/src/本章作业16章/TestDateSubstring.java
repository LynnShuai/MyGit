package 本章作业16章;

import java.util.Scanner;

public class TestDateSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DateSubstring date=new DateSubstring();
		boolean con=false;
		do {
		System.out.println("请输入一个日期(月/日/年)");
		String name=input.next();
		con=date.judge(name);
		if(con==false) {
			System.out.println("日期格式错误，请重新输入：");
		}
		}while(con==false);
	}

}
