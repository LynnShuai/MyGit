package �ж��ַ����ִ���;

import java.util.Scanner;

/**
 * @author LINSHUAI
 *
 *�����ַ������� index(String a)
 * �ҵ�һ�������λ�ü�һ�������ң�
 *ֱ�����һ���ַ���������ַ����ȷ�Χ��
 */
public class Character2 {
	Scanner input=new Scanner(System.in);
		
			public int find(String name,String name2) {
				int count=0;
				boolean con=true;
				do {
					//��һ���ַ�   ����0С���ַ�������
					if(name.indexOf(name2)<name.length()&&name.indexOf(name2)>=0) {
						count+=1;
						
						int a=name.indexOf(name2);
						System.out.println(a);
					      //a+1  �Ǵ��ҵ��Ǹ��ַ�λ�õ���һλ�ý�ȡ�ٲ���
				String find=name.substring(a+1);
				System.out.println(find);
					name=find;
					}
				
					//���һ���ַ�    ����0С���ַ�������
				}while(name.lastIndexOf(name2)>=0&&name.lastIndexOf(name2)<name.length());
				return count;
			}
}
