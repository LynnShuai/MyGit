package 注册手机号身份证号要求;

public class Register {
		
			public boolean find(String name) {
				boolean find=false;
				if(name.length()==15||name.length()==18) {
					find=true;
				}
				
				return find;
			}
			public void con(String name) {
				if(name.length()==11) {
					System.out.println("手机号合法");
				}else {
					System.out.println("手机号不合法");
				}
				
			}
			
			public void search(String name) {
				if(name.indexOf("_")==4&&name.indexOf("_")==4&&(name.substring(0, 4)).length()==4&&(name.substring(5, name.length())).length()==7){
					
						System.out.println("合法");
					
					
				}else {
					System.out.println("不合法");
				}
			
}
}