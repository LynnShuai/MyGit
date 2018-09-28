package 本章作业16章;

import java.util.Scanner;

public class TestStudentIofo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		StudentIofo student=new StudentIofo();
		StudentBiz stu=new StudentBiz();
		System.out.println("输入你的学生姓名：");
		student.name=input.next();
		System.out.println("请输入学生年龄：");
		student.age=input.nextInt();
		System.out.println("请输入学生性别：");
		student.gender=input.next();
		System.out.println("请输入学生学校：");
		student.school=input.next();
		stu.add(student);
		stu.show();
	}

}
