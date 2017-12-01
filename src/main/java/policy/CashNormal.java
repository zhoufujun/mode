package policy;
/** 
 * @author ant 
 * @date 创建时间：2017年4月21日 下午1:54:54  
 */
public class CashNormal extends CashSuper {

	@Override
	public double acceptCash(double money) {
		
		return money;
	}

}
