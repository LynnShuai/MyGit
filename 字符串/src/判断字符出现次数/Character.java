package 判断字符出现次数;
/**
 * 
 * 利用关键字，把字符串一分为二的段落；满足一次分为两段；并将其存入了数组里；格式
 * 数组名=字符串名.split(某个字或者某个字符串作为条件，进行段落分割大法)
 * @author LINSHUAI
 *
 */
public class Character {
			
				public int time(String name,String name2) {
					int count=0;
					String[]names=new String[100];
					names=name.split(name2);
					for(int i=0;i<names.length;i++) {
						if(names[i]!=null) {
		//如果分为6个段落；那就是6-1个关键字；因为数组是从0开始的；所以当i等于几就是几个关键字
							count=i;
							System.out.println(names[i]);
						}
					}
					return count;
				}
}
