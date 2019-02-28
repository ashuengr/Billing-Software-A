package com.capgemini.salesmanagement.dao;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.util.CollectionUtil;

public class SaleDAO implements ISaleDAO{

	@Override
	public HashMap<Integer, Sale> insertSaleDetails(Sale sale) {
	 sale.setSaleId(CollectionUtil.generateSaleId());
	 CollectionUtil.getCollection().put(sale.getSaleId(),sale);
	return CollectionUtil.getCollection();
	}

}
