package decoration.beverage;
/** 
 * @author ant 
 * @date 创建时间：2017年11月22日 下午4:43:22  
 */
public class Decaf extends Beverage {

	public Decaf() {
		this.description = "超优Decaf";
	}
	
	@Override
	public double cost() {		
		return 26;
	}

}
