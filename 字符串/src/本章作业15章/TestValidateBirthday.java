package 本章作业15章;

import java.util.Scanner;

public class TestValidateBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		ValidateBirthday vae=new ValidateBirthday();
		String name="";
		boolean con=false;
		boolean find=false;
		do {
			
			System.out.println("输入你的会员生日<月/日：00/00>：");
			 name=input.next();
			 con=vae.validate(name);
			if(con==false) {
				System.out.println("输入你会员密码<6~10>:");
				String name2=input.next();
				find=vae.validates(name2);
			}
			
			
			
		}while(con==true||find==true);
	}

}
