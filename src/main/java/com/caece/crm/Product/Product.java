package com.caece.crm.Product;

import javax.persistence.*;


@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int idproduct;
	public String desc_product;
	public double price_product;
	public int getIdproduct() {
		return idproduct;
	}
	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}
	public String getDesc_product() {
		return desc_product;
	}
	public void setDesc_product(String desc_product) {
		this.desc_product = desc_product;
	}
	public double getPrice_product() {
		return price_product;
	}
	public void setPrice_product(double price_product) {
		this.price_product = price_product;
	}
	
	
}
