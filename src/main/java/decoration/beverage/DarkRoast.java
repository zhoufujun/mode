package decoration.beverage;
/** 
 * @author ant 
 * @date 创建时间：2017年11月22日 下午4:41:48  
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.description = "超优DarkRoast";
	}
	
	@Override
	public double cost() {
		return 20;
	}

}
