package 判断字符出现次数;
/**
 * 
 * 只能查找单个字符
 * 
 * @author LINSHUAI
 *
 */
public class Character6 {
		
			public int find(String name,char name2) {
				int count=0;
				for(int i=0;i<name.length();i++) {
					//字符串名.charAt(i)来获取它的每一个长度
				if((name.charAt(i))==name2) {
					count+=1;
				}
				}
				return count;
			}
			
			
			
}
