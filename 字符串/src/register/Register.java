package register;
/**
 * 
 * 注册类
 * @author LINSHUAI
 *
 */
public class Register {

		
			
			public boolean register(String name,String password,String againpassword) {
				boolean flag=true;
				if(name.length()<3||password.length()<6) {
					System.out.println("用户名长度不能小于3，密码长度不能小于6");
					flag=false;
				}else {
					if(password.equals(againpassword)) {
						System.out.println("注册成功，请牢记用户名和密码");
						flag=true;
				}else {
					System.out.println("两次输入的密码不相同");
					flag=false;
				}
					
				}
				return flag;
			}
}
