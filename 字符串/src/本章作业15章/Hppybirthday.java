package 本章作业15章;
/**
 * 
 * 输入一个身份证号码
 * 提取出身份证上的生日
 * @author LINSHUAI
 *
 */
public class Hppybirthday {
		
			public void search(String name) {
				System.out.println("该用户生日是："+name.substring(6, 10)+"年"+name.substring(10, 12)+"月"+name.substring(12,14)+"日");
			}
}
