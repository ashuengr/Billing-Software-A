package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.exception.InvalidProductCategoryException;
import com.capgemini.salesmanagement.exception.InvalidProductCodeException;
import com.capgemini.salesmanagement.exception.InvalidProductNameException;
import com.capgemini.salesmanagement.exception.InvalidProductPriceException;
import com.capgemini.salesmanagement.exception.InvalidProductQuantityException;

public class SaleService implements ISaleService{
	String prodCategory = null;
	ISaleDAO dao=new SaleDAO();
	@Override
	public HashMap<Integer, Sale> insertSaleDetails(Sale sale) {
		return dao.insertSaleDetails(sale);
	}

	@Override
	public boolean validateProductCode(int productId)throws InvalidProductCodeException{
		if(productId>=1001 && productId<=1004)
		 return true;
		else
		  throw new InvalidProductCodeException("product code is not valid");
	}

	@Override
	public boolean validateQuantity(int qty)throws InvalidProductQuantityException {
		if(qty>0 && qty<5)
		return true;
		else
			throw new InvalidProductQuantityException("product quantity is not valid");
	}

	@Override
	public boolean validateProductCat(String prodCat) throws InvalidProductCategoryException{
		prodCategory=prodCat;
		if(prodCat.equalsIgnoreCase("Electronics")||prodCat.equalsIgnoreCase("Toys"))
		return true;
		else
			throw new InvalidProductCategoryException("Invalid product category");
	}

	@Override
	public boolean validateProductName(String prodName) throws InvalidProductNameException {

		if((prodCategory.equalsIgnoreCase("Electronics"))&& (prodName.equalsIgnoreCase("Tv")||prodName.equalsIgnoreCase("Smart Phone")||prodName.equalsIgnoreCase("video Game")))
         return true;
		else if((prodCategory.equalsIgnoreCase("Toys")) && (prodName.equalsIgnoreCase("Soft Toy")||prodName.equalsIgnoreCase("Telescope")||prodName.equalsIgnoreCase("Barbee Doll")))
		 return true;
		else throw new InvalidProductNameException("product name is not valid");
	}

	@Override
	public boolean validateProductPrice(float price) throws InvalidProductPriceException {
		if(price >200)
			return true;
		else
			throw new InvalidProductPriceException("product price is not valid");
	}

}
