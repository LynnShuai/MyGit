package ฑพียื๗าต16ีย;

public class StudentBiz {

		StudentIofo[]name=new StudentIofo[100];
		
		public void add(StudentIofo stu) {
			for(int i=0;i<name.length;i++) {
			if(name[i]==null) {
				name[i]=stu;
				break;
			}
			}
		}
		
		public void show() {
			for(int i=0;i<name.length;i++) {
				if(name[i]!=null) {
					name[i].showIofo();
				}
			}
		}
}
