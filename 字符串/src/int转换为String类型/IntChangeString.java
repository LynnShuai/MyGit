package int转换为String类型;

public class IntChangeString {

	public static void main(String[] args) {
		// TODO Aint sum=0;
		int sum=0;
		for(int i=1;i<=100;i++) {
			
			if(String.valueOf(i).indexOf("4")<0&&String.valueOf(i).indexOf("7")<0) {
		
		sum+=i;
	}
	}
	System.out.println(sum);
	
	

	}

}
