package ������ҵ16��;

import java.util.Scanner;

public class TestStudentIofo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		StudentIofo student=new StudentIofo();
		StudentBiz stu=new StudentBiz();
		System.out.println("�������ѧ��������");
		student.name=input.next();
		System.out.println("������ѧ�����䣺");
		student.age=input.nextInt();
		System.out.println("������ѧ���Ա�");
		student.gender=input.next();
		System.out.println("������ѧ��ѧУ��");
		student.school=input.next();
		stu.add(student);
		stu.show();
	}

}
