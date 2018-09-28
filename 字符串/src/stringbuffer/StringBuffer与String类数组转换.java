package stringbuffer;

public class StringBuffer与String类数组转换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer[] b = new StringBuffer[5];
		b[0] = new StringBuffer();//加上这一句。你只是new初始化了数组，没有实例化数组里的对象。
		b[0].append(true);
		System.out.println("b[0]="+b[0]); 
		String[]num=new String[] {"电风扇","洗衣机","电视机","冰箱","空调机"};
		//String[]num2= {};
	StringBuffer[]StringBuffers=new StringBuffer[5];
	for(int i=0;i<StringBuffers.length;i++) {
		StringBuffers[i] = new StringBuffer();
		StringBuffers[i]=	StringBuffers[i].append(num[i]);
		System.out.println(StringBuffers[i]);
	}

}
}