package com.capgemini.salesmanagement.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exception.InvalidProductCategoryException;
import com.capgemini.salesmanagement.exception.InvalidProductCodeException;
import com.capgemini.salesmanagement.exception.InvalidProductPriceException;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;
import com.capgemini.salesmanagement.util.CollectionUtil;

public class TestCase {
private static ISaleService services;
@BeforeClass
public static void setUpTestEnv() {
	services=new SaleService();
}
@Before
public void setUpTestData() {
	LocalDate localdate=LocalDate.now();
	Sale sale1=new Sale(101,1001,"TV","Electronics",localdate,2,40000);
	Sale sale2=new Sale(102,1002,"Soft Toy","Toys",localdate,2,6000);

	CollectionUtil.getCollection().put(101,sale1);
	CollectionUtil.getCollection().put(102,sale2);

}
	@Test(expected=InvalidProductCodeException.class)
	public void testProductCodeForInvalidId() throws InvalidProductCodeException{
		services.validateProductCode(12345);
	}
	@Test
	public void testProductCodeForValidId() throws InvalidProductCodeException{
		boolean expectedValue=true;
		boolean actualValue=services.validateProductCode(1001);
		Assert.assertEquals(expectedValue,actualValue);
	}
	@Test(expected=InvalidProductCategoryException.class)
	public void testProductCategoryForInvalidInput() throws InvalidProductCategoryException{
		services.validateProductCat("Grocery");
	}
	@Test
	public void testProductCategoryForValidInput() throws InvalidProductCategoryException{
		boolean expectedValue=true;
		boolean actualValue=services.validateProductCat("Electronics");
		Assert.assertEquals(expectedValue,actualValue);
	}
	@Test(expected=InvalidProductPriceException.class)
	public void testProductPriceForInvalidInput() throws InvalidProductPriceException{
		services.validateProductPrice(100);
	}
	@Test
	public void testProductPriceForValidInput() throws InvalidProductPriceException{
		boolean expectedValue=true;
		boolean actualValue=services.validateProductPrice(1000);
		Assert.assertEquals(expectedValue,actualValue);
	}
	@After
	public void tearDownTestData() {
		CollectionUtil.getCollection().clear();
	}
	
	@AfterClass
	public static void tearDownTestEnv() {
		services = null ;
	}

}
