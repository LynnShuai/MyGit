package string各个方法综合使用;

/**
 * @author LINSHUAI
 *
 *注册时，名字邮箱是否合法
 */
public class Register {
		
			public boolean find(String name) {
				boolean con=true;
				name=name.trim();
				if((name.substring(name.length()-5)).equals(".java")&&name.indexOf(".")==name.length()-5){
					System.out.println("合法");
					con=true;
				}else {
					System.out.println("不合法");
					con=false;
				}
				return con;
			}
			public boolean search(String name) {
				boolean find=true;
				name=name.trim();
				if(name.indexOf("@")<name.indexOf(".")&&name.lastIndexOf("@")==name.lastIndexOf("@")&&name.lastIndexOf(".")==name.lastIndexOf(".")){
					System.out.println("邮箱合法");
					find=true;
				}else {
					System.out.println("邮箱不合法");
					find=false;
				}
				return find;
			}
}
