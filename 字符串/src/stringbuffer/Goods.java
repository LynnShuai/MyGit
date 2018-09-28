package stringbuffer;

public class Goods {
	
		
	
			
				public boolean logon(String name1,String psw) {
					boolean con=false;
					String names="TOM";
					String password="123";
					
					if(name1.equals(names)&&psw.equals(password)) {
						System.out.println("登陆成功");
						con=true;
					}else {
						System.out.println("用户名或密码错误，重新输入");
					}
					return con;
				}
				
				public void showIofo() {
					System.out.println("************欢迎进入商品批发城*************");
					System.out.println("\t编号\t商品\t价格");
					String[]num=new String[] {"电风扇","洗衣机","电视机","冰箱","空调机"};
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
					//先int 转为String类
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
					       //截取第一个字符到点之前的一段字符串，也就是整数部分
				/*String cc=ct.substring(0,	ct.indexOf("."));
				//截取点到最后长度的字符；
				
				
				
					String number=ct.substring(ct.indexOf("."), ct.length());
					//构造方法：把String类转为Buffer类；再用insert(位置，参数)，插入
					StringBuffer ss=new StringBuffer(cc);
					String bb="";
				  //从前往后是从0开始的，所i+4;
					for(int i=3;i<ss.length();i+=4) {
						//插入之后再将其转化为String 类，进行输出与之前截取的小数部分用加号连接；
						bb=ss.insert(i, ",").toString();
					}
					//从后往前；i-3;i=字符串长度-1；
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
