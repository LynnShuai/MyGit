package intת��ΪString����;

public class CharChangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String character="1234";
				String num="";
				for(int i=0;i<character.length();i++) {
					//��ȡ�ĳ�ʼλ��  ��ֹλ��
				num=	character.substring(i, i+1);
				System.out.println(num);
				}
				
				String character1="1234";
				String num1="";
				for(int i=0;i<character.length();i++) {
					//charתString +"";�Ϳ�����
				num=character.charAt(i)+"";
				System.out.println(num1);
				}
				
				
				String character2="1234";
				String num2="";
				for(int i=character.length()-1;i>=0;i--) {
					//��ȡ�ĳ�ʼλ��  ��ֹλ��
				num=	character.substring(i, i);
				System.out.println(num2);
				}
				
				
				
	}

}
