package split����ַ���;

/**
 * @author LINSHUAI
 *��� �й��ɵ��ַ�  �����Լ�������ı��
 */
public class Split {
			
			public void split(String name) {
				String[]names=new String[100];
				names=name.split(",");
				for(int i=0;i<names.length;i++) {
					if(names[i]!=null) {
						System.out.println(names[i]);
					}
				}
			}
}
