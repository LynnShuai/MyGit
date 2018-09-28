package 本章作业15章;

public class ValidateBirthday {

		
			public boolean validate(String name) {
				boolean find=false;
				if(name.indexOf("/")==name.lastIndexOf("/")&&(name.indexOf("/")==2||name.indexOf("/")==1)&&(name.length()==5||name.length()==4)) {
					System.out.println("该会员生日是："+name);
				}else {
					System.out.println("生日格式错误！重新输入：");
					find=true;
				}
				return find;
			}
			
			
			public boolean validates(String name1) {
				boolean con=false;
				if(name1.length()>=6&&name1.length()<=10) {
					System.out.println("该会员密码是："+name1);
				}else {
					System.out.println("密码形式错误");
					con=true;
				}
				return  con;
			}
}
