package com.capgemini.salesmanagement.util;

import java.util.HashMap;
import java.util.Random;

import com.capgemini.salesmanagement.beans.Sale;

public class CollectionUtil {
private static HashMap<Integer, Sale>sales=new HashMap<Integer, Sale>();
public static HashMap<Integer, Sale>getCollection(){
	return sales;
}
	public static int getSaleID() {
		return (int) Math.pow(5, 4)+new Random().nextInt(5000);
	}
}

