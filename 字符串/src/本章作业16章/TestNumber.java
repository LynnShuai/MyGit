package ������ҵ16��;

import java.util.Scanner;

public class TestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner input = new Scanner(System.in);
		Number num=new Number();
		System.out.println("��������ݣ�");
		String age=input.next();
		if(age.length()<=2) {
		System.out.println("��ѡ���Ʒ����(1. ̨ʽ��2. �ʼǱ�3. ����)");
		int choice=input.nextInt();
		num.number(age, choice);
		}else {
			System.out.println("������λ��");
		}
	}

}
