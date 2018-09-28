package 判断字符出现次数;
/**
 * 
 * 利用String 字符串方法    
 *  字符串名.indexOf(String name(就是你要查找的字符),int index(就是从第几个位置开始查找))
 *  切记该字符串返回的是找到第一个字符的下标；
 * @author LINSHUAI
 *
 */
public class maaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="12232243292524242";
		String c="2";
	int b=	a.indexOf(c,0);
	
		int count=0;
		for(int i=0;i<a.length();) {
			//先判断进入的条件，也就是第一个字符要在该字符串里
			if(a.indexOf(c,i)>=0&&a.indexOf(c, i)<a.length()) {
			//	找到了，此时的i值就是它的下标，这时控制i值，
			//	让其加1，再从找到第一字符位置下一个字符继续查找，
			//	直到把整个字符串查找完；也就是找不到目标了；
				i=a.indexOf(c,i)+1;
				count+=1;
				
			}
			
		}
		System.out.println(count);
		}

}
