package stringbuffer;

public class StringBuffer��String������ת�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer[] b = new StringBuffer[5];
		b[0] = new StringBuffer();//������һ�䡣��ֻ��new��ʼ�������飬û��ʵ����������Ķ���
		b[0].append(true);
		System.out.println("b[0]="+b[0]); 
		String[]num=new String[] {"�����","ϴ�»�","���ӻ�","����","�յ���"};
		//String[]num2= {};
	StringBuffer[]StringBuffers=new StringBuffer[5];
	for(int i=0;i<StringBuffers.length;i++) {
		StringBuffers[i] = new StringBuffer();
		StringBuffers[i]=	StringBuffers[i].append(num[i]);
		System.out.println(StringBuffers[i]);
	}

}
}