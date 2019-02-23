package com.capgemini.salesmanagement.beans;

import java.time.LocalDate;

public class Sale {
private int prodCode;
private String productName;
private int saleId;
private String category;
private int quantity;
private LocalDate saleDate;
private float lineTotal;
public Sale() {}
public Sale(int prodCode, String productName, int saleId, String category, int quantity, LocalDate saleDate,
		float lineTotal) {
	super();
	this.prodCode = prodCode;
	this.productName = productName;
	this.saleId = saleId;
	this.category = category;
	this.quantity = quantity;
	this.saleDate = saleDate;
	this.lineTotal = lineTotal;

}
public Sale(int prodCode, String productName, String category, int quantity, float lineTotal) {
	super();
	this.prodCode = prodCode;
	this.productName = productName;
	this.category = category;
	this.quantity = quantity;
	this.lineTotal = lineTotal;
}
 
public Sale(int prodCode, String productName, String category, int quantity, LocalDate saleDate, float lineTotal) {
	super();
	this.prodCode = prodCode;
	this.productName = productName;
	this.category = category;
	this.quantity = quantity;
	this.saleDate = saleDate;
	this.lineTotal = lineTotal;
}
public int getProdCode() {
	return prodCode;
}
public void setProdCode(int prodCode) {
	this.prodCode = prodCode;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getSaleId() {
	return saleId;
}
public void setSaleId(int saleId) {
	this.saleId = saleId;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public LocalDate getSaleDate() {
	return saleDate;
}
public void setSaleDate(LocalDate saleDate) {
	this.saleDate = saleDate;
}
public float getLineTotal() {
	return lineTotal;
}
public void setLineTotal(float lineTotal) {
	this.lineTotal = lineTotal;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((category == null) ? 0 : category.hashCode());
	result = prime * result + Float.floatToIntBits(lineTotal);
	result = prime * result + prodCode;
	result = prime * result + ((productName == null) ? 0 : productName.hashCode());
	result = prime * result + quantity;
	result = prime * result + ((saleDate == null) ? 0 : saleDate.hashCode());
	result = prime * result + saleId;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Sale other = (Sale) obj;
	if (category == null) {
		if (other.category != null)
			return false;
	} else if (!category.equals(other.category))
		return false;
	if (Float.floatToIntBits(lineTotal) != Float.floatToIntBits(other.lineTotal))
		return false;
	if (prodCode != other.prodCode)
		return false;
	if (productName == null) {
		if (other.productName != null)
			return false;
	} else if (!productName.equals(other.productName))
		return false;
	if (quantity != other.quantity)
		return false;
	if (saleDate == null) {
		if (other.saleDate != null)
			return false;
	} else if (!saleDate.equals(other.saleDate))
		return false;
	if (saleId != other.saleId)
		return false;
	return true;
}
@Override
public String toString() {
	return "Sale [prodCode=" + prodCode + ", productName=" + productName + ", saleId=" + saleId + ", category="
			+ category + ", quantity=" + quantity + ", saleDate=" + saleDate + ", lineTotal=" + lineTotal + "]";
}


}
