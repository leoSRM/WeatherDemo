/**
 * 
 */
package com.demo.weather.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.demo.weather.service.WeatherService;

/**
 * @Description weather service implement
 * @author srm
 * @Date 2020/3/7 16:28
 * @Version 1.0
 */
@Service
public class WeatherServiceImpl implements WeatherService {
	
	@Value("#{'${cities}'.split(',')}")
	private List<String> cities;

	public List<String> getCities() {
		return cities;
	}

}
