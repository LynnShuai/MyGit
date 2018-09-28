package string各个方法综合使用;

import java.util.Scanner;

public class TestRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register re=new Register();
			Scanner input=new Scanner(System.in);
			System.out.println("输入你的源文件名");
			String name=input.next();
			boolean find=re.find(name);
			if(find) {
				System.out.println("输入你的邮箱名");
				String name2=input.next();
				boolean con=re.search(name2);
				if(con) {
					System.out.println("作业提交成功");
				}else {
					System.out.println("E-mail无效");
				}
			}else {
				System.out.println("源文件名无效。\n作业提交失败");
			}
			
	}

}
