package com.capgemini.salesmanagement.services;

import java.util.HashMap;

import com.capgemini.salesmanagement.beans.Sale;
import com.capgemini.salesmanagement.exceptions.InvalidProductCategoryException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductNameException;
import com.capgemini.salesmanagement.exceptions.InvalidProductPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidProductQuantityException;

public interface ISaleService {
public HashMap<Integer, Sale>insertSalesDetails(Sale sale);
boolean validateProductCode(int productId)throws InvalidProductCodeException;
boolean validateProductCategory(String productCat)throws InvalidProductCategoryException;
boolean validateProductPrice(int productPrice)throws InvalidProductPriceException;
boolean validateProducctQuantity(int productquantity)throws InvalidProductQuantityException;
boolean validateProductName(String productName)throws InvalidProductNameException;

}
