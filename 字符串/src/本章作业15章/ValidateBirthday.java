package ������ҵ15��;

public class ValidateBirthday {

		
			public boolean validate(String name) {
				boolean find=false;
				if(name.indexOf("/")==name.lastIndexOf("/")&&(name.indexOf("/")==2||name.indexOf("/")==1)&&(name.length()==5||name.length()==4)) {
					System.out.println("�û�Ա�����ǣ�"+name);
				}else {
					System.out.println("���ո�ʽ�����������룺");
					find=true;
				}
				return find;
			}
			
			
			public boolean validates(String name1) {
				boolean con=false;
				if(name1.length()>=6&&name1.length()<=10) {
					System.out.println("�û�Ա�����ǣ�"+name1);
				}else {
					System.out.println("������ʽ����");
					con=true;
				}
				return  con;
			}
}
