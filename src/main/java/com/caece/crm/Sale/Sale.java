package com.caece.crm.Sale;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="sale")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idsale")
	public Integer idSale;
	@Column(name = "idclient")
	public Integer idClient;
	@Column(name = "idproduct")
	public Integer idProduct;
	@Column(name = "quantity")
	public Integer quantity;
	@Column(name = "sale_price")
	public Integer salePrice;
	@Column(name = "sale_date")
	public Date saleDate;
	public Integer getIdSale() {
		return idSale;
	}
	public void setIdSale(int idSale) {
		this.idSale = idSale;
	}
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public Integer getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Integer getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	
	
}
