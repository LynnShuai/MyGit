package string���������ۺ�ʹ��;

import java.util.Scanner;

public class TestRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register re=new Register();
			Scanner input=new Scanner(System.in);
			System.out.println("�������Դ�ļ���");
			String name=input.next();
			boolean find=re.find(name);
			if(find) {
				System.out.println("�������������");
				String name2=input.next();
				boolean con=re.search(name2);
				if(con) {
					System.out.println("��ҵ�ύ�ɹ�");
				}else {
					System.out.println("E-mail��Ч");
				}
			}else {
				System.out.println("Դ�ļ�����Ч��\n��ҵ�ύʧ��");
			}
			
	}

}
