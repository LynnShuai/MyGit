package register;
/**
 * 
 * ע����
 * @author LINSHUAI
 *
 */
public class Register {

		
			
			public boolean register(String name,String password,String againpassword) {
				boolean flag=true;
				if(name.length()<3||password.length()<6) {
					System.out.println("�û������Ȳ���С��3�����볤�Ȳ���С��6");
					flag=false;
				}else {
					if(password.equals(againpassword)) {
						System.out.println("ע��ɹ������μ��û���������");
						flag=true;
				}else {
					System.out.println("������������벻��ͬ");
					flag=false;
				}
					
				}
				return flag;
			}
}
