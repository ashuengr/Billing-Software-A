package com.capgemini.salesmanagement.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.capgemini.salesmanagement.beans.Sale;
import com.capgemini.salesmanagement.exceptions.InvalidProductCategoryException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductNameException;
import com.capgemini.salesmanagement.exceptions.InvalidProductPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidProductQuantityException;
import com.capgemini.salesmanagement.services.ISaleService;
import com.capgemini.salesmanagement.services.SaleService;
import com.capgemini.salesmanagement.util.CollectionUtil;

public class Client {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		ISaleService services=new SaleService();
		boolean flag=true;
		while(flag=true) 
		{
		 System.out.println("_____________Billing software___________");
		 System.out.println("1.Enter product Details/n2.Exit");
		 System.out.println("Enter your choice");
		 int ch=sc.nextInt();
		 switch(ch) {
	case 1:
		System.out.println(" Enter the Product Id");
		int prodId=sc.nextInt();
		try {
			services.validateProductCode(prodId);
		} catch (InvalidProductCodeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Enter product category");
		String category=sc.next();
		try {
			services.validateProductCategory(category);
		} catch (InvalidProductCategoryException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Enter Product Name");
		String name=sc.next();
		try {
			services.validateProductName(name);
		} catch (InvalidProductNameException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Enter product Price");
		int price=sc.nextInt();
		try {
			services.validateProductPrice(price);
		} catch (InvalidProductPriceException e) {
		System.out.println(e.getMessage());
		}
		System.out.println("enter product quantity");
		int quantity=sc.nextInt();
		try {
			services.validateProducctQuantity(quantity);
		} catch (InvalidProductQuantityException e) {
			System.out.println(e.getMessage());
		}
		float lineTotal=(quantity*price);
		LocalDate saleDate;
		Sale sale=new Sale(prodId, name, category, quantity,LocalDate.now(),lineTotal);
		
		
		
		services.insertSalesDetails(sale);
		System.out.println(CollectionUtil.getCollection()); 
		break;
	case 2:
		System.out.println("exiting from billing software application");
		flag=false;
		break;
	default:System.out.println("Please choose a valid option");
	}	
 }
}
}
