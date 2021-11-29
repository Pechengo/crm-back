package com.caece.crm.Sale;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="sale")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int idsale;
	public int idclient;
	public int idproduct;
	public int quantity;
	public int sale_price;
	public Date sale_date;
	
	public int getIdsale() {
		return idsale;
	}
	public void setIdsale(int idsale) {
		this.idsale = idsale;
	}
	public int getIdclient() {
		return idclient;
	}
	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}
	public int getIdproduct() {
		return idproduct;
	}
	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSale_price() {
		return sale_price;
	}
	public void setSale_price(int sale_price) {
		this.sale_price = sale_price;
	}
	public Date getSale_date() {
		return sale_date;
	}
	public void setSale_date(Date sale_date) {
		this.sale_date = sale_date;
	}
}
