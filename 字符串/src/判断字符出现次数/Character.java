package �ж��ַ����ִ���;
/**
 * 
 * ���ùؼ��֣����ַ���һ��Ϊ���Ķ��䣻����һ�η�Ϊ���Σ�������������������ʽ
 * ������=�ַ�����.split(ĳ���ֻ���ĳ���ַ�����Ϊ���������ж���ָ��)
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
		//�����Ϊ6�����䣻�Ǿ���6-1���ؼ��֣���Ϊ�����Ǵ�0��ʼ�ģ����Ե�i���ڼ����Ǽ����ؼ���
							count=i;
							System.out.println(names[i]);
						}
					}
					return count;
				}
}
