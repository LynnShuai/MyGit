package �ж��ַ����ִ���;
/**
 * 
 * ֻ�ܲ��ҵ����ַ�
 * 
 * @author LINSHUAI
 *
 */
public class Character6 {
		
			public int find(String name,char name2) {
				int count=0;
				for(int i=0;i<name.length();i++) {
					//�ַ�����.charAt(i)����ȡ����ÿһ������
				if((name.charAt(i))==name2) {
					count+=1;
				}
				}
				return count;
			}
			
			
			
}
