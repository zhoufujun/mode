package singleton;
/** 
 * @author ant 
 * @date 创建时间：2017年6月7日 下午3:01:59  
 */
public class Test {
	
	public static void main(String[] args) {
		First first1 = First.instance();
		First first2 = First.instance();
		System.out.println(first1);
		System.out.println(first2);
	}

}
