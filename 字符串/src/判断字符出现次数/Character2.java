package 判断字符出现次数;

import java.util.Scanner;

/**
 * @author LINSHUAI
 *
 *查找字符个数用 index(String a)
 * 找到一个从这个位置加一继续查找；
 *直到最后一个字符不在这个字符长度范围里
 */
public class Character2 {
	Scanner input=new Scanner(System.in);
		
			public int find(String name,String name2) {
				int count=0;
				boolean con=true;
				do {
					//第一个字符   大于0小于字符串长度
					if(name.indexOf(name2)<name.length()&&name.indexOf(name2)>=0) {
						count+=1;
						
						int a=name.indexOf(name2);
						System.out.println(a);
					      //a+1  是从找到那个字符位置的下一位置截取再查找
				String find=name.substring(a+1);
				System.out.println(find);
					name=find;
					}
				
					//最后一个字符    大于0小于字符串长度
				}while(name.lastIndexOf(name2)>=0&&name.lastIndexOf(name2)<name.length());
				return count;
			}
}
