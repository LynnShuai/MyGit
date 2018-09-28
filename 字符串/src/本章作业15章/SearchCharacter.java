package 本章作业15章;
/**
 * 
 * 查找所有字符或者字符串出现的位置下标
 * 并输出出来
 * @author LINSHUAI
 *
 */
public class SearchCharacter {
	
			public void find(String name,String name2) {
				
				for(int i=0;i<name.length();i++) {
					//把每个字符拆分出来，逐个查找
					//方法charAt(i);或substring(i,i+1);
					if(name.substring(i, i+1).equals(name2)) {
						System.out.print(i+"\t");
					}
				}
			}
			public void search(String name,String name2) {
				for(int i=0;i<name.length();) {
					//首先要有进入条件，满足循环才继续，否则循环停止
					//判断找的字符一定在字符串长度范围，不然找不到会返回-1，+1=0会无限循环输出
					if(name.indexOf(name2,i)>=0&&name.indexOf(name2,i)<name.length()) {
					System.out.println(name.indexOf(name2,i));
					//让找到该位置的值的下标加1；继续下一轮查找，以此循环
					i=name.indexOf(name2, i)+1;
				  
					}else {
						break;
					}
					}
			}
}
