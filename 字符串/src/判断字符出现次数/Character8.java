package 判断字符出现次数;
/**
 * 
 * 
 * 用最初位置和最后位置不断截取；缩小范围再找最初最末位置，
 * 找到就加2；找到最初位置就加1；
 * 直到最初位置找不到，不在这个字符串长度范围内，循环停止
 * 
 * 
 * @author LINSHUAI
 *
 */
public class Character8 {
		
			public int find(String name,String name2) {
				int count=0;
				do {
					//判断进入条件，第一位置和最末位置是否在字符串范围内，也就是有没有最末位置；没有就走 else  if
					if(name.indexOf(name2)>=0&&name.indexOf(name2)<name.length()&&name.lastIndexOf(name2)>=0&&name.lastIndexOf(name2)<name.length()) {
						//这个最初位置是要加一的；注意最末位置是从1开头的，你的下标是6，那它的最末位置对应的6+1=7.
						//所以你要7-1=6；才能截取不包含该字符的字符串；所以找到的最后一个位置，放到最末位置刚好是6；
						//也就不用减1了；
					name=name.substring(name.indexOf(name2)+1,name.lastIndexOf(name2));
						count+=2;
						//判断最初位置进入条件，在不在字符串里面，如果在就加1；
					}else if(name.indexOf(name2)>=0&&name.indexOf(name2)<name.length()) {
						count++;
					}
					//都不满足那就是没有；没有就循环停止了
				}while(!(name.indexOf(name2)>=0&&name.indexOf(name2)<name.length()));
			return count;
			}
}
