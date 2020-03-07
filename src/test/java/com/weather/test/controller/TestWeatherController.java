/**
 * 
 */
package com.weather.test.controller;

import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.weather.test.base.BaseTest;

/**
 * @author srm
 * @Date 2020/3/7 22:26
 */
@WebAppConfiguration
public class TestWeatherController extends BaseTest{
	@Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void index() throws Exception {
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/weather/index.html");
        ResultActions resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
        MvcResult mvcResult = resultActions.andReturn();
        String result = null;
        try {
            result = mvcResult.getResponse().getContentAsString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("=====Respons:" + result);
    }
}
