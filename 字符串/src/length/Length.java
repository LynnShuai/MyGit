package length;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			String name,password;
			boolean con=true;
			do {
			System.out.println("��������û���");
			name=input.next();
			System.out.println("�������������");
			password=input.next();
			if(password.length()>7) {
				System.out.println("ע��ɹ�");
				con=true;
			}else {
				System.out.println("������̣�����������");
				con=false;
			}
			
			}while(!con);
			String logonName,logonPassword;
		System.out.println("������ĵ�½�˺�");
		logonName=input.next();
		System.out.println("������ĵ�½����");
		logonPassword=input.next();
		
		if((logonName.toUpperCase()).equals(name.toUpperCase())&&logonPassword.equals(password)) {
			System.out.println("��½�ɹ�");
		}else {
			System.out.println("��¼ʧ��");
		}
	}

}
