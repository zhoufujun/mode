package decoration.beverage;
/** 
 * @author ant 
 * @date 创建时间：2017年11月22日 下午4:45:42  
 */
public class Espresso extends Beverage {

	public Espresso() {
		this.description = "超优Espresso";
	}
	
	@Override
	public double cost() {
		return 30;
	}

}
