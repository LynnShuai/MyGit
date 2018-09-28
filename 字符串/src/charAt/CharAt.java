package charAt;

public class CharAt {
		
		
			public void input(int num) {
			int a=(int)(Math.random()*3+1);
			System.out.println("人机"+a);
			if((num<a&&num-a!=-2)||num-a==2) {
				
					System.out.println("你输了");
			
				
			}else if((num>a&&num-a!=2)||num-a==-2){
				System.out.println("赢了");
			}
			
			if(num==a) {
				System.out.println("平局");
			}
			String name="123";
			String ab=new String("123");
			System.out.println(name==ab);
}
}