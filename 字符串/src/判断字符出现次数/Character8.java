package �ж��ַ����ִ���;
/**
 * 
 * 
 * �����λ�ú����λ�ò��Ͻ�ȡ����С��Χ���������ĩλ�ã�
 * �ҵ��ͼ�2���ҵ����λ�þͼ�1��
 * ֱ�����λ���Ҳ�������������ַ������ȷ�Χ�ڣ�ѭ��ֹͣ
 * 
 * 
 * @author LINSHUAI
 *
 */
public class Character8 {
		
			public int find(String name,String name2) {
				int count=0;
				do {
					//�жϽ�����������һλ�ú���ĩλ���Ƿ����ַ�����Χ�ڣ�Ҳ������û����ĩλ�ã�û�о��� else  if
					if(name.indexOf(name2)>=0&&name.indexOf(name2)<name.length()&&name.lastIndexOf(name2)>=0&&name.lastIndexOf(name2)<name.length()) {
						//������λ����Ҫ��һ�ģ�ע����ĩλ���Ǵ�1��ͷ�ģ�����±���6����������ĩλ�ö�Ӧ��6+1=7.
						//������Ҫ7-1=6�����ܽ�ȡ���������ַ����ַ����������ҵ������һ��λ�ã��ŵ���ĩλ�øպ���6��
						//Ҳ�Ͳ��ü�1�ˣ�
					name=name.substring(name.indexOf(name2)+1,name.lastIndexOf(name2));
						count+=2;
						//�ж����λ�ý����������ڲ����ַ������棬����ھͼ�1��
					}else if(name.indexOf(name2)>=0&&name.indexOf(name2)<name.length()) {
						count++;
					}
					//���������Ǿ���û�У�û�о�ѭ��ֹͣ��
				}while(!(name.indexOf(name2)>=0&&name.indexOf(name2)<name.length()));
			return count;
			}
}
