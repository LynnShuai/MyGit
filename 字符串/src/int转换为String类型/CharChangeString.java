package int转换为String类型;

public class CharChangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String character="1234";
				String num="";
				for(int i=0;i<character.length();i++) {
					//截取的初始位置  终止位置
				num=	character.substring(i, i+1);
				System.out.println(num);
				}
				
				String character1="1234";
				String num1="";
				for(int i=0;i<character.length();i++) {
					//char转String +"";就可以了
				num=character.charAt(i)+"";
				System.out.println(num1);
				}
				
				
				String character2="1234";
				String num2="";
				for(int i=character.length()-1;i>=0;i--) {
					//截取的初始位置  终止位置
				num=	character.substring(i, i);
				System.out.println(num2);
				}
				
				
				
	}

}
