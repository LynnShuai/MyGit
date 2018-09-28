package ฑพียื๗าต15ีย;

public class SortString {
		
				public void sort(String[]name) {
					for(int i=0;i<name.length;i++) {
						for(int j=0;j<name.length;j++) {
						if(name[i].compareToIgnoreCase(name[j])<0) {
							String temp=name[i];
							name[i]=name[j];
							name[j]=temp;
						}
					}
				}
					for(int i=0;i<name.length;i++) {
						System.out.println(name[i]);
					}
					
				}
				
			
}
