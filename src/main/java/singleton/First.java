package singleton;
/** 
 * @author ant 
 * @date 创建时间：2017年6月7日 下午2:48:38  
 */
public class First {
	
	private static First first = new First();
	
	public static First instance() {
		return first;
	}
	

}
