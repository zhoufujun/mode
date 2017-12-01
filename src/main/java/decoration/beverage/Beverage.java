package decoration.beverage;
/** 
 * @author ant 
 * @date 创建时间：2017年11月22日 下午4:31:45  
 */
public abstract class Beverage {
	
	public String description;
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
