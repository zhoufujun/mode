package decoration.beverage;

import java.io.File;
import java.io.FileReader;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/** 
 * @author ant 
 * @date 创建时间：2017年11月22日 下午4:39:18  
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.description = "超优HouseBlend";
	}
	
	@Override
	public double cost() {
		WeakHashMap<String, String> map = new WeakHashMap<String, String>();
		ConcurrentHashMap<String, String> map2 = new ConcurrentHashMap<String, String>();
		return 12;
		
		
	}

}
