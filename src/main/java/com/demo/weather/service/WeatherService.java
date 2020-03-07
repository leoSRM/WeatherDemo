/**
 * 
 */
package com.demo.weather.service;

import java.util.List;

/**
 * @Description weather main service
 * @author srm
 * @Date 2020/3/7 16:23
 * @Version 1.0
 */
public interface WeatherService {
	
	/**
	 * Get city list
	 * @param 
	 * @return city list
	 */
	public List<String> getCities ();
}
