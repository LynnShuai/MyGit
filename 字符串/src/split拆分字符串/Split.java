package split拆分字符串;

/**
 * @author LINSHUAI
 *拆分 有规律的字符  或者自己做特殊的标记
 */
public class Split {
			
			public void split(String name) {
				String[]names=new String[100];
				names=name.split(",");
				for(int i=0;i<names.length;i++) {
					if(names[i]!=null) {
						System.out.println(names[i]);
					}
				}
			}
}
