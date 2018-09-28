package 本章作业16章;

import java.util.Scanner;

public class TestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner input = new Scanner(System.in);
		Number num=new Number();
		System.out.println("请输入年份：");
		String age=input.next();
		if(age.length()<=2) {
		System.out.println("请选择产品类型(1. 台式机2. 笔记本3. 其他)");
		int choice=input.nextInt();
		num.number(age, choice);
		}else {
			System.out.println("输入两位数");
		}
	}

}
