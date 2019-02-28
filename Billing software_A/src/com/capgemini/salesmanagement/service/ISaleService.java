package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exception.InvalidProductCategoryException;
import com.capgemini.salesmanagement.exception.InvalidProductCodeException;
import com.capgemini.salesmanagement.exception.InvalidProductNameException;
import com.capgemini.salesmanagement.exception.InvalidProductPriceException;
import com.capgemini.salesmanagement.exception.InvalidProductQuantityException;

public interface ISaleService {
public HashMap<Integer,Sale>insertSaleDetails(Sale sale);
public boolean validateProductCode(int productId) throws InvalidProductCodeException;
public boolean validateQuantity(int qty) throws InvalidProductQuantityException;
public boolean validateProductCat(String prodCat) throws InvalidProductCategoryException;
public boolean validateProductName(String prodName) throws InvalidProductNameException;
public boolean validateProductPrice(float price) throws InvalidProductPriceException;

}
