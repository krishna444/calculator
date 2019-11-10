package com.kpaudel.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * Test class for Calculator Rest Controller
 */
@RunWith(SpringRunner.class)
@WebMvcTest(value = RestCalculatorController.class)
public class RestCalculatorControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CalculatorService calculatorService;

    @Before
    public void init() {
        Mockito.when(calculatorService.add(12.11, 45.22)).thenReturn(57.33);
        Mockito.when(calculatorService.subtract(12.11, 45.22)).thenReturn(-33.11);
        Mockito.when(calculatorService.multiply(12.11, 45.22)).thenReturn(547.6142);
        Mockito.when(calculatorService.divide(45.66, 1.2)).thenReturn(38.05);
        Mockito.when(calculatorService.square(24.55)).thenReturn(602.7025);
        Mockito.when(calculatorService.factorial(5)).thenReturn(120L);
        Mockito.when(calculatorService.isPrime(23)).thenReturn(true);
        Mockito.when(calculatorService.isPrime(25)).thenReturn(false);
    }

    @Test
    public void testAdd() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/add/12.11/45.22").accept(MediaType.APPLICATION_JSON);
        MvcResult result = this.mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());
        String expected = "57.33";
        Assert.assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void testSubtract() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/subtract/12.11/45.22").accept(MediaType.APPLICATION_JSON);
        MvcResult result = this.mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());
        String expected = "-33.11";
        Assert.assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void testMultiply() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/multiply/12.11/45.22").accept(MediaType.APPLICATION_JSON);
        MvcResult result = this.mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());
        String expected = "547.6142";
        Assert.assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void testDivide() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/divide/45.66/1.2").accept(MediaType.APPLICATION_JSON);
        MvcResult result = this.mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());
        String expected = "38.05";
        Assert.assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void testSquare() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/square/24.55").accept(MediaType.APPLICATION_JSON);
        MvcResult result = this.mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());
        String expected = "602.7025";
        Assert.assertEquals(expected, result.getResponse().getContentAsString());
    }


    @Test
    public void testFactorial() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/factorial/5").accept(MediaType.APPLICATION_JSON);
        MvcResult result = this.mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());
        String expected = "120";
        Assert.assertEquals(expected, result.getResponse().getContentAsString());
    }

    @Test
    public void testPrime() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/prime/23").accept(MediaType.APPLICATION_JSON);
        MvcResult result = this.mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse());
        String expected = "true";
        Assert.assertEquals(expected, result.getResponse().getContentAsString());

        requestBuilder=MockMvcRequestBuilders.get("/prime/25").accept(MediaType.APPLICATION_JSON);
        result=this.mockMvc.perform(requestBuilder).andReturn();
        expected="false";
        Assert.assertEquals(expected,result.getResponse().getContentAsString());
    }




}
