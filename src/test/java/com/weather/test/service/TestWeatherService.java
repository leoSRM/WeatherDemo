/**
 * 
 */
package com.weather.test.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.weather.service.WeatherService;
import com.weather.test.base.BaseTest;

/**
 * @author srm
 * @Date 2020/3/7 23:40
 */
public class TestWeatherService extends BaseTest{
	@Autowired
	private WeatherService weatherService;

    @Test
    public void testGetCities(){
        List<String> testItem = weatherService.getCities();
        assertThat(testItem.size(), is(3));
        assertThat(testItem, not(IsEmptyCollection.empty()));

    }
}
