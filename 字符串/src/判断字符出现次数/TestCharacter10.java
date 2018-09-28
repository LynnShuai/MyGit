package 判断字符出现次数;

import java.util.Scanner;

public class TestCharacter10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String a="132422222";
		String c="2";
		int count=0;
		int b=0;
		do { 
		
		
			if(a.indexOf(c)>=0&&a.indexOf(c)<a.length())	{	
			b=a.indexOf(c,b);
			count++;
			
			a=a.substring(b+1);
			b=a.indexOf(c);
			}
		
		}while(a.indexOf(c)>=0&&a.indexOf(c)<a.length());
		System.out.println("次数"+count);
		
	}

}
