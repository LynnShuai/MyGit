package stringbuffer;

public class Goods {
	
		
	
			
				public boolean logon(String name1,String psw) {
					boolean con=false;
					String names="TOM";
					String password="123";
					
					if(name1.equals(names)&&psw.equals(password)) {
						System.out.println("��½�ɹ�");
						con=true;
					}else {
						System.out.println("�û��������������������");
					}
					return con;
				}
				
				public void showIofo() {
					System.out.println("************��ӭ������Ʒ������*************");
					System.out.println("\t���\t��Ʒ\t�۸�");
					String[]num=new String[] {"�����","ϴ�»�","���ӻ�","����","�յ���"};
					String[]num2=new String[] {"123.23","4,500.0","8,800.9","5,000.88","4,456.0"};
					
					for(int i=0;i<num.length;i++) {
						System.out.println("\t"+(i+1)+"\t"+num[i]+"\t"+num2[i]);
					}
				}
				
				public StringBuffer goods(int choice,int count) {
					double num=0.0;
					switch(choice) {
					case 1:
						num=count*123.33;
						break;
					case 2:
						num=count*4500.0;
						break;
					case 3:
						num=count*8800.9;
						break;
					case 4:
						num=count*5000.88;
						break;
					case 5:
						num=count*4456.0;
						break;
					}
					//��int תΪString��
					String ct="";
				ct	=String.valueOf(num);
					
					String []name=new String[100];
					name=ct.split("\\.");
					
					//String aa=name[1];
					String number="";
					String num1="";
					for(int i=0;i<name.length;i++) {
						if(name[i]!=null) {
							number=name[0];
							num1=name[1];
							System.out.println(name[i]);
						}
					}
					StringBuffer ss=new StringBuffer(number);
					String chart="";
					StringBuffer we=new StringBuffer();
					for(int i=ss.length()-3;i>0;i-=3) {
				we=	ss.insert(i,",");
					}
					       //��ȡ��һ���ַ�����֮ǰ��һ���ַ�����Ҳ������������
				/*String cc=ct.substring(0,	ct.indexOf("."));
				//��ȡ�㵽��󳤶ȵ��ַ���
				
				
				
					String number=ct.substring(ct.indexOf("."), ct.length());
					//���췽������String��תΪBuffer�ࣻ����insert(λ�ã�����)������
					StringBuffer ss=new StringBuffer(cc);
					String bb="";
				  //��ǰ�����Ǵ�0��ʼ�ģ���i+4;
					for(int i=3;i<ss.length();i+=4) {
						//����֮���ٽ���ת��ΪString �࣬���������֮ǰ��ȡ��С�������üӺ����ӣ�
						bb=ss.insert(i, ",").toString();
					}
					//�Ӻ���ǰ��i-3;i=�ַ�������-1��
					for(int i=ss.length()-3;i>0;i-=3) {
						bb=ss.insert(i,",").toString();
					}*/
					//return bb+number;
					return we.append("."+num1);
				}
}

//StringBuffer[]StringBuffers=new StringBuffer[5];
//for(int i=0;i<StringBuffers.length;i++) {
//	StringBuffers[i]=	StringBuffers[i].append(num[i]);
//	System.out.println(StringBuffers[i]);
