package ������ҵ16��;

public class DateSubstring {
	String []names;
		public void substring(String name) {
			
			
				
				
			
			
			
		}
		
			public boolean judge(String name) {
				boolean con=false;
				names=name.split("/");
				if(Integer.valueOf(names[1])<31) {
					
				
				if(names[0].length() < 3 && names[1].length() < 3 && names[2].length() >= 4) {
					System.out.println(names[2]+"��"+names[0]+"��"+names[1]+"��");
					con = true;
				}else{
					System.out.println("���ڸ�ʽ����");
				}
				}else {
					System.out.println("bufuwhhe");
				}
//					if(names[0].length()<3&&names[1].length()<3&&names[2].length()==4) {
//						System.out.println(names[2]+"��"+names[0]+"��"+names[1]+"��");
//					}else {
//						
//							con=false;
//					}
				
				return con;
			}
		
}
