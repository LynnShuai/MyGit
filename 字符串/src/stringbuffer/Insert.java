package stringbuffer;
/**
 * 
 * 
 * StringBuffer 类 创建必须用格式创建；
 * @author LINSHUAI
 *
 */
public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="";
		StringBuffer a=new StringBuffer("1234567891");
		for(int i=a.length();i>0;i-=3) {
			//字符串.insert(位置，参数);插入
		name=(a.insert(i, ",")).toString();
		//
		}
		System.out.println(name);
		
		String b="123";
		String c="你个傻吊";
		//字符串.concat(字符串2);  连接作用；后面只能连接String 类
				String n=b.concat(c);
				System.out.println(n);
				StringBuffer m=new StringBuffer("你个大傻吊");
		int l=123;
		//字符串.toString();  Buffer 类转换成String 类 
		String i=(m.append(l)).toString();
		//字符串.append(字符串2); 后面可以跟任何类型连接；
		System.out.println(i);
	}

}
