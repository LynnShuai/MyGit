package 本章作业15章;

import java.util.Scanner;

public class TestSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
				SortString sort=new SortString();
				String []name=new String[5];
		for(int i=0;i<5;i++) {
			System.out.println("输入第"+(i+1)+"种水果：");
			name[i]=input.next();
		}
		sort.sort(name);
	}

}
