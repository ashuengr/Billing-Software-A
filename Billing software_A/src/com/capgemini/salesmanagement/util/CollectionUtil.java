package com.capgemini.salesmanagement.util;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.salesmanagement.bean.Sale;

public class CollectionUtil {
private static Map<Integer,Sale>sales=new HashMap<Integer,Sale>();

public static HashMap<Integer,Sale> getCollection() {
	return (HashMap<Integer, Sale>) sales;
}
public static int generateSaleId()
{
	return (int)(Math.random()*10000);
}

}
