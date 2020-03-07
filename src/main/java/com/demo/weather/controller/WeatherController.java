/**
 * 
 */
package com.demo.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.weather.service.WeatherService;

/**
 * @Description weather main controller
 * @author srm
 * @Date 2020/3/7 16:18
 * @Version 1.0
 */
@Controller
@RequestMapping(value = "/weather/")
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;

	@RequestMapping(value = "index")
	public ModelAndView index () {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("weather/index");
		modelAndView.addObject("cities", weatherService.getCities());
		return modelAndView;
	}
}
