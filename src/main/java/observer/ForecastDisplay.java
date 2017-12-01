package observer;

import java.util.Observable;
import java.util.Observer;

/** 
 * @author ant 
 * @date 创建时间：2017年11月9日 下午2:36:54  
 */
public class ForecastDisplay implements Observer {
	
	private float currentPressure = 29.92f ;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			lastPressure = this.currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}
	
	public void display() {
		System.out.println("currentPressure: " + currentPressure + " and lastPressure :" + lastPressure);
	}

}
