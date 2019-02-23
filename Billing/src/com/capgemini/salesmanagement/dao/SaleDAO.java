package com.capgemini.salesmanagement.dao;

import java.util.HashMap;

import com.capgemini.salesmanagement.beans.Sale;
import com.capgemini.salesmanagement.util.CollectionUtil;

public class SaleDAO implements ISaleDAO{

	@Override
	public HashMap<Integer, Sale> insertSalesDEtails(Sale sale) {
		sale.setSaleId(CollectionUtil.getSaleID());
		CollectionUtil.getCollection().put(sale.getSaleId(), sale);
		return CollectionUtil.getCollection();
	}

}
