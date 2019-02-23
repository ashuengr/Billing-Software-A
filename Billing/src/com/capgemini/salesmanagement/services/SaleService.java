package com.capgemini.salesmanagement.services;

import java.util.HashMap;


import com.capgemini.salesmanagement.beans.Sale;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.exceptions.InvalidProductCategoryException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductNameException;
import com.capgemini.salesmanagement.exceptions.InvalidProductPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidProductQuantityException;

public class SaleService implements ISaleService {
ISaleDAO saleDao=new SaleDAO();
	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
		return saleDao.insertSalesDEtails(sale);
		
	}

	@Override
	public boolean validateProductCode(int productId) throws InvalidProductCodeException {
		if((productId<=1005)&&(productId>=1001)) {
			return true;
		}
		else throw new InvalidProductCodeException("invalid product code");
	}

	@Override
	public boolean validateProductCategory(String productCat) throws InvalidProductCategoryException {
		if(productCat.equalsIgnoreCase("Electronics")||productCat.equalsIgnoreCase("Toys")) {
			return true;
		}
		else throw new InvalidProductCategoryException("invalid product category");
	}
	
	@Override
	public boolean validateProductPrice(int productPrice) throws InvalidProductPriceException {
		if(productPrice>=200) {
			return true;
		}
		else throw new InvalidProductPriceException("not valid price");
	}

	@Override
	public boolean validateProducctQuantity(int productquantity) throws InvalidProductQuantityException {
	if((productquantity<=5)&&(productquantity>=2)) {
		return true;
	}
	else throw new InvalidProductQuantityException("not valid quantity");
	}

	@Override
	public boolean validateProductName(String productName) throws InvalidProductNameException {
		if(productName.equalsIgnoreCase("Iphone")||productName.equalsIgnoreCase("Led")||productName.equalsIgnoreCase("telescope")||productName.equalsIgnoreCase("teddy")||productName.equalsIgnoreCase("barbie")) {
			return true;
		}
		else throw new InvalidProductNameException("invalid product name");
	}

	

	
}
