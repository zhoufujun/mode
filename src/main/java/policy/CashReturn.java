package policy;

import java.io.Console;

/** 
 * @author ant 
 * @date 创建时间：2017年4月21日 下午2:03:57  
 */
public class CashReturn extends CashSuper {
	
	private double moneyCondition;
	private double moneyReturn;
	
	public CashReturn(double moneyCondition, double moneyReturn) {
		super();
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	
	@Override
	public double acceptCash(double money) {
		double result = money;
		if (moneyCondition > moneyReturn) {
			result = money - moneyReturn;
		}
		return result;		
	}
	
}
