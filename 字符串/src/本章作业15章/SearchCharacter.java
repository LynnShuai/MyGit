package ������ҵ15��;
/**
 * 
 * ���������ַ������ַ������ֵ�λ���±�
 * ���������
 * @author LINSHUAI
 *
 */
public class SearchCharacter {
	
			public void find(String name,String name2) {
				
				for(int i=0;i<name.length();i++) {
					//��ÿ���ַ���ֳ������������
					//����charAt(i);��substring(i,i+1);
					if(name.substring(i, i+1).equals(name2)) {
						System.out.print(i+"\t");
					}
				}
			}
			public void search(String name,String name2) {
				for(int i=0;i<name.length();) {
					//����Ҫ�н�������������ѭ���ż���������ѭ��ֹͣ
					//�ж��ҵ��ַ�һ�����ַ������ȷ�Χ����Ȼ�Ҳ����᷵��-1��+1=0������ѭ�����
					if(name.indexOf(name2,i)>=0&&name.indexOf(name2,i)<name.length()) {
					System.out.println(name.indexOf(name2,i));
					//���ҵ���λ�õ�ֵ���±��1��������һ�ֲ��ң��Դ�ѭ��
					i=name.indexOf(name2, i)+1;
				  
					}else {
						break;
					}
					}
			}
}
