package �ж��ַ����ִ���;
/**
 * 
 * ����String �ַ�������    
 *  �ַ�����.indexOf(String name(������Ҫ���ҵ��ַ�),int index(���Ǵӵڼ���λ�ÿ�ʼ����))
 *  �мǸ��ַ������ص����ҵ���һ���ַ����±ꣻ
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
			//���жϽ����������Ҳ���ǵ�һ���ַ�Ҫ�ڸ��ַ�����
			if(a.indexOf(c,i)>=0&&a.indexOf(c, i)<a.length()) {
			//	�ҵ��ˣ���ʱ��iֵ���������±꣬��ʱ����iֵ��
			//	�����1���ٴ��ҵ���һ�ַ�λ����һ���ַ��������ң�
			//	ֱ���������ַ��������ꣻҲ�����Ҳ���Ŀ���ˣ�
				i=a.indexOf(c,i)+1;
				count+=1;
				
			}
			
		}
		System.out.println(count);
		}

}
