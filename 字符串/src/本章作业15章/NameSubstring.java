package ������ҵ15��;

public class NameSubstring {
		
				public void substring(String name) {
					String[]names=new String[10];
					for(int i=0;i<name.length();i++) {
				//	names[i]=name.substring(i,i+1);
					names[i]=name.charAt(i)+"";
					System.out.println(""+names[i]);
					}
					System.out.print("���ϣ�"+names[0]+"\n����:");
					for(int i=0;i<names.length;i++) {
						if(names[i]!=null&&i>=1) {
							System.out.print(names[i]);
						}
						
					}
					
					
				}
}
