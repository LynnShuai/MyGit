package 本章作业16章;

public class DateSubstring {
	String []names;
		public void substring(String name) {
			
			
				
				
			
			
			
		}
		
			public boolean judge(String name) {
				boolean con=false;
				names=name.split("/");
				if(Integer.valueOf(names[1])<31) {
					
				
				if(names[0].length() < 3 && names[1].length() < 3 && names[2].length() >= 4) {
					System.out.println(names[2]+"年"+names[0]+"月"+names[1]+"日");
					con = true;
				}else{
					System.out.println("日期格式错误");
				}
				}else {
					System.out.println("bufuwhhe");
				}
//					if(names[0].length()<3&&names[1].length()<3&&names[2].length()==4) {
//						System.out.println(names[2]+"年"+names[0]+"月"+names[1]+"日");
//					}else {
//						
//							con=false;
//					}
				
				return con;
			}
		
}
