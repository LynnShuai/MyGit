package charAt;

public class CharAt {
		
		
			public void input(int num) {
			int a=(int)(Math.random()*3+1);
			System.out.println("�˻�"+a);
			if((num<a&&num-a!=-2)||num-a==2) {
				
					System.out.println("������");
			
				
			}else if((num>a&&num-a!=2)||num-a==-2){
				System.out.println("Ӯ��");
			}
			
			if(num==a) {
				System.out.println("ƽ��");
			}
			String name="123";
			String ab=new String("123");
			System.out.println(name==ab);
}
}