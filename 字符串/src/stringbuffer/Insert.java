package stringbuffer;
/**
 * 
 * 
 * StringBuffer �� ���������ø�ʽ������
 * @author LINSHUAI
 *
 */
public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="";
		StringBuffer a=new StringBuffer("1234567891");
		for(int i=a.length();i>0;i-=3) {
			//�ַ���.insert(λ�ã�����);����
		name=(a.insert(i, ",")).toString();
		//
		}
		System.out.println(name);
		
		String b="123";
		String c="���ɵ��";
		//�ַ���.concat(�ַ���2);  �������ã�����ֻ������String ��
				String n=b.concat(c);
				System.out.println(n);
				StringBuffer m=new StringBuffer("�����ɵ��");
		int l=123;
		//�ַ���.toString();  Buffer ��ת����String �� 
		String i=(m.append(l)).toString();
		//�ַ���.append(�ַ���2); ������Ը��κ��������ӣ�
		System.out.println(i);
	}

}
