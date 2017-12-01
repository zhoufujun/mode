package policy;
/** 
 * @author ant 
 * @date 创建时间：2017年4月21日 下午1:56:48  
 */
public class CashRebate extends CashSuper {

	private double rebate;
		
	public CashRebate(String rebate) {
		super();
		this.rebate = Double.parseDouble(rebate);
	}

	@Override
	public double acceptCash(double money) {
		return money * rebate;
	}

}
