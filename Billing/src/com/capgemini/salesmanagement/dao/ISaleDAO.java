package com.capgemini.salesmanagement.dao;

import java.util.HashMap;

import com.capgemini.salesmanagement.beans.Sale;

public interface ISaleDAO {
public HashMap<Integer, Sale>insertSalesDEtails(Sale sale);
}
