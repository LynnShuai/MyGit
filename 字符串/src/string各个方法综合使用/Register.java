package string���������ۺ�ʹ��;

/**
 * @author LINSHUAI
 *
 *ע��ʱ�����������Ƿ�Ϸ�
 */
public class Register {
		
			public boolean find(String name) {
				boolean con=true;
				name=name.trim();
				if((name.substring(name.length()-5)).equals(".java")&&name.indexOf(".")==name.length()-5){
					System.out.println("�Ϸ�");
					con=true;
				}else {
					System.out.println("���Ϸ�");
					con=false;
				}
				return con;
			}
			public boolean search(String name) {
				boolean find=true;
				name=name.trim();
				if(name.indexOf("@")<name.indexOf(".")&&name.lastIndexOf("@")==name.lastIndexOf("@")&&name.lastIndexOf(".")==name.lastIndexOf(".")){
					System.out.println("����Ϸ�");
					find=true;
				}else {
					System.out.println("���䲻�Ϸ�");
					find=false;
				}
				return find;
			}
}
