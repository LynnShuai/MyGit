package register;

import java.util.Scanner;

public class TestRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Register register=new Register();
		boolean flag;
			do {
				System.out.println("��������û�����");
				String name=input.next();
				System.out.println("����������룺");
				String password=input.next();
				System.out.println("�ٴ�����������룺");
				String againpassword=input.next();
			 flag=	register.register(name, password,againpassword);
			}while(flag==false);
	}

}
